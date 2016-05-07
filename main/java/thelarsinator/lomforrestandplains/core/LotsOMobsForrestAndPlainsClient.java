package thelarsinator.lomforrestandplains.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraftforge.fml.client.registry.RenderingRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomforrestandplains.entity.EntityAnt;
import thelarsinator.lomforrestandplains.entity.EntityBoar;
import thelarsinator.lomforrestandplains.entity.EntityDeer;
import thelarsinator.lomforrestandplains.entity.EntityDirtPile;
import thelarsinator.lomforrestandplains.entity.EntityElephant;
import thelarsinator.lomforrestandplains.entity.EntityFox;
import thelarsinator.lomforrestandplains.entity.EntityMole;
import thelarsinator.lomforrestandplains.entity.EntitySquirrel;
import thelarsinator.lomforrestandplains.model.ModelAnt;
import thelarsinator.lomforrestandplains.model.ModelBoar;
import thelarsinator.lomforrestandplains.model.ModelDeer;
import thelarsinator.lomforrestandplains.model.ModelDirtPile;
import thelarsinator.lomforrestandplains.model.ModelElephant;
import thelarsinator.lomforrestandplains.model.ModelFox;
import thelarsinator.lomforrestandplains.model.ModelMole;
import thelarsinator.lomforrestandplains.model.ModelSquirrel;
import thelarsinator.lomforrestandplains.model.armor.ModelDeerArmor;
import thelarsinator.lomforrestandplains.render.RenderAnt;
import thelarsinator.lomforrestandplains.render.RenderBoar;
import thelarsinator.lomforrestandplains.render.RenderDeer;
import thelarsinator.lomforrestandplains.render.RenderDirtPile;
import thelarsinator.lomforrestandplains.render.RenderElephant;
import thelarsinator.lomforrestandplains.render.RenderFox;
import thelarsinator.lomforrestandplains.render.RenderMole;
import thelarsinator.lomforrestandplains.render.RenderSquirrel;


public class LotsOMobsForrestAndPlainsClient extends LotsOMobsForrestAndPlainsProxy
{
	
    private static final ModelDeerArmor DeerFurHelmet = new ModelDeerArmor(0.5F);

    @SideOnly(Side.CLIENT)
	public void registerRenderInformation()
    {
    	//Mobs
		RenderingRegistry.registerEntityRenderingHandler(EntityDeer.class, new RenderDeer(Minecraft.getMinecraft().getRenderManager(), new ModelDeer(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityBoar.class, new RenderBoar(Minecraft.getMinecraft().getRenderManager(), new ModelBoar(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntitySquirrel.class, new RenderSquirrel(Minecraft.getMinecraft().getRenderManager(), new ModelSquirrel(), 0.5F));
		RenderingRegistry.registerEntityRenderingHandler(EntityAnt.class, new RenderAnt(Minecraft.getMinecraft().getRenderManager(), new ModelAnt(), 0.0625F));
		RenderingRegistry.registerEntityRenderingHandler(EntityMole.class, new RenderMole(Minecraft.getMinecraft().getRenderManager(), new ModelMole(), 0.2F));
		RenderingRegistry.registerEntityRenderingHandler(EntityDirtPile.class, new RenderDirtPile(Minecraft.getMinecraft().getRenderManager(), new ModelDirtPile(), 0.0625F));
		RenderingRegistry.registerEntityRenderingHandler(EntityElephant.class, new RenderElephant(Minecraft.getMinecraft().getRenderManager(), new ModelElephant(), 1.9F));
		RenderingRegistry.registerEntityRenderingHandler(EntityFox.class, new RenderFox(Minecraft.getMinecraft().getRenderManager(), new ModelFox(), 0.5F));
    }
    
    public ModelBiped getArmorModel(int id)
    {
    	switch (id) 
    	{
    		default:
    		case 0:
    			return DeerFurHelmet;
    	}
    }
}