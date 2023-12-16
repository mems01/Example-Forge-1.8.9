package com.example

import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(modid = ExampleMod.MOD_ID, version = ExampleMod.MOD_VERSION, name = ExampleMod.MOD_NAME, clientSideOnly = true)
class ExampleMod {
    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        logger.info("Hello, Minecraft!")
    }

    companion object {
        const val MOD_ID: String = "@MOD_ID@"
        const val MOD_VERSION: String = "@MOD_VERSION@"
        const val MOD_NAME: String = "@MOD_NAME@"
        val logger: Logger = LogManager.getLogger(MOD_NAME)
    }
}
