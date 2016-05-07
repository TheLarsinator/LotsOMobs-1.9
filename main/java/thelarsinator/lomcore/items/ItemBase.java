package thelarsinator.lomcore.items;

import net.minecraft.item.Item;
import thelarsinator.lomcore.core.LotsOMobs;

public class ItemBase extends Item {
	public ItemBase(String itemName) {
		setItemName(this, itemName);
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