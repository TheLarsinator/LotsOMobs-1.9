package thelarsinator.lomcore.items;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import thelarsinator.lomcore.core.LotsOMobs;

public class ItemLOMFood extends ItemFood
{
	public ItemLOMFood(int healAmount, float saturation, boolean wolfFood, String name)
	{
		super(healAmount, saturation, wolfFood);
		setItemName(this, name);
		setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
	}

	/**
	 * Set the registry name of {@code item} to {@code itemName} and the unlocalised name to the full registry name.
	 *
	 * @param item     The item
	 * @param itemName The item's name
	 */
	public static void setItemName(Item item, String itemName) {
		item.setRegistryName(itemName);
		item.setUnlocalizedName(item.getRegistryName().toString());
	}
}
