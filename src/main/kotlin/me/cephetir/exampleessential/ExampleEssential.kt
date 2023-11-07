package me.cephetir.exampleessential

import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent
import net.minecraftforge.fml.common.gameevent.TickEvent.ClientTickEvent
import org.apache.logging.log4j.LogManager
import org.apache.logging.log4j.Logger

@Mod(
    modid = "exampleessential",
    name = "ExampleEssential",
    version = "1.0",
    acceptedMinecraftVersions = "[1.8.9]",
    modLanguageAdapter = "gg.essential.api.utils.KotlinAdapter",
    clientSideOnly = true
)
object ExampleEssential {
    private val logger: Logger = LogManager.getLogger("ExampleEssential")

    @Mod.EventHandler
    fun onInit(event: FMLInitializationEvent) {
        logger.info("Initializing ExampleEssential mod...")

        Config.init()
        ExampleEssentialCommand.register()
        MinecraftForge.EVENT_BUS.register(this)
    }

    @SubscribeEvent
    fun onTick(event: ClientTickEvent) {

    }
}