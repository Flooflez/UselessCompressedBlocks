package net.useless.compressed.blocks.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.NoteBlock;
import net.minecraft.block.entity.BlockEntity;
import net.minecraft.block.entity.SkullBlockEntity;
import net.minecraft.block.enums.Instrument;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.sound.SoundCategory;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import org.jetbrains.annotations.Nullable;

public class CompressedNoteBlock extends NoteBlock {
    int compression;

    public CompressedNoteBlock(float hardness, float resistance, int compression) {
        super(Settings.copy(Blocks.NOTE_BLOCK).strength(hardness, resistance));
        this.compression = compression;
    }

    @Override
    public boolean onSyncedBlockEvent(BlockState state, World world, BlockPos pos, int type, int data) {
        Instrument instrument = (Instrument) state.get(INSTRUMENT);
        float base = 1f;

        RegistryEntry registryEntry;
        if (instrument.hasCustomSound()) {
            Identifier identifier = this.getCustomSound(world, pos);
            if (identifier == null) {
                return false;
            }
            registryEntry = RegistryEntry.of(SoundEvent.of(identifier));
        } else {
            registryEntry = instrument.getSound();
        }

        if (instrument.shouldSpawnNoteParticles()) { // is instrument
            int i = (Integer) state.get(NOTE);
            int[] intervals = {4, 7, -5, -8, 12, -12 , 2, -10};
            base = (float) Math.pow(2.0D, (double) (i - 12) / 12.0D);
            for (int j = 0; j < compression; j++) {
                if(i+intervals[j] > 0 && i+intervals[j] < 24){
                    float temp = (float) Math.pow(2.0D, (double) (i - 12 + intervals[j]) / 12.0D);
                    world.playSound((PlayerEntity) null, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, registryEntry, SoundCategory.RECORDS, 2.5f - (j*0.2f), temp, world.random.nextLong());
                }
            }
            world.addParticle(ParticleTypes.NOTE, (double) pos.getX() + 0.5D, (double) pos.getY() + 1.2D, (double) pos.getZ() + 0.5D, (double) i / 24.0D, 0.0D, 0.0D);
        }

        world.playSound((PlayerEntity) null, (double) pos.getX() + 0.5D, (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D, registryEntry, SoundCategory.RECORDS, 3.0F, base, world.random.nextLong());

        return true;
    }

    @Nullable
    private Identifier getCustomSound(World world, BlockPos pos) {
        BlockEntity var4 = world.getBlockEntity(pos.up());
        if (var4 instanceof SkullBlockEntity) {
            SkullBlockEntity skullBlockEntity = (SkullBlockEntity) var4;
            return skullBlockEntity.getNoteBlockSound();
        } else {
            return null;
        }
    }
}
