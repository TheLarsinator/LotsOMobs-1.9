// Date: 17.08.2013 21:47:02
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package thelarsinator.lomjungleandswamps.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelFly extends ModelBase
{
  //fields
    ModelRenderer Body;
    ModelRenderer Wing2;
    ModelRenderer Wing1;
  
  public ModelFly()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Body = new ModelRenderer(this, 17, 0);
      Body.addBox(0F, 0F, 0F, 1, 1, 2);
      Body.setRotationPoint(0F, 15F, -1F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Wing2 = new ModelRenderer(this, 0, 2);
      Wing2.addBox(-2F, 0F, 0F, 2, 0, 1);
      Wing2.setRotationPoint(0F, 15.5F, -0.5F);
      Wing2.setTextureSize(64, 32);
      Wing2.mirror = true;
      setRotation(Wing2, 0F, 0F, 0F);
      Wing1 = new ModelRenderer(this, 0, 0);
      Wing1.addBox(0F, 0F, 0F, 2, 0, 1);
      Wing1.setRotationPoint(1F, 15.5F, -0.5F);
      Wing1.setTextureSize(64, 32);
      Wing1.mirror = true;
      setRotation(Wing1, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    Body.render(f5);
    Wing2.render(f5);
    Wing1.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, null);
  }

}
