package thelarsinator.lomarctic.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelarsinator.lomarctic.init.LotsOMobsArcticMobs;
import thelarsinator.lomarctic.init.LotsOMobsArcticRecipes;

@Mod (modid = "lomarc", name = "LotsOMobsArctic", version = "1.9-1.0", dependencies = "required-after:lom")
public class LotsOMobsArctic
{
	public static String modid = "lomarc";	
	@SidedProxy(clientSide = "thelarsinator.lomarctic.core.LotsOMobsArcticClient", serverSide = "thelarsinator.lomarctic.core.LotsOMobsArcticProxy")
	public static LotsOMobsArcticProxy proxy;

	@Mod.Instance("lomarc")
	public static LotsOMobsArctic instance;
		
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
		LotsOMobsArcticMobs.Init();
		LotsOMobsArcticRecipes.RecipeBook();		
     	
		proxy.registerRenderInformation();
	}
}