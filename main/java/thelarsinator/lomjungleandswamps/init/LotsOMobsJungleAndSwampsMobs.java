package thelarsinator.lomjungleandswamps.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomjungleandswamps.core.LotsOMobsJungleAndSwamps;
import thelarsinator.lomjungleandswamps.entity.EntityFly;
import thelarsinator.lomjungleandswamps.entity.EntityGekko;

public class LotsOMobsJungleAndSwampsMobs {

	public static void Init() 
	{
		String mobid = "lom_";

		if(ConfigHandler.GekkoOn == true)
		{
	    	EntityRegistry.registerModEntity(EntityGekko.class, "Gekko", 0, LotsOMobsJungleAndSwamps.instance, 64, 1, true, 0xDEC2A2, 0x506E21);
        	EntityRegistry.addSpawn(EntityGekko.class, (int)(ConfigHandler.GekkoRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
		if(ConfigHandler.FlyOn == true)
		{
	    	EntityRegistry.registerModEntity(EntityFly.class, "Fly", 3, LotsOMobsJungleAndSwamps.instance, 64, 1, true, 0x000000, 0x5ED0F2);
        	EntityRegistry.addSpawn(EntityFly.class, (int)(ConfigHandler.FlyRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SWAMP));
		}
	}

}
