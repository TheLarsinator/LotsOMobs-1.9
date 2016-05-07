package thelarsinator.lomdeserts.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * FennecFox - Lars
 * Created using Tabula 5.1.0
 */
public class ModelFennec extends ModelBase {
    public ModelRenderer Neck;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape9;
    public ModelRenderer shape11;
    public ModelRenderer shape10;
    public ModelRenderer shape11_1;
    public ModelRenderer shape10_1;
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer Body;

    public ModelFennec() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape11 = new ModelRenderer(this, 27, 0);
        this.shape11.setRotationPoint(-0.9F, 13.5F, -5.0F);
        this.shape11.addBox(-1.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape11, -0.27314402793711257F, 0.0F, -1.0471975511965976F);
        this.shape4 = new ModelRenderer(this, 59, 0);
        this.shape4.setRotationPoint(-2.4F, 18.0F, 4.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
        this.shape9 = new ModelRenderer(this, 19, 0);
        this.shape9.setRotationPoint(-0.5F, 17.1F, 4.6F);
        this.shape9.addBox(0.0F, 0.0F, 0.0F, 1, 1, 3, 0.0F);
        this.setRotateAngle(shape9, 0.31869712141416456F, 0.0F, 0.0F);
        this.shape1 = new ModelRenderer(this, 47, 0);
        this.shape1.setRotationPoint(1.6F, 19.0F, -3.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.shape10_1 = new ModelRenderer(this, 41, 0);
        this.shape10_1.setRotationPoint(1.1F, 13.5F, -5.0F);
        this.shape10_1.addBox(0.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape10_1, -0.27314402793711257F, 0.0F, 1.0471975511965976F);
        this.shape2 = new ModelRenderer(this, 51, 0);
        this.shape2.setRotationPoint(-2.4F, 19.0F, -3.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F);
        this.shape6 = new ModelRenderer(this, 16, 0);
        this.shape6.setRotationPoint(-1.0F, 16.6F, -6.5F);
        this.shape6.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Neck = new ModelRenderer(this, 0, 0);
        this.Neck.setRotationPoint(-1.0F, 17.1F, -3.8F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 2, 2, 2, 0.0F);
        this.shape11_1 = new ModelRenderer(this, 35, 0);
        this.shape11_1.setRotationPoint(-0.9F, 13.5F, -5.0F);
        this.shape11_1.addBox(-2.0F, -2.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(shape11_1, -0.27314402793711257F, 0.0F, -1.0471975511965976F);
        this.Body = new ModelRenderer(this, 27, 3);
        this.Body.setRotationPoint(-2.0F, 17.0F, -3.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 4, 3, 8, 0.0F);
        this.shape10 = new ModelRenderer(this, 31, 0);
        this.shape10.setRotationPoint(1.1F, 13.5F, -5.0F);
        this.shape10.addBox(0.0F, -3.0F, 0.0F, 1, 3, 1, 0.0F);
        this.setRotateAngle(shape10, -0.27314402793711257F, 0.0F, 1.0471975511965976F);
        this.shape5 = new ModelRenderer(this, 4, 0);
        this.shape5.setRotationPoint(-2.0F, 14.0F, -6.0F);
        this.shape5.addBox(0.0F, 0.0F, 0.0F, 4, 4, 4, 0.0F);
        this.shape3 = new ModelRenderer(this, 55, 0);
        this.shape3.setRotationPoint(1.6F, 18.0F, 4.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 1, 6, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape11.render(f5);
        this.shape4.render(f5);
        this.shape9.render(f5);
        this.shape1.render(f5);
        this.shape10_1.render(f5);
        this.shape2.render(f5);
        this.shape6.render(f5);
        this.Neck.render(f5);
        this.shape11_1.render(f5);
        this.Body.render(f5);
        this.shape10.render(f5);
        this.shape5.render(f5);
        this.shape3.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
