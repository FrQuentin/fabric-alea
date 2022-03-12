package fr.quentin.alea.util;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModTags {
    public static void setBlockTags() {
        final TagKey<Block> TERRACOTTA_SHINGLES = TagKey.of(Registry.BLOCK_KEY, new Identifier("alea", "terracotta_shingles"));
    }

    public static void setItemTags() {
        final TagKey<Item> TERRACOTTA_SHINGLES = TagKey.of(Registry.ITEM_KEY, new Identifier("alea", "terracotta_shingles"));
    }
}
