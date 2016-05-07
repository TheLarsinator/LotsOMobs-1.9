package thelarsinator.lomdeserts.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static thelarsinator.lomcore.init.LotsOMobsItems.*;

public class LotsOMobsDesertsRecipes 
{
	public static void RecipeBook()
	{
		//Smelting
		 GameRegistry.addSmelting(rawReptile, new ItemStack(cookedReptile, 1), 1.0F);
		 GameRegistry.addSmelting(rawCamel, new ItemStack(cookedCamel, 1), 1.0F);
	}
}
