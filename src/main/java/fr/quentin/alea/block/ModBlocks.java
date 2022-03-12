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
    public static final Block TERRACOTTA_SHINGLES = registerBlock("terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block WHITE_TERRACOTTA_SHINGLES = registerBlock("white_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block ORANGE_TERRACOTTA_SHINGLES = registerBlock("orange_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block MAGENTA_TERRACOTTA_SHINGLES = registerBlock("magenta_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_BLUE_TERRACOTTA_SHINGLES = registerBlock("light_blue_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block YELLOW_TERRACOTTA_SHINGLES = registerBlock("yellow_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIME_TERRACOTTA_SHINGLES = registerBlock("lime_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PINK_TERRACOTTA_SHINGLES = registerBlock("pink_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GRAY_TERRACOTTA_SHINGLES = registerBlock("gray_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block LIGHT_GRAY_TERRACOTTA_SHINGLES = registerBlock("light_gray_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block CYAN_TERRACOTTA_SHINGLES = registerBlock("cyan_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block PURPLE_TERRACOTTA_SHINGLES = registerBlock("purple_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLUE_TERRACOTTA_SHINGLES = registerBlock("blue_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BROWN_TERRACOTTA_SHINGLES = registerBlock("brown_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block GREEN_TERRACOTTA_SHINGLES = registerBlock("green_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block RED_TERRACOTTA_SHINGLES = registerBlock("red_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);

    public static final Block BLACK_TERRACOTTA_SHINGLES = registerBlock("black_terracotta_shingles",
            new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(1.25F, 4.2F)
                    .sounds(BlockSoundGroup.DEEPSLATE_TILES)), ModItemGroup.BUILDING_BLOCKS);


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
