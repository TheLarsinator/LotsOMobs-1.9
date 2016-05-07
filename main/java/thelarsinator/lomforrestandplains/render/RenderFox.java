package thelarsinator.lomforrestandplains.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomforrestandplains.render.LayerFoxCollar;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityFox;

@SideOnly(Side.CLIENT)
public class RenderFox extends RenderLiving
{
    private static final ResourceLocation FoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fox.png");
    private static final ResourceLocation tamedFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fox_tame.png");
    private static final ResourceLocation anrgyFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fox_angry.png");

    public RenderFox(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
    {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
        this.addLayer(new LayerFoxCollar(this));
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityFox livingBase, float partialTicks)
    {
        return livingBase.getTailRotation();
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityFox entity, double x, double y, double z, float entityYaw, float partialTicks)
    {
        if (entity.isWolfWet())
        {
            float f = entity.getBrightness(partialTicks) * entity.getShadingWhileWet(partialTicks);
            GlStateManager.color(f, f, f);
        }

        super.doRender(entity, x, y, z, entityYaw, partialTicks);
    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(EntityFox entity)
    {
        return entity.isTamed() ? tamedFoxTextures : (entity.isAngry() ? anrgyFoxTextures : FoxTextures);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.getEntityTexture((EntityFox)var1);
	}
	
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scaleFox(EntityFox par1Entity, float par2)
    {
    	float f = par1Entity.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scaleFox((EntityFox)par1EntityLivingBase, par2);
    }
}