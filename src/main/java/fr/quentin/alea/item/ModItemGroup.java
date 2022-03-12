package fr.quentin.alea.item;

import fr.quentin.alea.Alea;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroup {
    public static final ItemGroup BUILDING_BLOCKS = FabricItemGroupBuilder.build(new Identifier(Alea.MOD_ID, "building_blocks"),
            () -> new ItemStack(Blocks.BRICKS));
}
