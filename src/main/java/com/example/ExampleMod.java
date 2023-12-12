package com.example;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = ExampleMod.MOD_ID, version = ExampleMod.MOD_VERSION, name = ExampleMod.MOD_NAME, clientSideOnly = true)
public class ExampleMod {
    public static final String MOD_ID = "@MOD_ID@";
    public static final String MOD_VERSION = "@MOD_VERSION@";
    public static final String MOD_NAME = "@MOD_NAME@";
    public static final Logger logger = LogManager.getLogger(MOD_NAME);

    @Mod.EventHandler
    public void onInit(FMLInitializationEvent event) {
        logger.info("Hello, Minecraft!");
    }
}
