package de.katersmod.smallshipsbykater;

import de.katersmod.smallshipsbykater.block.ModBlocks;
import de.katersmod.smallshipsbykater.item.ModItem;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class shipbyKaterMod implements ModInitializer {
    public static final String MOD_ID = "smallshipsbykater";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    @Override
    public void onInitialize() {
        LOGGER.info("Kater Was here!");
        ModItem.registerItems();
        ModBlocks.registerModBlocks();
    }
}
