package thelarsinator.lomarctic.render;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.client.renderer.entity.RenderWolf;
import net.minecraft.client.renderer.entity.layers.LayerWolfCollar;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomarctic.entity.EntityPolarFox;
import thelarsinator.lomarctic.entity.EntityPolarFox;
import thelarsinator.lomcore.core.LotsOMobs;

@SideOnly(Side.CLIENT)
public class RenderPolarFox extends RenderLiving
{
    private static final ResourceLocation PolarFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PolarFox.png");
    private static final ResourceLocation tamedPolarFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PolarFox_tame.png");
    private static final ResourceLocation anrgyPolarFoxTextures = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/PolarFox_angry.png");

    public RenderPolarFox(RenderManager renderManagerIn, ModelBase modelBaseIn, float shadowSizeIn)
    {
        super(renderManagerIn, modelBaseIn, shadowSizeIn);
        this.addLayer(new LayerFoxCollar(this));
    }

    /**
     * Defines what float the third param in setRotationAngles of ModelBase is
     */
    protected float handleRotationFloat(EntityPolarFox livingBase, float partialTicks)
    {
        return livingBase.getTailRotation();
    }

    /**
     * Renders the desired {@code T} type Entity.
     */
    public void doRender(EntityPolarFox entity, double x, double y, double z, float entityYaw, float partialTicks)
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
    protected ResourceLocation getEntityTexture(EntityPolarFox entity)
    {
        return entity.isTamed() ? tamedPolarFoxTextures : (entity.isAngry() ? anrgyPolarFoxTextures : PolarFoxTextures);
    }

	@Override
	protected ResourceLocation getEntityTexture(Entity var1) {
        return this.getEntityTexture((EntityPolarFox)var1);
	}
	
    /**
     * Allows the render to do any OpenGL state modifications necessary before the model is rendered. Args:
     * entityLiving, partialTickTime
     */
    protected void scalePolarFox(EntityPolarFox par1Entity, float par2)
    {
    	float f = par1Entity.spiderScaleAmount();
        GL11.glScalef(f, f, f);
    }
    
    
    protected void preRenderCallback(EntityLivingBase par1EntityLivingBase, float par2)
    {
        this.scalePolarFox((EntityPolarFox)par1EntityLivingBase, par2);
    }
}