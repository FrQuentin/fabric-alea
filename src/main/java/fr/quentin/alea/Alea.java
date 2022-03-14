package fr.quentin.alea;

import fr.quentin.alea.block.ModBlocks;
import fr.quentin.alea.util.ModFlammableBlockRegistry;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Alea implements ModInitializer {
	public static final String MOD_ID = "alea";
	public static final Logger LOGGER = LoggerFactory.getLogger("Alea");

	@Override
	public void onInitialize() {
		ModBlocks.registerModBlocks();
		ModFlammableBlockRegistry.setFlammableBlockRegistry();
	}
}
