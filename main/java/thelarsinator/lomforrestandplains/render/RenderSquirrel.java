package thelarsinator.lomforrestandplains.render;

import java.util.Random;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntitySquirrel;

@SideOnly(Side.CLIENT)
public class RenderSquirrel extends RenderLiving
{
//	public static int i;
    public RenderSquirrel(RenderManager renderManager, ModelBase par1ModelBase, float par2)
    {
        super(renderManager, par1ModelBase, par2);
    }

    public void renderSquirrel(EntitySquirrel par1EntitySquirrel, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntitySquirrel, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderSquirrel((EntitySquirrel)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderSquirrel((EntitySquirrel)par1Entity, par2, par4, par6, par8, par9);
    }
    
    
	private static final ResourceLocation Squirreltexture1 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/SquirrelF.png");
	private static final ResourceLocation Squirreltexture2 = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/SquirrelT.png");
	protected Random rand = new Random();

	
	
    protected ResourceLocation func_110849_a(EntitySquirrel par1EntitySquirrel)
    {
    	int i = par1EntitySquirrel.textureID;
    	switch(i)
    	{
    	case 0:
    		default:
    		return Squirreltexture1;
    	case 1:
    		return Squirreltexture2;
    	}

    }

    
    
    protected ResourceLocation getEntityTexture(Entity par1Entity)
    {
    	return this.func_110849_a((EntitySquirrel)par1Entity);

    }

}
