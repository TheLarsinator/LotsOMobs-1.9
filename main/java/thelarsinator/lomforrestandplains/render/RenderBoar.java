package thelarsinator.lomforrestandplains.render;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityBoar;

@SideOnly(Side.CLIENT)
public class RenderBoar extends RenderLiving
{
    public RenderBoar(RenderManager p_i46149_1_, ModelBase p_i46149_2_, float p_i46149_3_)
    {
        super(p_i46149_1_, p_i46149_2_, p_i46149_3_);
        this.addLayer(new LayerBoarSaddle(this));
    }

	private static final ResourceLocation Deertexture = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Boar.png");
	 protected ResourceLocation func_110872_a(EntityBoar par1Entity)
	    {
	        return Deertexture;
	    }

    /**
     * Returns the location of an entity's texture. Doesn't seem to be called unless you call Render.bindEntityTexture.
     */
    protected ResourceLocation getEntityTexture(Entity entity)
    {
        return this.func_110872_a((EntityBoar)entity);
    }
}