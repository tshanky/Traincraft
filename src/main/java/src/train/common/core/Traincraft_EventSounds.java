package src.train.common.core;

import java.io.File;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraft.client.audio.SoundPoolEntry;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import src.train.common.Traincraft;
import src.train.common.library.EnumSoundsFiles;
import src.train.common.library.Info;
import cpw.mods.fml.client.FMLClientHandler;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.relauncher.Side;

public class Traincraft_EventSounds {
	@SubscribeEvent
	public void onSound(SoundLoadEvent event) {
		try {
			for (EnumSoundsFiles sounds : EnumSoundsFiles.values()) {
				event.manager.soundPoolSounds.addSound(Info.resourceLocation+":"+sounds.getSoundName());

			}
		} catch (Exception e) {
			System.err.println("Failed to register one or more sounds.");
		}
	}
}