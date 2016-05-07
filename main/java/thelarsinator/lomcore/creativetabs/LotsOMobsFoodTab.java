package thelarsinator.lomcore.creativetabs;


import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import thelarsinator.lomcore.init.LotsOMobsItems;

public class LotsOMobsFoodTab extends CreativeTabs
{
	public LotsOMobsFoodTab(int i, String label) {
		super(label);
	}

	@Override
	public Item getTabIconItem() {
		return LotsOMobsItems.deerHide;
	}
}
