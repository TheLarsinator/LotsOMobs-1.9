package thelarsinator.lomdeserts.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomdeserts.entity.EntityCamel;
import thelarsinator.lomdeserts.entity.EntityLizard;
import thelarsinator.lomdeserts.entity.EntityScorpion;
import thelarsinator.lomdeserts.model.ModelCamel;
import thelarsinator.lomdeserts.model.ModelLizard;
import thelarsinator.lomdeserts.model.ModelScorpion;
import thelarsinator.lomdeserts.render.RenderCamel;
import thelarsinator.lomdeserts.render.RenderLizard;
import thelarsinator.lomdeserts.render.RenderScorpion;


public class LotsOMobsDesertsClient extends LotsOMobsDesertsProxy
{
	

    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, new RenderLizard(Minecraft.getMinecraft().getRenderManager(), new ModelLizard(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityCamel.class, new RenderCamel(Minecraft.getMinecraft().getRenderManager(), new ModelCamel(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityScorpion.class, new RenderScorpion(Minecraft.getMinecraft().getRenderManager(), new ModelScorpion(), 0.2F));

		//RenderingRegistry.registerEntityRenderingHandler(EntityFennec.class, new RenderFennec(Minecraft.getMinecraft().getRenderManager(), new ModelFennec(), 0.5F));

    }
    
    public ModelBiped getArmorModel(int id)
    {
    	return null;
    }
}
