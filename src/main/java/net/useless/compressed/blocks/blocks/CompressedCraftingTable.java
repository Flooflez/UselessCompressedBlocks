package net.useless.compressed.blocks.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.Blocks;

public class CompressedCraftingTable extends Block {
    public CompressedCraftingTable() {
        super(Settings.copy(Blocks.CRAFTING_TABLE));
    }
}
