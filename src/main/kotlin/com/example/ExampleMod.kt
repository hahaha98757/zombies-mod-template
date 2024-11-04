package com.example

import kr.hahaha98757.zombiestools.Tools
import kr.hahaha98757.zombiestools.events.SoundEvent
import net.minecraft.client.Minecraft
import net.minecraft.client.renderer.GlStateManager
import net.minecraft.init.Blocks
import net.minecraftforge.common.MinecraftForge
import net.minecraftforge.fml.common.Mod
import net.minecraftforge.fml.common.event.FMLInitializationEvent
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent

@Mod(modid = "examplemod", useMetadata = true)
class ExampleMod {
    @Mod.EventHandler
    fun init(event: FMLInitializationEvent) {
        try {
            val resource: net.minecraft.client.resources.IResource = Minecraft.getMinecraft().resourceManager
                .getResource(net.minecraft.util.ResourceLocation("test:test.txt"))
            org.apache.commons.io.IOUtils.copy(resource.inputStream, System.out)
        } catch (e: java.io.IOException) {
            throw java.lang.RuntimeException(e)
        }

        println("Dirt: ${Blocks.dirt.unlocalizedName}")
        // Below is a demonstration of an access-transformed class access.
        println("Color State: " + GlStateManager.Color())
        MinecraftForge.EVENT_BUS.register(this)
    }

    @SubscribeEvent
    fun onSound(event: SoundEvent) {
        Tools.addChat("Detected sound: ${event.getSoundName()}")
    }
}