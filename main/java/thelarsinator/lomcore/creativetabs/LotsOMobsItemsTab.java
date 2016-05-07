package thelarsinator.lomcore.creativetabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thelarsinator.lomcore.init.LotsOMobsItems;

public class LotsOMobsItemsTab extends CreativeTabs
{
	public LotsOMobsItemsTab(int i, String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return LotsOMobsItems.deerHide;
	}
}
