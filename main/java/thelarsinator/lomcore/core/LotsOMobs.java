package thelarsinator.lomcore.core;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomcore.creativetabs.LotsOMobsCombatTab;
import thelarsinator.lomcore.creativetabs.LotsOMobsFoodTab;
import thelarsinator.lomcore.creativetabs.LotsOMobsItemsTab;
import thelarsinator.lomcore.init.LotsOMobsItems;
import thelarsinator.lomcore.init.LotsOMobsSoundEvents;

@Mod (modid = "lom", name = "LotsOMobsCore", version = "1.9-1.0", guiFactory = "thelarsinator.lomcore.core.LotsOMobsGUIFactory")
public class LotsOMobs
{
	public static String modid = "lom";	
	@SidedProxy(clientSide = "thelarsinator.lomcore.core.LotsOMobsClient", serverSide = "thelarsinator.lomcore.core.LotsOMobsProxy")
	public static LotsOMobsProxy proxy;

	@Mod.Instance("lom")
	public static LotsOMobs instance;
	
	//Enums
		public static ToolMaterial EnumToolMaterialHorn= EnumHelper.addToolMaterial("HORN", 1, 100, 2.1F, 1, 17);
		public static ToolMaterial EnumToolMaterialIvory= EnumHelper.addToolMaterial("IVORY", 1, 200, 5.0F, 2, 8);
		public static ToolMaterial EnumToolMaterialIcemintuim= EnumHelper.addToolMaterial("ICEMINTUIM", 2, 500, 8F, 4, 12);
		public static ToolMaterial EnumToolMaterialAmber= EnumHelper.addToolMaterial("AMBER", 5, 1800, 15F, 8, 24);

		public static final ArmorMaterial Fur = EnumHelper.addArmorMaterial("Fur",  modid + ":FurArmor", 6, new int[] {2, 4, 3, 2}, 17, null);
/*		public static final ArmorMaterial Elephant = EnumHelper.addArmorMaterial("Elephant",  7, new int[] {3, 5, 4, 3}, 19);
		public static final ArmorMaterial Santa = EnumHelper.addArmorMaterial("Santa",  7, new int[] {1, 3, 2, 1}, 15);
		public static final ArmorMaterial AmberA = EnumHelper.addArmorMaterial("Amber",  200, new int[] {5, 10, 8, 5}, 12);
		public static final ArmorMaterial Dino = EnumHelper.addArmorMaterial("Dino",  75, new int[] {3, 8, 6, 3}, 10);
		public static final ArmorMaterial Eskimo = EnumHelper.addArmorMaterial("Eskimo",  8, new int[] {3, 5, 4, 4}, 20);
		public static final ArmorMaterial IcemintuimA = EnumHelper.addArmorMaterial("Icemintuim", 90, new int[] {3, 6, 5, 3}, 12);
	*/
	//Tabs
		public static CreativeTabs LotsOMobsItemsTab = new LotsOMobsItemsTab(CreativeTabs.getNextID(),"LotsOMobsItems");
		//public static CreativeTabs LotsOMobsFoodTab = new LotsOMobsFoodTab(CreativeTabs.getNextID(),"LotsOMobsFood");
		//public static CreativeTabs LotsOMobsCombatTab = new LotsOMobsCombatTab(CreativeTabs.getNextID(),"LotsOMobsCombat");
		//public static CreativeTabs LotsOMobsBlockTab = new MyBlockTab(CreativeTabs.getNextID(),"LotsOMobsBlock");
		
		
	//PreInit
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event)
	{    
		ConfigHandler.LoadFile(event.getSuggestedConfigurationFile());
		LotsOMobsSoundEvents.Init();

		LotsOMobsItems.registerItems();
		proxy.preInit();

   //  	LotsOMobsBlocks.Init();
   //  	LotsOMobsBiomes.Init();
    // 	LotsOMobsAchievementsBook.Init();
	}
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{	     	
		//NetworkRegistry.INSTANCE.registerGuiHandler(this, new GuiHandler());

		//LotsOMobsMobs.Init();
		//LotsOMobsRecipes.RecipeBook();		
     	
     /*	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobsItems.PineApple, 0, 1, 4, 50));
     	
     	ChestGenHooks.getInfo(ChestGenHooks.DUNGEON_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.MINESHAFT_CORRIDOR).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.PYRAMID_DESERT_CHEST).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));
     	ChestGenHooks.getInfo(ChestGenHooks.VILLAGE_BLACKSMITH).addItem(new WeightedRandomChestContent(LotsOMobsItems.Tomato, 0, 1, 4, 50));     	
*/
    // 	MinecraftForge.EVENT_BUS.register(new LotsOMobsEventHandler());
    // 	FMLCommonHandler.instance().bus().register(new LotsOMobsEventHandler());
	}
}