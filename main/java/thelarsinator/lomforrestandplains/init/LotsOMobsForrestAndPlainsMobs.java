package thelarsinator.lomforrestandplains.init;

import net.minecraft.entity.EnumCreatureType;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.fml.common.registry.EntityRegistry;
import thelarsinator.lomcore.core.handler.ConfigHandler;
import thelarsinator.lomforrestandplains.core.LotsOMobsForrestAndPlains;
import thelarsinator.lomforrestandplains.entity.EntityAnt;
import thelarsinator.lomforrestandplains.entity.EntityBoar;
import thelarsinator.lomforrestandplains.entity.EntityDeer;
import thelarsinator.lomforrestandplains.entity.EntityDirtPile;
import thelarsinator.lomforrestandplains.entity.EntityElephant;
import thelarsinator.lomforrestandplains.entity.EntityFox;
import thelarsinator.lomforrestandplains.entity.EntityMole;
import thelarsinator.lomforrestandplains.entity.EntitySquirrel;

public class LotsOMobsForrestAndPlainsMobs 
{
	public static void Init()
	{
		String mobid = "lom_";
		//Temporary fix for missing vanilla creature spawn:
  /*    EntityRegistry.addSpawn(EntityCow.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityPig.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntitySheep.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.forest, BiomeGenBase.forestHills, BiomeGenBase.plains, BiomeGenBase.icePlains});
        EntityRegistry.addSpawn(EntityHorse.class, 20, 1, 4, EnumCreatureType.CREATURE, new BiomeGenBase[] {BiomeGenBase.plains});
*/

		if(ConfigHandler.DeerOn == true)
		{	
			EntityRegistry.registerModEntity(EntityDeer.class, "Deer", 0, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0x7D3B0C, 0xB37346);
		    EntityRegistry.addSpawn(EntityDeer.class, (int)ConfigHandler.DeerRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
		if(ConfigHandler.BoarOn == true)
		{	
			EntityRegistry.registerModEntity(EntityBoar.class, "Boar", 1, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0x7D3B0C, 0x351f0a);
		    EntityRegistry.addSpawn(EntityBoar.class, (int)ConfigHandler.BoarRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
		if(ConfigHandler.SquirrelOn == true)
		{    
			EntityRegistry.registerModEntity(EntitySquirrel.class, "Squirrel", 2, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0x634205, 0x633405);
	        EntityRegistry.addSpawn(EntitySquirrel.class, (int)(ConfigHandler.SquirrelRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
		if(ConfigHandler.AntOn == true)
		{
			EntityRegistry.registerModEntity(EntityAnt.class, "Ant", 3, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0x000000, 0xFF0000);
	        EntityRegistry.addSpawn(EntityAnt.class, (int)(ConfigHandler.AntRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.PLAINS));
		}
		if(ConfigHandler.MoleOn == true)
		{	
			EntityRegistry.registerModEntity(EntityMole.class, "Mole", 4, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0x7D3B0C, 0x544842);
			EntityRegistry.registerModEntity(EntityDirtPile.class, "DirtPile", 5, LotsOMobsForrestAndPlains.instance, 64, 1, true);
			EntityRegistry.addSpawn(EntityMole.class, (int)(ConfigHandler.MoleRate *10), 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.PLAINS));
		}
		if(ConfigHandler.ElephantOn == true)
		{	
			EntityRegistry.registerModEntity(EntityElephant.class, "Elephant", 6, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0x919191, 0x757575);
		    EntityRegistry.addSpawn(EntityElephant.class, (int)ConfigHandler.ElephantRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.SAVANNA));
		}
		if(ConfigHandler.FoxOn == true)
		{	
			EntityRegistry.registerModEntity(EntityFox.class, "Fox", 7, LotsOMobsForrestAndPlains.instance, 64, 1, true, 0xc66427, 0x862d1b);
		    EntityRegistry.addSpawn(EntityFox.class, (int)ConfigHandler.FoxRate *10, 1, 4, EnumCreatureType.CREATURE, BiomeDictionary.getBiomesForType(Type.FOREST));
		}
	}
}
