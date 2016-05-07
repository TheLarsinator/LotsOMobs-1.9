package thelarsinator.lomforrestandplains.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelPig - Either Mojang or a mod author
 * Created using Tabula 5.1.0
 */
public class ModelBear extends ModelBase {
    public ModelRenderer field_78148_b;
    public ModelRenderer Leg3;
    public ModelRenderer Leg1;
    public ModelRenderer Leg4;
    public ModelRenderer Leg2;
    public ModelRenderer field_78150_a0;
    public ModelRenderer field_78150_a1;
    public ModelRenderer field_78150_a1_1;
    public ModelRenderer shape10;
    public ModelRenderer shape9;

    public ModelBear() {
        this.textureWidth = 64;
        this.textureHeight = 128;
        this.shape9 = new ModelRenderer(this, 50, 0);
        this.shape9.setRotationPoint(-4.0F, 5.0F, -11.0F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.Leg4 = new ModelRenderer(this, 0, 27);
        this.Leg4.setRotationPoint(-5.0F, 18.0F, 7.0F);
        this.Leg4.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Leg2 = new ModelRenderer(this, 16, 27);
        this.Leg2.setRotationPoint(-5.0F, 18.0F, -5.0F);
        this.Leg2.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.Leg1 = new ModelRenderer(this, 44, 23);
        this.Leg1.setRotationPoint(5.0F, 18.0F, -5.0F);
        this.Leg1.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78148_b = new ModelRenderer(this, 0, 0);
        this.field_78148_b.setRotationPoint(-2.0F, 11.0F, 2.0F);
        this.field_78148_b.addBox(-5.0F, -10.0F, -7.0F, 14, 17, 10, 0.0F);
        this.setRotateAngle(field_78148_b, 1.5707963267948966F, 0.0F, 0.0F);
        this.Leg3 = new ModelRenderer(this, 38, 0);
        this.Leg3.setRotationPoint(5.0F, 18.0F, 7.0F);
        this.Leg3.addBox(-2.0F, 0.0F, -2.0F, 4, 6, 4, 0.0F);
        this.field_78150_a1_1 = new ModelRenderer(this, 0, 43);
        this.field_78150_a1_1.setRotationPoint(-1.0F, 9.0F, -7.2F);
        this.field_78150_a1_1.addBox(-2.0F, 0.0F, -9.0F, 6, 2, 3, 0.0F);
        this.setRotateAngle(field_78150_a1_1, 0.22218041377887818F, 0.0F, 0.0F);
        this.shape10 = new ModelRenderer(this, 0, 0);
        this.shape10.setRotationPoint(2.0F, 5.0F, -11.0F);
        this.shape10.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.field_78150_a0 = new ModelRenderer(this, 27, 33);
        this.field_78150_a0.setRotationPoint(0.0F, 11.0F, -5.0F);
        this.field_78150_a0.addBox(-4.0F, -4.0F, -8.0F, 8, 8, 5, 0.0F);
        this.field_78150_a1 = new ModelRenderer(this, 0, 37);
        this.field_78150_a1.setRotationPoint(-1.0F, 11.0F, -7.0F);
        this.field_78150_a1.addBox(-2.0F, 0.0F, -9.0F, 6, 3, 3, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        setRotationAngles(f, f1, f2, f3, f4, f5);

        this.shape9.render(f5);
        this.Leg4.render(f5);
        this.Leg2.render(f5);
        this.Leg1.render(f5);
        this.field_78148_b.render(f5);
        this.Leg3.render(f5);
        this.field_78150_a1_1.render(f5);
        this.shape10.render(f5);
        this.field_78150_a0.render(f5);
        this.field_78150_a1.render(f5);
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
