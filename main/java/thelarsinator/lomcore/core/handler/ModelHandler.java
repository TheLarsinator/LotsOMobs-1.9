package thelarsinator.lomcore.core.handler;

import java.util.HashSet;
import java.util.Set;

import net.minecraft.client.renderer.ItemMeshDefinition;
import net.minecraft.client.renderer.block.model.ModelBakery;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import thelarsinator.lomcore.init.LotsOMobsItems;

public class ModelHandler 
{
	public static final ModelHandler INSTANCE = new ModelHandler();
	
	public void registerAllModels()
	{
		registerItemModels();
	}
	
	
	private final Set<Item> itemsRegistered = new HashSet<>();
	
	private void registerItemModels()
	{
		LotsOMobsItems.items.stream().filter(item -> !itemsRegistered.contains(item)).forEach(this::registerItemModel);
	}

	private void registerItemModel(Item item) {
		registerItemModel(item, item.getRegistryName().toString());
	}
	
	private void registerItemModel(Item item, String modelLocation) {
		final ModelResourceLocation fullModelLocation = new ModelResourceLocation(modelLocation, "inventory");
		registerItemModel(item, fullModelLocation);
	}

	private void registerItemModel(Item item, ModelResourceLocation fullModelLocation) {
		ModelBakery.registerItemVariants(item, fullModelLocation); // Ensure the custom model is loaded and prevent the default model from being loaded
		registerItemModel(item, MeshDefinitionFix.create(stack -> fullModelLocation));
	}

	private void registerItemModel(Item item, ItemMeshDefinition meshDefinition) {
		itemsRegistered.add(item);
		ModelLoader.setCustomMeshDefinition(item, meshDefinition);
	}

	private void registerItemModelForMeta(Item item, int metadata, String variant) {
		registerItemModelForMeta(item, metadata, new ModelResourceLocation(item.getRegistryName(), variant));
	}

	private void registerItemModelForMeta(Item item, int metadata, ModelResourceLocation modelResourceLocation) {
		itemsRegistered.add(item);
		ModelLoader.setCustomModelResourceLocation(item, metadata, modelResourceLocation);
	}

}
