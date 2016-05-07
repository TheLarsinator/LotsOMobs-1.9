package thelarsinator.lomdeserts.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraft.world.biome.BiomeGenBase;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomdeserts.core.LotsOMobsDeserts;
import thelarsinator.lomdeserts.entity.EntityCamel;
import thelarsinator.lomdeserts.entity.EntityLizard;
import thelarsinator.lomdeserts.entity.EntityScorpion;

public class LotsOMobsDesertsMobs 
{
	public static void Init()
	{
		if(ConfigHandler.LizardOn == true)
		{
			EntityRegistry.registerModEntity(EntityLizard.class, "Lizard", 0, LotsOMobsDeserts.instance, 64, 1, true, 0xBA6B11, 0xEDCBA4);
	    	EntityRegistry.addSpawn(EntityLizard.class,  (int)(ConfigHandler.LizardRate *10),  4,  5,  EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.DRY));
	        EntityRegistry.addSpawn(EntityLizard.class, (int)(ConfigHandler.LizardRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}
		if(ConfigHandler.CamelOn == true)
		{
			EntityRegistry.registerModEntity(EntityCamel.class, "Camel", 1, LotsOMobsDeserts.instance, 64, 1, true, 0xFADFCD, 0xF5C9AB);
	        EntityRegistry.addSpawn(EntityCamel.class, (int)(ConfigHandler.CamelRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}
		if(ConfigHandler.ScorpionOn == true)
		{
			EntityRegistry.registerModEntity(EntityScorpion.class, "Scorpion",  2, LotsOMobsDeserts.instance, 64, 1, true,  0xbd7a36, 0x645746);
	        EntityRegistry.addSpawn(EntityScorpion.class, (int)(ConfigHandler.ScorpionRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}
		/*if(ConfigHandler.FennecOn == true)
		{
			EntityRegistry.registerGlobalEntityID(EntityFennec.class, mobid + "Fennec", EntityRegistry.findGlobalUniqueEntityId(),  0xFADFCD, 0xc9a67e);
	    	EntityRegistry.addSpawn(EntityFennec.class,  (int)(ConfigHandler.FennecRate *10),  4,  5,  EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.desert, BiomeGenBase.desertHills, BiomeGenBase.mesa});
	        EntityRegistry.addSpawn(EntityFennec.class, (int)(ConfigHandler.FennecRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SANDY));
		}*/
	}
}
