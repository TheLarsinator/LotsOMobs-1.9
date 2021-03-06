package thelarsinator.lomforrestandplains.render;

import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.layers.LayerRenderer;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import thelarsinator.lomcore.core.LotsOMobs;
import thelarsinator.lomforrestandplains.entity.EntityFox;

@SideOnly(Side.CLIENT)
public class LayerFoxCollar implements LayerRenderer
{
    private static final ResourceLocation Fox_COLLAR = new ResourceLocation(LotsOMobs.modid, "LotsOMobs/Mobs/Fox_Collar.png");
    private final RenderFox FoxRenderer;

    public LayerFoxCollar(RenderFox FoxRendererIn)
    {
        this.FoxRenderer = FoxRendererIn;
    }

    public boolean shouldCombineTextures()
    {
        return true;
    }

	@Override
	public void doRenderLayer(EntityLivingBase entitylivingbaseIn, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
		
		EntityFox entity = (EntityFox)entitylivingbaseIn;
		if (entity.isTamed() && !entity.isInvisible())
        {
            this.FoxRenderer.bindTexture(Fox_COLLAR);
            EnumDyeColor enumdyecolor = EnumDyeColor.byMetadata(entity.getCollarColor().getMetadata());
            float[] afloat = EntitySheep.getDyeRgb(enumdyecolor);
            GlStateManager.color(afloat[0], afloat[1], afloat[2]);
            this.FoxRenderer.getMainModel().render(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch, scale);
        }
		
	}
}