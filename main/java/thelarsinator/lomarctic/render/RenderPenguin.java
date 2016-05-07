package thelarsinator.lomarctic.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomarctic.entity.EntityPenguin;
import thelarsinator.lomarctic.entity.EntityPolarBear;
import thelarsinator.lomcore.core.LotsOMobs;

@SideOnly(Side.CLIENT)
public class RenderPenguin extends RenderLiving
{
	private static final ResourceLocation field_110887_f = new ResourceLocation("/LotsOMobs/Mobs/Penguin.png");
	
    public RenderPenguin(RenderManager renderManager, ModelBase par1ModelBase, float par2)
    {
        super(renderManager, par1ModelBase, par2);
    }

    public void renderPenguin(EntityPenguin par1EntityPenguin, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityPenguin, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderPenguin((EntityPenguin)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderPenguin((EntityPenguin)par1Entity, par2, par4, par6, par8, par9);
    }

	private static final ResourceLocation Penguintexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Penguin.png");
	private static final ResourceLocation Penguintexture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PenguinBaby.png");
	 protected ResourceLocation func_110872_a(EntityPenguin par1Entity)
	    {
		 if(par1Entity.isChild())
		 {
			 return Penguintexture2;
		 }
	        return Penguintexture;
	    }
	 
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityPenguin)var1);
	}
	
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scalePenguin(EntityPenguin par1Entity, float par2)
    {
    	float f = par1Entity.scaleSize();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scalePenguin((EntityPenguin)par1EntityLivingBase, par2);
    }
}
