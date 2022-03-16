package fr.quentin.alea.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> TERRACOTTA_SHINGLES = TagKey.of(Registry.ITEM_KEY, new Identifier("alea", "terracotta_shingles"));
    public static final TagKey<Item> MUSHROOM_STEM = TagKey.of(Registry.ITEM_KEY, new Identifier("alea", "mushroom_stem"));
    public static final TagKey<Item> FUNGAL_PLANKS = TagKey.of(Registry.ITEM_KEY, new Identifier("alea", "fungal_planks"));
    public static final TagKey<Item> CONCRETE_BRICKS = TagKey.of(Registry.ITEM_KEY, new Identifier("alea", "concrete_bricks"));
}
