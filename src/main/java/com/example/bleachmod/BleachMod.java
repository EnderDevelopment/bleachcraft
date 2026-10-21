package com.example.bleachmod;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BleachMod implements ModInitializer {
    public static final String MOD_ID = "bleach_mod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("Initializing Bleach Mod");
        // Initialize mod components here
    }
}