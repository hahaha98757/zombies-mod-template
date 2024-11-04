package com.example;

import kr.hahaha98757.zombiestools.Tools;
import kr.hahaha98757.zombiestools.events.SoundEvent;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.init.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod(modid = "examplemod", useMetadata=true)
public class ExampleMod {
    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Dirt: " + Blocks.dirt.getUnlocalizedName());
		// Below is a demonstration of an access-transformed class access.
        System.out.println("Color State: " + new GlStateManager.Color());
        MinecraftForge.EVENT_BUS.register(this);
    }

    @SubscribeEvent
    public void onSound(SoundEvent event) {
        Tools.INSTANCE.addChat("Detected sound: " + event.getSoundName());
    }
}
