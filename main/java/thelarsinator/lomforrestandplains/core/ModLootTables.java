package thelarsinator.lomforrestandplains.core;

import java.util.Set;

import com.google.common.collect.Sets;

import net.minecraft.util.ResourceLocation;

public class ModLootTables 
{
    private static final Set<ResourceLocation> LOOT_TABLES = Sets.<ResourceLocation>newHashSet();
    
    
    public static final ResourceLocation BOAR = register("entities/boar");
    public static final ResourceLocation DEER = register("entities/deer");
	
    private static ResourceLocation register(String id)
    {
        return register(new ResourceLocation("minecraft", id));
    }

    public static ResourceLocation register(ResourceLocation id)
    {
        if (LOOT_TABLES.add(id))
        {
            return id;
        }
        else
        {
            throw new IllegalArgumentException(id + " is already a registered built-in loot table");
        }
    }
}
