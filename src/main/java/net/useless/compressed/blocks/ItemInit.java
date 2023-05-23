package net.useless.compressed.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.useless.compressed.blocks.blocks.CompressedCraftingTable;

public class ItemInit {



    public static final CompressedCraftingTable COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable();
    //compressed trap doors, stairs

    public static final ItemGroup GROUP = FabricItemGroup.builder(new Identifier(UselessCompressedBlocks.MODID, "useless_compressed_blocks"))
            .icon(() -> new ItemStack(COMPRESSED_CRAFTING_TABLE))
            .build();

    public static void init() {
        RegisterBlockAndItem("compressed_crafting_table", COMPRESSED_CRAFTING_TABLE);


    }

    private static void RegisterBlockAndItem(String name, Block block) {
        Identifier identifier = new Identifier(UselessCompressedBlocks.MODID, name);
        Registry.register(Registries.BLOCK, identifier, block);
        BlockItem temp = new BlockItem(block, new FabricItemSettings());
        Registry.register(Registries.ITEM, identifier,temp );
        ItemGroupEvents.modifyEntriesEvent(GROUP).register(content -> {
            content.add(block);
            content.add(temp);
        });

    }

}