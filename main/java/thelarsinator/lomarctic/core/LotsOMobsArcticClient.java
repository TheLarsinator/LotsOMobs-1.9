package thelarsinator.lomarctic.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomarctic.entity.EntityPenguin;
import thelarsinator.lomarctic.entity.EntityPolarBear;
import thelarsinator.lomarctic.entity.EntityPolarFox;
import thelarsinator.lomarctic.model.ModelPenguin;
import thelarsinator.lomarctic.model.ModelPolarBear;
import thelarsinator.lomarctic.model.ModelPolarFox;
import thelarsinator.lomarctic.render.RenderPenguin;
import thelarsinator.lomarctic.render.RenderPolarBear;
import thelarsinator.lomarctic.render.RenderPolarFox;


public class LotsOMobsArcticClient extends LotsOMobsArcticProxy
{
	

    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
//		RenderingRegistry.registerEntityRenderingHandler(EntityLizard.class, new RenderLizard(Minecraft.getMinecraft().getRenderManager(), new ModelLizard(), 0.2F));

		RenderingRegistry.registerEntityRenderingHandler(EntityPolarBear.class, new RenderPolarBear(Minecraft.getMinecraft().getRenderManager(), new ModelPolarBear(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPolarFox.class, new RenderPolarFox(Minecraft.getMinecraft().getRenderManager(), new ModelPolarFox(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityPenguin.class, new RenderPenguin(Minecraft.getMinecraft().getRenderManager(), new ModelPenguin(), 0.5F));
		
    }
    
    public ModelBiped getArmorModel(int id)
    {
    	return null;
    }
}
