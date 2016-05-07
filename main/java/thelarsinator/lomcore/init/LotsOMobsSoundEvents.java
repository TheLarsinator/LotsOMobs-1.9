package thelarsinator.lomcore.init;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thelarsinator.lomcore.core.LotsOMobs;

public class LotsOMobsSoundEvents 
{	
	public static SoundEvent penguin;
	public static SoundEvent bear;
	public static SoundEvent deer;
	public static SoundEvent elephant;
	public static SoundEvent lizard;
	public static SoundEvent camel;
	
	public static void Init() 
	{
		penguin = registerSound("penguin");
		bear = registerSound("bear");
		deer = registerSound("deer");
		elephant = registerSound("elephant");
		lizard = registerSound("lizard");
		camel = registerSound("camel");
	}
	
	private static SoundEvent registerSound(String soundName)
	{
		final ResourceLocation soundID = new ResourceLocation(LotsOMobs.modid, soundName);
		return GameRegistry.register(new SoundEvent(soundID).setRegistryName(soundID));
	}
}
