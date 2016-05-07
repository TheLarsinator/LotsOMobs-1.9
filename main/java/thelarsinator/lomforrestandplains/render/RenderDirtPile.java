package thelarsinator.lomforrestandplains.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.block.BlockSand;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.init.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.math.BlockPos;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityDirtPile;

@SideOnly(Side.CLIENT)
public class RenderDirtPile extends RenderLiving
{
	
    public RenderDirtPile(RenderManager renderManager, ModelBase par1ModelBase, float par2)
    {
        super(renderManager, par1ModelBase, par2);
    }

    public void renderDirtPile(EntityDirtPile par1EntityDirtPile, double par2, double par4, double par6, float par8, float par9)
    {
        super.doRender(par1EntityDirtPile, par2, par4, par6, par8, par9);
    }

    public void doRenderLiving(EntityLiving par1EntityLiving, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderDirtPile((EntityDirtPile)par1EntityLiving, par2, par4, par6, par8, par9);
    }

    /**
     * Actually renders the given argument. This is a synthetic bridge method, always casting down its argument and then
     * handing it off to a worker function which does the actual work. In all probabilty, the class Render is generic
     * (Render<T extends Entity) and this method has signature public void doRender(T entity, double d, double d1,
     * double d2, float f, float f1). But JAD is pre 1.5 so doesn't do that.
     */
    public void doRender(Entity par1Entity, double par2, double par4, double par6, float par8, float par9)
    {
        this.renderDirtPile((EntityDirtPile)par1Entity, par2, par4, par6, par8, par9);
    }

	private static final ResourceLocation DirtPiletexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Mole.png");
	private static final ResourceLocation DirtPiletextureS = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/MoleSand.png");
	private static final ResourceLocation DirtPiletextureRS = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/MoleRSand.png");
	 protected ResourceLocation func_110872_a(EntityDirtPile DirtPile)
	    {
	    	BlockPos position = new BlockPos(DirtPile.posX, DirtPile.posY-1, DirtPile.posZ);
		 	if(DirtPile.worldObj.getBlockState(position).getBlock() == Blocks.sand && DirtPile.worldObj.getBlockState(position).getValue(BlockSand.VARIANT) == BlockSand.EnumType.RED_SAND)
		 	{
		        return DirtPiletextureRS;
		 	}
		 	else if(DirtPile.worldObj.getBlockState(position).getBlock() == Blocks.sand)
		 	{
	        return DirtPiletextureS;
		 	}
		 	else
		 	{
		 	return DirtPiletexture;
		 	}
	    }
	 
	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.func_110872_a((EntityDirtPile)var1);
	}
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleSpider(EntityDirtPile par1EntityDirtPile, float par2)
    {
    	float f = par1EntityDirtPile.size;
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleSpider((EntityDirtPile)par1EntityLivingBase, par2);
    }
}
