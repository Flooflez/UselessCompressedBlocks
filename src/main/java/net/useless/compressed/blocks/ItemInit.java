package net.useless.compressed.blocks;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.useless.compressed.blocks.blocks.CompressedBlock;
import net.useless.compressed.blocks.blocks.CompressedCraftingTable;

public class ItemInit {

    public static final CompressedCraftingTable COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(2f,3f);
    public static final CompressedCraftingTable DOUBLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(4f,6f);
    public static final CompressedCraftingTable TRIPLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(6f,12f);
    public static final CompressedCraftingTable QUADRUPLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(8f,35f);
    public static final CompressedCraftingTable QUINTUPLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(10f,50f);
    public static final CompressedCraftingTable SEXTUPLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(15f,50f);
    public static final CompressedCraftingTable SEPTUPLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(20f,50f);
    public static final CompressedCraftingTable OCTUPLE_COMPRESSED_CRAFTING_TABLE = new CompressedCraftingTable(25f,1200f);

    public static final CompressedBlock COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(2f, 3f));
    public static final CompressedBlock DOUBLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(4f, 6f));
    public static final CompressedBlock TRIPLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(6f, 12f));
    public static final CompressedBlock QUADRUPLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(8f, 35f));
    public static final CompressedBlock QUINTUPLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(10f, 50f));
    public static final CompressedBlock SEXTUPLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(15f, 50f));
    public static final CompressedBlock SEPTUPLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(20f, 50f));
    public static final CompressedBlock OCTUPLE_COMPRESSED_FLETCHING_TABLE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.FLETCHING_TABLE).strength(25f, 1200f));
    //compressed trap doors, stairs

    public static final CompressedBlock COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(2f, 12f));
    public static final CompressedBlock DOUBLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(4f, 30f));
    public static final CompressedBlock TRIPLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(6f, 50f));
    public static final CompressedBlock QUADRUPLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(8f, 75f));
    public static final CompressedBlock QUINTUPLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(10f, 75f));
    public static final CompressedBlock SEXTUPLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(15f, 100f));
    public static final CompressedBlock SEPTUPLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(20f, 250f));
    public static final CompressedBlock OCTUPLE_COMPRESSED_PURPUR_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.PURPUR_BLOCK).strength(25f, 1200f));

    public static final CompressedBlock COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(2f, 12f));
    public static final CompressedBlock DOUBLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(4f, 30f));
    public static final CompressedBlock TRIPLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(6f, 50f));
    public static final CompressedBlock QUADRUPLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(8f, 75f));
    public static final CompressedBlock QUINTUPLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(10f, 75f));
    public static final CompressedBlock SEXTUPLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(15f, 100f));
    public static final CompressedBlock SEPTUPLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(20f, 250f));
    public static final CompressedBlock OCTUPLE_COMPRESSED_END_STONE_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.END_STONE_BRICKS).strength(25f, 1200f));

    public static final CompressedBlock COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(1f));
    public static final CompressedBlock DOUBLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(1.5f));
    public static final CompressedBlock TRIPLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(3f));
    public static final CompressedBlock QUADRUPLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(5f));
    public static final CompressedBlock QUINTUPLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(6.5f,20f));
    public static final CompressedBlock SEXTUPLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(8f,50f));
    public static final CompressedBlock SEPTUPLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(10f,75f));
    public static final CompressedBlock OCTUPLE_COMPRESSED_HONEYCOMB_BLOCK = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.HONEYCOMB_BLOCK).strength(12f,100f));

    public static final CompressedBlock COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(3f, 12f));
    public static final CompressedBlock DOUBLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(4f, 30f));
    public static final CompressedBlock TRIPLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(6f, 50f));
    public static final CompressedBlock QUADRUPLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(8f, 75f));
    public static final CompressedBlock QUINTUPLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(10f, 75f));
    public static final CompressedBlock SEXTUPLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(15f, 100f));
    public static final CompressedBlock SEPTUPLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(20f, 250f));
    public static final CompressedBlock OCTUPLE_COMPRESSED_RED_NETHER_BRICKS = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.RED_NETHER_BRICKS).strength(25f, 1200f));

    public static final CompressedBlock COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(3f, 12f));
    public static final CompressedBlock DOUBLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(4f, 30f));
    public static final CompressedBlock TRIPLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(6f, 50f));
    public static final CompressedBlock QUADRUPLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(8f, 75f));
    public static final CompressedBlock QUINTUPLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(10f, 75f));
    public static final CompressedBlock SEXTUPLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(15f, 100f));
    public static final CompressedBlock SEPTUPLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(20f, 250f));
    public static final CompressedBlock OCTUPLE_COMPRESSED_SMOOTH_STONE = new CompressedBlock(AbstractBlock.Settings.copy(Blocks.SMOOTH_STONE).strength(25f, 1200f));

    public static final ItemGroup GROUP = FabricItemGroup.builder(new Identifier(UselessCompressedBlocks.MODID, "useless_compressed_blocks"))
            .icon(() -> new ItemStack(COMPRESSED_CRAFTING_TABLE))
            .build();

    public static void init() {
        RegisterBlockAndItem("compressed_crafting_table", COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("double_compressed_crafting_table", DOUBLE_COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("triple_compressed_crafting_table", TRIPLE_COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("quadruple_compressed_crafting_table", QUADRUPLE_COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("quintuple_compressed_crafting_table", QUINTUPLE_COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("sextuple_compressed_crafting_table", SEXTUPLE_COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("septuple_compressed_crafting_table", SEPTUPLE_COMPRESSED_CRAFTING_TABLE);
        RegisterBlockAndItem("octuple_compressed_crafting_table", OCTUPLE_COMPRESSED_CRAFTING_TABLE);

        RegisterBlockAndItem("compressed_fletching_table", COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("double_compressed_fletching_table", DOUBLE_COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("triple_compressed_fletching_table", TRIPLE_COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("quadruple_compressed_fletching_table", QUADRUPLE_COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("quintuple_compressed_fletching_table", QUINTUPLE_COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("sextuple_compressed_fletching_table", SEXTUPLE_COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("septuple_compressed_fletching_table", SEPTUPLE_COMPRESSED_FLETCHING_TABLE);
        RegisterBlockAndItem("octuple_compressed_fletching_table", OCTUPLE_COMPRESSED_FLETCHING_TABLE);

        RegisterBlockAndItem("compressed_purpur_block", COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("double_compressed_purpur_block", DOUBLE_COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("triple_compressed_purpur_block", TRIPLE_COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("quadruple_compressed_purpur_block", QUADRUPLE_COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("quintuple_compressed_purpur_block", QUINTUPLE_COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("sextuple_compressed_purpur_block", SEXTUPLE_COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("septuple_compressed_purpur_block", SEPTUPLE_COMPRESSED_PURPUR_BLOCK);
        RegisterBlockAndItem("octuple_compressed_purpur_block", OCTUPLE_COMPRESSED_PURPUR_BLOCK);

        RegisterBlockAndItem("compressed_end_stone_bricks", COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("double_compressed_end_stone_bricks", DOUBLE_COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("triple_compressed_end_stone_bricks", TRIPLE_COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("quadruple_compressed_end_stone_bricks", QUADRUPLE_COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("quintuple_compressed_end_stone_bricks", QUINTUPLE_COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("sextuple_compressed_end_stone_bricks", SEXTUPLE_COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("septuple_compressed_end_stone_bricks", SEPTUPLE_COMPRESSED_END_STONE_BRICKS);
        RegisterBlockAndItem("octuple_compressed_end_stone_bricks", OCTUPLE_COMPRESSED_END_STONE_BRICKS);

        RegisterBlockAndItem("compressed_honeycomb_block", COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("double_compressed_honeycomb_block", DOUBLE_COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("triple_compressed_honeycomb_block", TRIPLE_COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("quadruple_compressed_honeycomb_block", QUADRUPLE_COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("quintuple_compressed_honeycomb_block", QUINTUPLE_COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("sextuple_compressed_honeycomb_block", SEXTUPLE_COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("septuple_compressed_honeycomb_block", SEPTUPLE_COMPRESSED_HONEYCOMB_BLOCK);
        RegisterBlockAndItem("octuple_compressed_honeycomb_block", OCTUPLE_COMPRESSED_HONEYCOMB_BLOCK);

        RegisterBlockAndItem("compressed_red_nether_bricks", COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("double_compressed_red_nether_bricks", DOUBLE_COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("triple_compressed_red_nether_bricks", TRIPLE_COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("quadruple_compressed_red_nether_bricks", QUADRUPLE_COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("quintuple_compressed_red_nether_bricks", QUINTUPLE_COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("sextuple_compressed_red_nether_bricks", SEXTUPLE_COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("septuple_compressed_red_nether_bricks", SEPTUPLE_COMPRESSED_RED_NETHER_BRICKS);
        RegisterBlockAndItem("octuple_compressed_red_nether_bricks", OCTUPLE_COMPRESSED_RED_NETHER_BRICKS);

        RegisterBlockAndItem("compressed_smooth_stone", COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("double_compressed_smooth_stone", DOUBLE_COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("triple_compressed_smooth_stone", TRIPLE_COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("quadruple_compressed_smooth_stone", QUADRUPLE_COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("quintuple_compressed_smooth_stone", QUINTUPLE_COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("sextuple_compressed_smooth_stone", SEXTUPLE_COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("septuple_compressed_smooth_stone", SEPTUPLE_COMPRESSED_SMOOTH_STONE);
        RegisterBlockAndItem("octuple_compressed_smooth_stone", OCTUPLE_COMPRESSED_SMOOTH_STONE);
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