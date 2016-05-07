package thelarsinator.lomcore.init;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import thelarsinator.lomcore.items.ItemLOMFood;
import thelarsinator.lomcore.items.ItemMaterials;

public class LotsOMobsItems 
{	
	public static final Set<Item> items = new HashSet<>();
	
	//Items
	public static ItemMaterials deerHide;
	public static ItemMaterials horn;
	public static ItemMaterials smashedBug;
	
	public static ItemLOMFood rawBoar;
	public static ItemLOMFood cookedBoar;
	public static ItemLOMFood rawVenison;
	public static ItemLOMFood cookedVenison;
	public static ItemLOMFood rawReptile;
	public static ItemLOMFood cookedReptile;
	public static ItemLOMFood rawCamel;
	public static ItemLOMFood cookedCamel;
	
	public static void registerItems()
	{
		deerHide = registerItem(new ItemMaterials("deerHide"));
		horn = registerItem(new ItemMaterials("horn"));
		smashedBug = registerItem(new ItemMaterials("smashedBug"));
		
		rawBoar = registerItem(new ItemLOMFood(2, 1, false, "rawBoar"));
		cookedBoar = registerItem(new ItemLOMFood(4, 3, false, "cookedBoar"));
		rawVenison = registerItem(new ItemLOMFood(3, 2, false, "rawVenison"));
		cookedVenison = registerItem(new ItemLOMFood(6, 4, false, "cookedVenison"));
		rawReptile = registerItem(new ItemLOMFood(1, 1, false, "rawReptile"));
		cookedReptile = registerItem(new ItemLOMFood(2, 1, false, "cookedReptile"));
		rawCamel = registerItem(new ItemLOMFood(3, 2, false, "rawCamel"));
		cookedCamel = registerItem(new ItemLOMFood(6, 4, false, "cookedCamel"));
	}
	
	private static <T extends Item> T registerItem(T item) {
		GameRegistry.register(item);
		items.add(item);

		return item;
	}

}