package thelarsinator.lomdeserts.core;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelarsinator.lomdeserts.init.LotsOMobsDesertsMobs;
import thelarsinator.lomdeserts.init.LotsOMobsDesertsRecipes;

@Mod (modid = "lomdes", name = "LotsOMobsDeserts", version = "1.9-1.0", dependencies = "required-after:lom")
public class LotsOMobsDeserts
{
	public static String modid = "lomdes";	
	@SidedProxy(clientSide = "thelarsinator.lomdeserts.core.LotsOMobsDesertsClient", serverSide = "thelarsinator.lomdeserts.core.LotsOMobsDesertsProxy")
	public static LotsOMobsDesertsProxy proxy;

	@Mod.Instance("lomdes")
	public static LotsOMobsDeserts instance;
		
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
		LotsOMobsDesertsMobs.Init();
		LotsOMobsDesertsRecipes.RecipeBook();		
     	
		proxy.registerRenderInformation();
	}
}