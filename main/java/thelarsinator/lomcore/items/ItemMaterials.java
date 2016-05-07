package thelarsinator.lomcore.items;

import net.minecraft.item.Item;
import thelarsinator.lomcore.core.LotsOMobs;

public class ItemMaterials extends ItemBase
{
    public ItemMaterials(String name)
    {
        super(name);
        this.maxStackSize = 64;
        this.setCreativeTab(LotsOMobs.LotsOMobsItemsTab);
    }
    
}