package thelarsinator.lomforrestandplains.render;

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
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityElephant;

@SideOnly(Side.CLIENT)
public class RenderElephant extends RenderLiving
{
	
    public RenderElephant(RenderManager renderManager, ModelBase par1ModelBase, float par2)
    {
        super(renderManager, par1ModelBase, par2);
    }

    public void renderElephant(EntityElephant par1EntityElephant, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityElephant, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderElephant((EntityElephant)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderElephant((EntityElephant)par1Entity, par2, par4, par6, par8, par9);
    }

	private static final ResourceLocation Elephanttexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Elephant.png");
	 protected ResourceLocation func_110872_a(EntityElephant par1Entity)
	    {
	        return Elephanttexture;
	    }
	 
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityElephant)var1);
	}
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityElephant par1EntityElephant, float par2)
    {
    	float f = par1EntityElephant.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityElephant)par1EntityLivingBase, par2);
    }
}
