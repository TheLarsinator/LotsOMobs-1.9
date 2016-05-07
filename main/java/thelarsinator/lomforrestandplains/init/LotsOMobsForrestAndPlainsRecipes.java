package thelarsinator.lomforrestandplains.init;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;
import static thelarsinator.lomcore.init.LotsOMobsItems.*;


public class LotsOMobsForrestAndPlainsRecipes 
{
	public static void RecipeBook()
	{
		//Smelting
		 GameRegistry.addSmelting(rawVenison, new ItemStack(cookedVenison, 1), 1.0F);
		 GameRegistry.addSmelting(rawBoar, new ItemStack(cookedBoar, 1), 1.0F);
		 //GameRegistry.addSmelting(RawReptile, new ItemStack(ReptileMeat, 1), 1.0F);
		 
		//Shaped Recipes
	/*	 GameRegistry.addRecipe(new ItemStack(HornSword, 1), new Object [] {"#", "#", "X", Character.valueOf('#'), Horn, Character.valueOf('X'), Items.stick});
		 
		 GameRegistry.addRecipe(new ItemStack(DeerHideHelmet, 1), new Object [] {"# #", "XXX", "X X", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(DeerHideChestPlate, 1), new Object [] {"X X", "XXX", "XXX", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(DeerHideLeggings, 1), new Object [] {"XXX", "X X", "X X", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
		 GameRegistry.addRecipe(new ItemStack(DeerHideBoots, 1), new Object [] {"X X", "X X", Character.valueOf('#'), Horn, Character.valueOf('X'), DeerHide});
*/
	}
}
