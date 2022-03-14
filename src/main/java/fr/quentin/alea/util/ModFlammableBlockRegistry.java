package fr.quentin.alea.util;

import fr.quentin.alea.block.ModBlocks;
import net.fabricmc.fabric.api.registry.FlammableBlockRegistry;

public class ModFlammableBlockRegistry {
    public static void setFlammableBlockRegistry() {
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.WHITE_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.ORANGE_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.MAGENTA_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_BLUE_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.YELLOW_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIME_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PINK_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GRAY_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.LIGHT_GRAY_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.CYAN_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.PURPLE_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLUE_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BROWN_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.GREEN_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.RED_FUNGAL_PLANKS, 20, 5);
        FlammableBlockRegistry.getDefaultInstance().add(ModBlocks.BLACK_FUNGAL_PLANKS, 20, 5);
    }
}
