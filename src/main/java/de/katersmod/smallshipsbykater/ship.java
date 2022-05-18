package de.katersmod.smallshipsbykater;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ship implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("modid");
    @Override
    public void onInitialize() {
        System.out.println("Ein Modd!!");
        LOGGER.info("Hello Fabric world!");
        LOGGER.info("jan Philipp war hier");
    }
}
