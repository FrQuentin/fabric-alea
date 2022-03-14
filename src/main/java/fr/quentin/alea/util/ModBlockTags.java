package fr.quentin.alea.util;

import net.minecraft.block.Block;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockTags {
    public static final TagKey<Block> TERRACOTTA_SHINGLES = TagKey.of(Registry.BLOCK_KEY, new Identifier("alea", "terracotta_shingles"));
    public static final TagKey<Block> MUSHROOM_STEM = TagKey.of(Registry.BLOCK_KEY, new Identifier("alea", "mushroom_stem"));
    public static final TagKey<Block> FUNGAL_PLANKS = TagKey.of(Registry.BLOCK_KEY, new Identifier("alea", "fungal_planks"));
}
