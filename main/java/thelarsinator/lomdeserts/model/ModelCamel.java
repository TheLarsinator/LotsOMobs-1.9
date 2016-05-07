package thelarsinator.lomdeserts.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * camel.tcn - TechneToTabulaImporter
 * Created using Tabula 5.1.0
 */
public class ModelCamel extends ModelBase {
    public ModelRenderer NeckBase;
    public ModelRenderer Nose;
    public ModelRenderer Body2;
    public ModelRenderer Leg2;
    public ModelRenderer Leg4;
    public ModelRenderer Leg1;
    public ModelRenderer Leg3;
    public ModelRenderer BultAB;
    public ModelRenderer BultVB;
    public ModelRenderer Tail;
    public ModelRenderer Body;
    public ModelRenderer Neck;
    public ModelRenderer Neck2;
    public ModelRenderer Head;
    public ModelRenderer Nose2;

    public ModelCamel() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.Leg1 = new ModelRenderer(this, 108, 0);
        this.Leg1.setRotationPoint(4.0F, 12.0F, -11.0F);
        this.Leg1.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.BultVB = new ModelRenderer(this, 8, 26);
        this.BultVB.setRotationPoint(-5.0F, -4.0F, 2.0F);
        this.BultVB.addBox(0.0F, 0.0F, 0.0F, 10, 4, 8, 0.0F);
        this.Nose2 = new ModelRenderer(this, 30, 9);
        this.Nose2.setRotationPoint(-1.0F, -5.0F, -27.0F);
        this.Nose2.addBox(0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F);
        this.Leg2 = new ModelRenderer(this, 76, 0);
        this.Leg2.setRotationPoint(-8.0F, 12.0F, -11.0F);
        this.Leg2.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.Neck = new ModelRenderer(this, 76, 30);
        this.Neck.setRotationPoint(-2.0F, 5.0F, -20.0F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 4, 6, 8, 0.0F);
        this.setRotateAngle(Neck, 0.4461433291435241F, 0.0F, 0.0F);
        this.Body = new ModelRenderer(this, 22, 26);
        this.Body.setRotationPoint(-8.0F, 4.0F, -11.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 16, 8, 22, 0.0F);
        this.NeckBase = new ModelRenderer(this, 0, 0);
        this.NeckBase.setRotationPoint(-4.5F, 1.5F, -14.0F);
        this.NeckBase.addBox(0.0F, 0.0F, 0.0F, 9, 9, 3, 0.0F);
        this.BultAB = new ModelRenderer(this, 90, 18);
        this.BultAB.setRotationPoint(-5.0F, -4.0F, -10.0F);
        this.BultAB.addBox(0.0F, 0.0F, 0.0F, 10, 4, 8, 0.0F);
        this.Body2 = new ModelRenderer(this, 26, 0);
        this.Body2.setRotationPoint(-7.0F, 0.0F, -11.0F);
        this.Body2.addBox(0.0F, 0.0F, 0.0F, 14, 4, 22, 0.0F);
        this.Head = new ModelRenderer(this, 98, 44);
        this.Head.setRotationPoint(-4.0F, -7.0F, -22.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 8, 6, 6, 0.0F);
        this.setRotateAngle(Head, -0.01745329238474369F, 0.0F, 0.0F);
        this.Nose = new ModelRenderer(this, 24, 0);
        this.Nose.setRotationPoint(-3.0F, -4.0F, -28.0F);
        this.Nose.addBox(0.0F, 0.0F, 0.0F, 6, 3, 6, 0.0F);
        this.Tail = new ModelRenderer(this, 24, 9);
        this.Tail.setRotationPoint(-1.0F, 1.0F, 10.0F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 2, 8, 1, 0.0F);
        this.setRotateAngle(Tail, 0.5205005407333374F, 0.0F, 0.0F);
        this.Leg3 = new ModelRenderer(this, 0, 12);
        this.Leg3.setRotationPoint(4.0F, 12.0F, 7.0F);
        this.Leg3.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
        this.Neck2 = new ModelRenderer(this, 100, 30);
        this.Neck2.setRotationPoint(0.0F, 5.0F, -20.0F);
        this.Neck2.addBox(-2.0F, 0.0F, 0.0F, 4, 6, 8, 0.0F);
        this.setRotateAngle(Neck2, 1.9332878589630131F, 0.0F, 0.0F);
        this.Leg4 = new ModelRenderer(this, 92, 0);
        this.Leg4.setRotationPoint(-8.0F, 12.0F, 7.0F);
        this.Leg4.addBox(0.0F, 0.0F, 0.0F, 4, 12, 4, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        setRotationAngles(f, f1, f2, f3, f4, f5);

        this.Leg1.render(f5);
        this.BultVB.render(f5);
        this.Nose2.render(f5);
        this.Leg2.render(f5);
        this.Neck.render(f5);
        this.Body.render(f5);
        this.NeckBase.render(f5);
        this.BultAB.render(f5);
        this.Body2.render(f5);
        this.Head.render(f5);
        this.Nose.render(f5);
        this.Tail.render(f5);
        this.Leg3.render(f5);
        this.Neck2.render(f5);
        this.Leg4.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
    {
      super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
      this.Leg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.Leg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.Leg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.Leg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }
}
