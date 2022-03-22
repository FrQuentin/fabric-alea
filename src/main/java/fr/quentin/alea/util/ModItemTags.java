package fr.quentin.alea.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItemTags {
    public static final TagKey<Item> MUSHROOM_STEM = TagKey.of(Registry.ITEM_KEY, new Identifier("alea", "mushroom_stem"));
}
