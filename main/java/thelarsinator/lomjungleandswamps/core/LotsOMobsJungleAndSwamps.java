package thelarsinator.lomjungleandswamps.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelarsinator.lomjungleandswamps.init.LotsOMobsJungleAndSwampsMobs;
import thelarsinator.lomjungleandswamps.init.LotsOMobsJungleAndSwampsRecipes;

@Mod (modid = "lomjas", name = "LotsOMobsJungleAndSwamps", version = "1.9-1.0", dependencies = "required-after:lom")
public class LotsOMobsJungleAndSwamps
{
	public static String modid = "lomjas";	
	@SidedProxy(clientSide = "thelarsinator.lomjungleandswamps.core.LotsOMobsJungleAndSwampsClient", serverSide = "thelarsinator.lomjungleandswamps.core.LotsOMobsJungleAndSwampsProxy")
	public static LotsOMobsJungleAndSwampsProxy proxy;

	@Mod.Instance("lomjas")
	public static LotsOMobsJungleAndSwamps instance;
		
	//PreInit
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{    

	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	     	
		LotsOMobsJungleAndSwampsMobs.Init();
		LotsOMobsJungleAndSwampsRecipes.Init();		
     	
		proxy.registerRenderInformation();
	}
}