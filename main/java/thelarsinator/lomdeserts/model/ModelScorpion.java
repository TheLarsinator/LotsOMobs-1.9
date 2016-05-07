package thelarsinator.lomdeserts.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * ModelScorpion - Lars
 * Created using Tabula 5.1.0
 */
public class ModelScorpion extends ModelBase {
    public ModelRenderer field_78207_b;
    public ModelRenderer spiderLeg1;
    public ModelRenderer spiderLeg5;
    public ModelRenderer Head;
    public ModelRenderer spiderLeg2;
    public ModelRenderer spiderLeg4;
    public ModelRenderer spiderLeg6;
    public ModelRenderer spiderLeg8;
    public ModelRenderer spiderLeg3;
    public ModelRenderer field_78208_c;
    public ModelRenderer tail5;
    public ModelRenderer tail1;
    public ModelRenderer tail2;
    public ModelRenderer tail3;
    public ModelRenderer tail4;
    public ModelRenderer tail5_1;
    public ModelRenderer spiderLeg7;
    public ModelRenderer RightClaw1;
    public ModelRenderer LeftClaw1;
    public ModelRenderer RightClaw2;
    public ModelRenderer LeftClaw2;

    public ModelScorpion() {
        this.textureWidth = 128;
        this.textureHeight = 64;
        this.RightClaw2 = new ModelRenderer(this, 51, 23);
        this.RightClaw2.setRotationPoint(-4.0F, 15.6F, -6.0F);
        this.RightClaw2.addBox(-10.5F, 0.0F, 4.4F, 7, 2, 4, 0.0F);
        this.setRotateAngle(RightClaw2, 0.18203784098300857F, -1.7671458676442586F, -0.22759093446006054F);
        this.spiderLeg6 = new ModelRenderer(this, 40, 11);
        this.spiderLeg6.setRotationPoint(4.0F, 15.0F, 0.0F);
        this.spiderLeg6.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg6, 0.0F, 0.39269909262657166F, 0.5811946392059326F);
        this.tail3 = new ModelRenderer(this, 112, 9);
        this.tail3.setRotationPoint(3.5F, 0.3F, 13.9F);
        this.tail3.addBox(-5.5F, -4.0F, -6.0F, 4, 3, 3, 0.0F);
        this.setRotateAngle(tail3, 1.6390387005478748F, 0.0F, 0.0F);
        this.tail1 = new ModelRenderer(this, 94, 15);
        this.tail1.setRotationPoint(2.5F, 10.5F, 13.6F);
        this.tail1.addBox(-5.5F, -4.0F, -6.0F, 6, 4, 5, 0.0F);
        this.setRotateAngle(tail1, 0.6829473363053812F, 0.0F, 0.0F);
        this.RightClaw1 = new ModelRenderer(this, 12, 20);
        this.RightClaw1.setRotationPoint(4.0F, 15.0F, -6.0F);
        this.RightClaw1.addBox(-9.0F, -1.0F, -1.0F, 10, 2, 2, 0.0F);
        this.setRotateAngle(RightClaw1, 0.13316862192716733F, -2.301042085829324F, 0.24853488548399255F);
        this.tail2 = new ModelRenderer(this, 35, 19);
        this.tail2.setRotationPoint(3.0F, 5.5F, 14.5F);
        this.tail2.addBox(-5.5F, -4.0F, -6.0F, 5, 3, 5, 0.0F);
        this.setRotateAngle(tail2, 1.2747884856566583F, 0.0F, 0.0F);
        this.spiderLeg4 = new ModelRenderer(this, 62, 7);
        this.spiderLeg4.setRotationPoint(4.0F, 15.0F, 1.0F);
        this.spiderLeg4.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg4, 0.0F, -0.39269909262657166F, 0.5811946392059326F);
        this.tail5 = new ModelRenderer(this, 0, 0);
        this.tail5.setRotationPoint(4.0F, -4.7F, 7.8F);
        this.tail5.addBox(-5.5F, -4.0F, -6.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(tail5, 2.4586453172844123F, 0.0F, 0.0F);
        this.spiderLeg5 = new ModelRenderer(this, 64, 0);
        this.spiderLeg5.setRotationPoint(-4.0F, 15.0F, 0.0F);
        this.spiderLeg5.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg5, 0.0F, -0.39269909262657166F, -0.5811946392059326F);
        this.tail4 = new ModelRenderer(this, 0, 5);
        this.tail4.setRotationPoint(4.0F, -2.9F, 11.7F);
        this.tail4.addBox(-5.5F, -4.0F, -6.0F, 3, 2, 3, 0.0F);
        this.setRotateAngle(tail4, 2.0032889154390916F, 0.0F, 0.0F);
        this.spiderLeg8 = new ModelRenderer(this, 76, 11);
        this.spiderLeg8.setRotationPoint(4.0F, 15.0F, -1.0F);
        this.spiderLeg8.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg8, 0.0F, 0.7853981852531433F, 0.7853981852531433F);
        this.LeftClaw1 = new ModelRenderer(this, 94, 24);
        this.LeftClaw1.setRotationPoint(-4.0F, 15.0F, -6.0F);
        this.LeftClaw1.addBox(-9.0F, -1.0F, -1.0F, 10, 2, 2, 0.0F);
        this.setRotateAngle(LeftClaw1, -0.13316862192716733F, -0.7302457590344275F, -0.24853488548399255F);
        this.spiderLeg1 = new ModelRenderer(this, 28, 0);
        this.spiderLeg1.setRotationPoint(-4.0F, 15.0F, 2.0F);
        this.spiderLeg1.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg1, 0.0F, 0.7853981852531433F, -0.7853981852531433F);
        this.Head = new ModelRenderer(this, 96, 0);
        this.Head.setRotationPoint(0.5F, 16.0F, -3.0F);
        this.Head.addBox(-4.0F, -4.0F, -8.0F, 7, 5, 4, 0.0F);
        this.tail5_1 = new ModelRenderer(this, 0, 20);
        this.tail5_1.setRotationPoint(3.5F, -3.5F, 3.3F);
        this.tail5_1.addBox(-5.5F, -4.0F, -6.0F, 4, 2, 4, 0.0F);
        this.setRotateAngle(tail5_1, 3.141592653589793F, 0.0F, 0.0F);
        this.field_78207_b = new ModelRenderer(this, 0, 0);
        this.field_78207_b.setRotationPoint(-1.0F, 14.0F, -4.0F);
        this.field_78207_b.addBox(-3.0F, -3.0F, -3.0F, 8, 8, 12, 0.0F);
        this.spiderLeg7 = new ModelRenderer(this, 0, 26);
        this.spiderLeg7.setRotationPoint(-4.0F, 15.0F, -1.0F);
        this.spiderLeg7.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg7, 0.0F, -0.7853981852531433F, -0.7853981852531433F);
        this.LeftClaw2 = new ModelRenderer(this, 32, 27);
        this.LeftClaw2.setRotationPoint(-4.0F, 15.7F, -6.0F);
        this.LeftClaw2.addBox(-9.9F, 0.2F, -15.6F, 7, 2, 4, 0.0F);
        this.setRotateAngle(LeftClaw2, 0.16458454846306528F, -1.4166837538437973F, -0.21013764194011728F);
        this.field_78208_c = new ModelRenderer(this, 70, 15);
        this.field_78208_c.setRotationPoint(2.5F, 14.5F, 9.0F);
        this.field_78208_c.addBox(-5.5F, -4.0F, -6.0F, 6, 6, 6, 0.0F);
        this.setRotateAngle(field_78208_c, 0.18203784098300857F, 0.0F, 0.0F);
        this.spiderLeg3 = new ModelRenderer(this, 40, 15);
        this.spiderLeg3.setRotationPoint(-4.0F, 15.0F, 1.0F);
        this.spiderLeg3.addBox(-15.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg3, 0.0F, 0.39269909262657166F, -0.5811946392059326F);
        this.spiderLeg2 = new ModelRenderer(this, 28, 4);
        this.spiderLeg2.setRotationPoint(4.0F, 15.0F, 2.0F);
        this.spiderLeg2.addBox(-1.0F, -1.0F, -1.0F, 16, 2, 2, 0.0F);
        this.setRotateAngle(spiderLeg2, 0.0F, -0.7853981852531433F, 0.7853981852531433F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) 
    {
        this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        this.RightClaw2.render(f5);
        this.spiderLeg6.render(f5);
        this.tail3.render(f5);
        this.tail1.render(f5);
        this.RightClaw1.render(f5);
        this.tail2.render(f5);
        this.spiderLeg4.render(f5);
        this.tail5.render(f5);
        this.spiderLeg5.render(f5);
        this.tail4.render(f5);
        this.spiderLeg8.render(f5);
        this.LeftClaw1.render(f5);
        this.spiderLeg1.render(f5);
        this.Head.render(f5);
        this.tail5_1.render(f5);
        this.field_78207_b.render(f5);
        this.spiderLeg7.render(f5);
        this.LeftClaw2.render(f5);
        this.field_78208_c.render(f5);
        this.spiderLeg3.render(f5);
        this.spiderLeg2.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
    
    /**
     * Sets the model's various rotation angles. For bipeds, par1 and par2 are used for animating the movement of arms
     * and legs, where par1 represents the time(so that arms and legs swing back and forth) and par2 represents how
     * "far" arms and legs can swing at most.
     */
    public void setRotationAngles(float p_78087_1_, float p_78087_2_, float p_78087_3_, float p_78087_4_, float p_78087_5_, float p_78087_6_, Entity p_78087_7_)
    {
        this.Head.rotateAngleY = p_78087_4_ / (180F / (float)Math.PI);
        this.Head.rotateAngleX = p_78087_5_ / (180F / (float)Math.PI);
        float f6 = ((float)Math.PI / 4F);
        this.spiderLeg1.rotateAngleZ = -f6;
        this.spiderLeg2.rotateAngleZ = f6;
        this.spiderLeg3.rotateAngleZ = -f6 * 0.74F;
        this.spiderLeg4.rotateAngleZ = f6 * 0.74F;
        this.spiderLeg5.rotateAngleZ = -f6 * 0.74F;
        this.spiderLeg6.rotateAngleZ = f6 * 0.74F;
        this.spiderLeg7.rotateAngleZ = -f6;
        this.spiderLeg8.rotateAngleZ = f6;
        float f7 = -0.0F;
        float f8 = 0.3926991F;
        this.spiderLeg1.rotateAngleY = f8 * 2.0F + f7;
        this.spiderLeg2.rotateAngleY = -f8 * 2.0F - f7;
        this.spiderLeg3.rotateAngleY = f8 * 1.0F + f7;
        this.spiderLeg4.rotateAngleY = -f8 * 1.0F - f7;
        this.spiderLeg5.rotateAngleY = -f8 * 1.0F + f7;
        this.spiderLeg6.rotateAngleY = f8 * 1.0F - f7;
        this.spiderLeg7.rotateAngleY = -f8 * 2.0F + f7;
        this.spiderLeg8.rotateAngleY = f8 * 2.0F - f7;
        float f9 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + 0.0F) * 0.4F) * p_78087_2_;
        float f10 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + (float)Math.PI) * 0.4F) * p_78087_2_;
        float f11 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + ((float)Math.PI / 2F)) * 0.4F) * p_78087_2_;
        float f12 = -(MathHelper.cos(p_78087_1_ * 0.6662F * 2.0F + ((float)Math.PI * 3F / 2F)) * 0.4F) * p_78087_2_;
        float f13 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + 0.0F) * 0.4F) * p_78087_2_;
        float f14 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + (float)Math.PI) * 0.4F) * p_78087_2_;
        float f15 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + ((float)Math.PI / 2F)) * 0.4F) * p_78087_2_;
        float f16 = Math.abs(MathHelper.sin(p_78087_1_ * 0.6662F + ((float)Math.PI * 3F / 2F)) * 0.4F) * p_78087_2_;
        this.spiderLeg1.rotateAngleY += f9;
        this.spiderLeg2.rotateAngleY += -f9;
        this.spiderLeg3.rotateAngleY += f10;
        this.spiderLeg4.rotateAngleY += -f10;
        this.spiderLeg5.rotateAngleY += f11;
        this.spiderLeg6.rotateAngleY += -f11;
        this.spiderLeg7.rotateAngleY += f12;
        this.spiderLeg8.rotateAngleY += -f12;
        this.spiderLeg1.rotateAngleZ += f13;
        this.spiderLeg2.rotateAngleZ += -f13;
        this.spiderLeg3.rotateAngleZ += f14;
        this.spiderLeg4.rotateAngleZ += -f14;
        this.spiderLeg5.rotateAngleZ += f15;
        this.spiderLeg6.rotateAngleZ += -f15;
        this.spiderLeg7.rotateAngleZ += f16;
        this.spiderLeg8.rotateAngleZ += -f16;
    }
}
