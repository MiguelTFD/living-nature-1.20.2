package com.migueltfd.livingnature;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LivingNatureMod implements ModInitializer {

    public static final String MOD_ID = "living-nature";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        LOGGER.info("hola simios");
    }
}
