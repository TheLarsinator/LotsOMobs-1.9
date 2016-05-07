package thelarsinator.lomforrestandplains.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;

/**
 * Elephant - Undefined
 * Created using Tabula 4.1.1
 */
public class ModelElephant extends ModelBase {
    public ModelRenderer Body;
    public ModelRenderer Back;
    public ModelRenderer Head;
    public ModelRenderer Ear2;
    public ModelRenderer Ear1;
    public ModelRenderer Tail;
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer Tusk1;
    public ModelRenderer Tusk2;
    public ModelRenderer Tusk3;
    public ModelRenderer Tusk4;
    public ModelRenderer Tube1;
    public ModelRenderer Tube2;

    public ModelElephant() {
        this.textureWidth = 256;
        this.textureHeight = 128;
        this.Tusk1 = new ModelRenderer(this, 9, 90);
        this.Tusk1.setRotationPoint(2.0F, 0.0F, -34.0F);
        this.Tusk1.addBox(0.0F, 0.0F, -10.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(Tusk1, 0.5918411493512771F, -0.8651597102135892F, 0.0F);
        this.Ear2 = new ModelRenderer(this, 0, 0);
        this.Ear2.setRotationPoint(8.0F, -11.0F, -30.0F);
        this.Ear2.addBox(0.0F, 0.0F, 0.0F, 12, 9, 1, 0.0F);
        this.setRotateAngle(Ear2, -0.045553093477052F, -0.7740535232594852F, -0.045553093477052F);
        this.Tusk3 = new ModelRenderer(this, 9, 90);
        this.Tusk3.setRotationPoint(-5.0F, 1.0F, -32.0F);
        this.Tusk3.addBox(0.0F, 0.0F, -10.0F, 2, 2, 10, 0.0F);
        this.setRotateAngle(Tusk3, -0.5918411493512771F, 0.8651597102135892F, -1.5707963267948966F);
        this.shape1 = new ModelRenderer(this, 60, 90);
        this.shape1.setRotationPoint(-13.0F, 8.0F, -19.0F);
        this.shape1.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
        this.shape3 = new ModelRenderer(this, 60, 90);
        this.shape3.setRotationPoint(-13.0F, 8.0F, 7.0F);
        this.shape3.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
        this.shape4 = new ModelRenderer(this, 60, 90);
        this.shape4.setRotationPoint(8.0F, 8.0F, 7.0F);
        this.shape4.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
        this.Body = new ModelRenderer(this, 0, 0);
        this.Body.setRotationPoint(-15.0F, -11.0F, -21.0F);
        this.Body.addBox(0.0F, 0.0F, 0.0F, 29, 21, 35, 0.0F);
        this.Tube1 = new ModelRenderer(this, 161, 35);
        this.Tube1.setRotationPoint(-4.1F, -4.6F, -32.9F);
        this.Tube1.addBox(0.0F, 0.0F, 0.0F, 7, 13, 6, 0.0F);
        this.setRotateAngle(Tube1, -0.4553564018453205F, 0.0F, 0.0F);
        this.Head = new ModelRenderer(this, 133, 0);
        this.Head.setRotationPoint(-10.0F, -13.0F, -33.0F);
        this.Head.addBox(0.0F, 0.0F, 0.0F, 19, 14, 12, 0.0F);
        this.Ear1 = new ModelRenderer(this, 0, 0);
        this.Ear1.setRotationPoint(-10.0F, -11.0F, -30.0F);
        this.Ear1.addBox(-10.0F, 0.0F, 0.0F, 12, 9, 1, 0.0F);
        this.setRotateAngle(Ear1, -0.045553093477052F, 0.7740535232594852F, 0.045553093477052F);
        this.Tail = new ModelRenderer(this, 220, 0);
        this.Tail.setRotationPoint(-0.5F, -8.0F, 12.0F);
        this.Tail.addBox(-1.0F, 0.0F, 0.0F, 2, 16, 2, 0.0F);
        this.setRotateAngle(Tail, 0.40980330836826856F, 0.0F, 0.0F);
        this.Tube2 = new ModelRenderer(this, 133, 35);
        this.Tube2.setRotationPoint(-3.1F, 4.4F, -37.0F);
        this.Tube2.addBox(0.0F, 0.0F, 0.0F, 5, 13, 5, 0.0F);
        this.setRotateAngle(Tube2, -0.27314402793711257F, 0.0F, 0.0F);
        this.Back = new ModelRenderer(this, 90, 90);
        this.Back.setRotationPoint(-12.5F, -13.0F, -21.1F);
        this.Back.addBox(0.0F, 0.0F, 0.0F, 24, 7, 21, 0.0F);
        this.setRotateAngle(Back, -0.11798425743481668F, 0.0F, 0.0F);
        this.Tusk4 = new ModelRenderer(this, 9, 90);
        this.Tusk4.setRotationPoint(-7.0F, 6.2F, -38.0F);
        this.Tusk4.addBox(-2.3F, 1.0F, -6.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(Tusk4, -0.27314402793711257F, -0.7285004297824331F, 1.0016444577195458F);
        this.shape2 = new ModelRenderer(this, 60, 90);
        this.shape2.setRotationPoint(8.0F, 8.0F, -19.0F);
        this.shape2.addBox(0.0F, 0.0F, 0.0F, 5, 16, 5, 0.0F);
        this.Tusk2 = new ModelRenderer(this, 9, 90);
        this.Tusk2.setRotationPoint(7.0F, 4.0F, -40.0F);
        this.Tusk2.addBox(-2.3F, 1.0F, -6.0F, 2, 2, 7, 0.0F);
        this.setRotateAngle(Tusk2, 0.27314402793711257F, 0.7285004297824331F, -0.5009094953223726F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        setRotationAngles(f, f1, f2, f3, f4, f5);

    	this.Tusk1.render(f5);
        this.Ear2.render(f5);
        this.Tusk3.render(f5);
        this.shape1.render(f5);
        this.shape3.render(f5);
        this.shape4.render(f5);
        this.Body.render(f5);
        this.Tube1.render(f5);
        this.Head.render(f5);
        this.Ear1.render(f5);
        this.Tail.render(f5);
        this.Tube2.render(f5);
        this.Back.render(f5);
        this.Tusk4.render(f5);
        this.shape2.render(f5);
        this.Tusk2.render(f5);
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
      this.shape1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
      this.shape2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.shape3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
      this.shape4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
    }
}
