package fr.quentin.alea.block;

import fr.quentin.alea.Alea;
import fr.quentin.alea.item.ModItemGroup;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlocks {


    // Terracotta Shingles
    public static final Block TERRACOTTA_SHINGLES = registerBlock("terracotta_shingles",
            new Block(FabricBlockSettings.copy(Blocks.TERRACOTTA).sounds(BlockSoundGroup.DEEPSLATE_TILES)),
            ModItemGroup.BUILDING_BLOCKS);

    public static final Block WHITE_TERRACOTTA_SHINGLES = registerBlock("white_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block ORANGE_TERRACOTTA_SHINGLES = registerBlock("orange_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block MAGENTA_TERRACOTTA_SHINGLES = registerBlock("magenta_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES = registerBlock("light_blue_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block YELLOW_TERRACOTTA_SHINGLES = registerBlock("yellow_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIME_TERRACOTTA_SHINGLES = registerBlock("lime_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PINK_TERRACOTTA_SHINGLES = registerBlock("pink_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GRAY_TERRACOTTA_SHINGLES = registerBlock("gray_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES = registerBlock("light_gray_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block CYAN_TERRACOTTA_SHINGLES = registerBlock("cyan_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PURPLE_TERRACOTTA_SHINGLES = registerBlock("purple_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLUE_TERRACOTTA_SHINGLES = registerBlock("blue_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BROWN_TERRACOTTA_SHINGLES = registerBlock("brown_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GREEN_TERRACOTTA_SHINGLES = registerBlock("green_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block RED_TERRACOTTA_SHINGLES = registerBlock("red_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLACK_TERRACOTTA_SHINGLES = registerBlock("black_terracotta_shingles",
            new Block(FabricBlockSettings.copy(ModBlocks.TERRACOTTA_SHINGLES)), ModItemGroup.BUILDING_BLOCKS);


    // Fungal Planks
    public static final Block FUNGAL_PLANKS = registerBlock("fungal_planks",
            new Block(FabricBlockSettings.copy(Blocks.OAK_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block WHITE_FUNGAL_PLANKS = registerBlock("white_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block ORANGE_FUNGAL_PLANKS = registerBlock("orange_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block MAGENTA_FUNGAL_PLANKS = registerBlock("magenta_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_BLUE_FUNGAL_PLANKS = registerBlock("light_blue_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block YELLOW_FUNGAL_PLANKS = registerBlock("yellow_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIME_FUNGAL_PLANKS = registerBlock("lime_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PINK_FUNGAL_PLANKS = registerBlock("pink_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GRAY_FUNGAL_PLANKS = registerBlock("gray_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_GRAY_FUNGAL_PLANKS = registerBlock("light_gray_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block CYAN_FUNGAL_PLANKS = registerBlock("cyan_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PURPLE_FUNGAL_PLANKS = registerBlock("purple_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLUE_FUNGAL_PLANKS = registerBlock("blue_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BROWN_FUNGAL_PLANKS = registerBlock("brown_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GREEN_FUNGAL_PLANKS = registerBlock("green_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block RED_FUNGAL_PLANKS = registerBlock("red_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLACK_FUNGAL_PLANKS = registerBlock("black_fungal_planks",
            new Block(FabricBlockSettings.copy(ModBlocks.FUNGAL_PLANKS)), ModItemGroup.BUILDING_BLOCKS);


    // Concrete Bricks
    public static final Block WHITE_CONCRETE_BRICKS = registerBlock("white_concrete_bricks",
            new Block(FabricBlockSettings.copy(Blocks.BRICKS).sounds(BlockSoundGroup.DEEPSLATE_BRICKS)),
            ModItemGroup.BUILDING_BLOCKS);

    public static final Block ORANGE_CONCRETE_BRICKS = registerBlock("orange_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block MAGENTA_CONCRETE_BRICKS = registerBlock("magenta_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_BLUE_CONCRETE_BRICKS = registerBlock("light_blue_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block YELLOW_CONCRETE_BRICKS = registerBlock("yellow_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIME_CONCRETE_BRICKS = registerBlock("lime_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PINK_CONCRETE_BRICKS = registerBlock("pink_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GRAY_CONCRETE_BRICKS = registerBlock("gray_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_GRAY_CONCRETE_BRICKS = registerBlock("light_gray_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block CYAN_CONCRETE_BRICKS = registerBlock("cyan_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PURPLE_CONCRETE_BRICKS = registerBlock("purple_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLUE_CONCRETE_BRICKS = registerBlock("blue_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BROWN_CONCRETE_BRICKS = registerBlock("brown_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GREEN_CONCRETE_BRICKS = registerBlock("green_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block RED_CONCRETE_BRICKS = registerBlock("red_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLACK_CONCRETE_BRICKS = registerBlock("black_concrete_bricks",
            new Block(FabricBlockSettings.copy(ModBlocks.WHITE_CONCRETE_BRICKS)), ModItemGroup.BUILDING_BLOCKS);


    // -----------------------------------------------------------------------------------------------------------------

    private static Block registerBlock(String name, Block block, ItemGroup itemGroup) {
        registerBlockItem(name, block, itemGroup);
        return Registry.register(Registry.BLOCK, new Identifier(Alea.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup itemGroup) {
        return Registry.register(Registry.ITEM, new Identifier(Alea.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(itemGroup)));
    }

    public static void registerModBlocks() {
        Alea.LOGGER.info("Registering Mod Blocks");
    }
}
