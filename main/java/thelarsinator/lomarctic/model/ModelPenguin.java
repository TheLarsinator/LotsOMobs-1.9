package thelarsinator.lomarctic.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import thelarsinator.lomarctic.entity.EntityPenguin;

/**
 * Penguin - Lars
 * Created using Tabula 5.1.0
 */
public class ModelPenguin extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Foot2;
    public ModelRenderer Foot1;
    public ModelRenderer Tail;
    public ModelRenderer Head;
    public ModelRenderer Beak1;
    public ModelRenderer Beak2;
    public ModelRenderer Neck;
    public ModelRenderer Arm2;
    public ModelRenderer Arm1;
    
    public ModelRenderer BodyG;
    public ModelRenderer Foot2G;
    public ModelRenderer Foot1G;
    public ModelRenderer TailG;
    public ModelRenderer HeadG;
    public ModelRenderer Beak1G;
    public ModelRenderer Beak2G;
    public ModelRenderer NeckG;
    public ModelRenderer Arm2G;
    public ModelRenderer Arm1G;

    public ModelPenguin() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Arm1 = new ModelRenderer(this, 36, 7);
        this.Arm1.setRotationPoint(1.8F, 15.0F, 0.6F);
        this.Arm1.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(Arm1, 0.0F, 0.0F, -0.16877333866785166F);
        this.Tail = new ModelRenderer(this, 15, 0);
        this.Tail.setRotationPoint(-1.0F, 22.0F, 4.2F);
        this.Tail.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(Tail, 0.6373942428283291F, 0.0F, 0.0F);
        this.Beak1 = new ModelRenderer(this, 46, 0);
        this.Beak1.setRotationPoint(-1.0F, 12.5F, -1.7F);
        this.Beak1.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.Foot2 = new ModelRenderer(this, 20, 0);
        this.Foot2.setRotationPoint(-1.0F, 23.0F, 1.6F);
        this.Foot2.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Foot2, 0.0F, 0.3171263250873697F, 0.0F);
        this.Foot1 = new ModelRenderer(this, 36, 0);
        this.Foot1.setRotationPoint(1.0F, 23.0F, 1.6F);
        this.Foot1.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Foot1, 0.0F, -0.26773350725593015F, 0.0F);
        this.Beak2 = new ModelRenderer(this, 0, 0);
        this.Beak2.setRotationPoint(-0.5F, 12.6F, -2.6F);
        this.Beak2.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
        this.Neck = new ModelRenderer(this, 20, 7);
        this.Neck.setRotationPoint(-2.0F, 12.5F, 0.0F);
        this.Neck.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.Arm2 = new ModelRenderer(this, 52, 0);
        this.Arm2.setRotationPoint(-2.8F, 15.0F, 0.6F);
        this.Arm2.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(Arm2, 0.0F, 0.0F, 0.16877333866785166F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-2.5F, 14.0F, 0.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
        this.setRotateAngle(Body, 0.0F, 0.0F, -0.005488456652059524F);
        this.Head = new ModelRenderer(this, 30, 0);
        this.Head.setRotationPoint(-1.5F, 11.0F, -1.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        
        
        this.BodyG = new ModelRenderer(this, 0, 0);
        this.BodyG.setRotationPoint(-2.5F, 24.0F, -4.0F);
        this.BodyG.addBox(0.0F, 0.0F, 0.0F, 5, 9, 5, 0.0F);
        this.setRotateAngle(BodyG, 1.5707963267948966F, 0.0F, -0.0054105206811824215F);
        this.TailG = new ModelRenderer(this, 15, 0);
        this.TailG.setRotationPoint(-1.0F, 20.0F, 4.2F);
        this.TailG.addBox(0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F);
        this.setRotateAngle(TailG, 2.2081905696232256F, 0.0F, 0.0F);
        this.Arm1G = new ModelRenderer(this, 36, 7);
        this.Arm1G.setRotationPoint(2.5F, 23.0F, -3.4F);
        this.Arm1G.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(Arm1G, 1.5707963267948966F, 0.0F, -0.16877333866785166F);
        this.Arm2G = new ModelRenderer(this, 52, 0);
        this.Arm2G.setRotationPoint(-3.5F, 23.0F, -3.4F);
        this.Arm2G.addBox(0.0F, 0.0F, 0.0F, 1, 6, 3, 0.0F);
        this.setRotateAngle(Arm2G, 1.5707963267948966F, 0.0F, 0.16877333866785166F);
        this.Beak1G = new ModelRenderer(this, 46, 0);
        this.Beak1G.setRotationPoint(-1.0F, 20.5F, -6.7F);
        this.Beak1G.addBox(0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F);
        this.HeadG = new ModelRenderer(this, 30, 0);
        this.HeadG.setRotationPoint(-1.5F, 18.8F, -6.0F);
        this.HeadG.addBox(0.0F, 0.0F, 0.0F, 3, 3, 3, 0.0F);
        this.Foot2G = new ModelRenderer(this, 20, 0);
        this.Foot2G.setRotationPoint(-1.0F, 22.0F, 5.0F);
        this.Foot2G.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Foot2G, 1.5707963267948966F, 0.0F, 0.27314402793711257F);
        this.Foot1G = new ModelRenderer(this, 36, 0);
        this.Foot1G.setRotationPoint(1.0F, 22.0F, 5.0F);
        this.Foot1G.addBox(-1.0F, 0.0F, -4.0F, 2, 1, 6, 0.0F);
        this.setRotateAngle(Foot1G, 1.5707963267948966F, 0.0F, -0.36425021489121656F);
        this.NeckG = new ModelRenderer(this, 20, 7);
        this.NeckG.setRotationPoint(-2.0F, 20.5F, -5.0F);
        this.NeckG.addBox(0.0F, 0.0F, 0.0F, 4, 2, 4, 0.0F);
        this.Beak2G = new ModelRenderer(this, 0, 0);
        this.Beak2G.setRotationPoint(-0.5F, 20.6F, -7.6F);
        this.Beak2G.addBox(0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        setRotationAngles(f, f1, f2, f3, f4, f5);
        EntityPenguin Penguin = (EntityPenguin)entity;

    	if(Penguin.shouldGlide())
    	{
            this.BodyG.render(f5);
            this.TailG.render(f5);
            this.Arm1G.render(f5);
            this.Arm2G.render(f5);
            this.Beak1G.render(f5);
            this.HeadG.render(f5);
            this.Foot2G.render(f5);
            this.Foot1G.render(f5);
            this.NeckG.render(f5);
            this.Beak2G.render(f5);
    	}
    	else
    	{
    		this.Arm1.render(f5);
    		this.Tail.render(f5);
	        this.Beak1.render(f5);
	        this.Foot2.render(f5);
	        this.Foot1.render(f5);
	        this.Beak2.render(f5);
	        this.Neck.render(f5);
	        this.Arm2.render(f5);
	        this.Body.render(f5);
	        this.Head.render(f5);
    	}
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
      this.Foot1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1F * f1;
      this.Foot2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1F * f1;
      this.Arm1.rotateAngleZ = MathHelper.cos(f * 0.6662F) * 0.6F * f1;
      this.Arm2.rotateAngleZ = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 0.6F * f1;
      
      this.Foot1G.rotateAngleX = MathHelper.cos(f * 0.6662F) * .2F * f1  + (float)Math.PI/2;
      this.Foot2G.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * .2F * f1   + (float)Math.PI/2;
      
      
    }
}
