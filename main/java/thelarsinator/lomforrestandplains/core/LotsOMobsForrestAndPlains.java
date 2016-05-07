package thelarsinator.lomforrestandplains.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelarsinator.lomforrestandplains.init.LotsOMobsForrestAndPlainsMobs;
import thelarsinator.lomforrestandplains.init.LotsOMobsForrestAndPlainsRecipes;

@Mod (modid = "lomfap", name = "LotsOMobsForrestAndPlains", version = "1.9-1.0", dependencies = "required-after:lom")
public class LotsOMobsForrestAndPlains
{
	public static String modid = "lomfap";	
	@SidedProxy(clientSide = "thelarsinator.lomforrestandplains.core.LotsOMobsForrestAndPlainsClient", serverSide = "thelarsinator.lomforrestandplains.core.LotsOMobsForrestAndPlainsProxy")
	public static LotsOMobsForrestAndPlainsProxy proxy;

	@Mod.Instance("lomfap")
	public static LotsOMobsForrestAndPlains instance;
		
	//PreInit
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{    
   //  	LotsOMobsBlocks.Init();
   //  	LotsOMobsBiomes.Init();
    // 	LotsOMobsAchievementsBook.Init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	     	
		LotsOMobsForrestAndPlainsMobs.Init();
		LotsOMobsForrestAndPlainsRecipes.RecipeBook();		
     	
		proxy.registerRenderInformation();
	}
}