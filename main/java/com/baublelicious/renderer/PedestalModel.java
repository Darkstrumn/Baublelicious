// Date: 30-12-2014 13:55:47
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package com.baublelicious.renderer;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class PedestalModel extends ModelBase
{
  //fields
    ModelRenderer base;
    ModelRenderer pillar1;
    ModelRenderer pillar2;
    ModelRenderer pillar3;
    ModelRenderer pillar4;
    ModelRenderer basetop;
    ModelRenderer glass;
    ModelRenderer stand;
  
  public PedestalModel()
  {
    textureWidth = 64;
    textureHeight = 64;
    
      base = new ModelRenderer(this, 0, 0);
      base.addBox(0F, 0F, 0F, 14, 2, 14);
      base.setRotationPoint(-7F, 22F, -7F);
      base.setTextureSize(64, 64);
      base.mirror = true;
      setRotation(base, 0F, 0F, 0F);
      pillar1 = new ModelRenderer(this, 0, 16);
      pillar1.addBox(0F, 0F, 0F, 8, 7, 8);
      pillar1.setRotationPoint(-4F, 15F, -4F);
      pillar1.setTextureSize(64, 64);
      pillar1.mirror = true;
      setRotation(pillar1, 0F, 0F, 0F);
      pillar2 = new ModelRenderer(this, 0, 16);
      pillar2.addBox(-4F, 0F, -4F, 8, 7, 8);
      pillar2.setRotationPoint(0F, 15F, 0F);
      pillar2.setTextureSize(64, 64);
      pillar2.mirror = true;
      setRotation(pillar2, 0F, 0.3926991F, 0F);
      pillar3 = new ModelRenderer(this, 0, 16);
      pillar3.addBox(-4F, 0F, -4F, 8, 7, 8);
      pillar3.setRotationPoint(0F, 15F, 0F);
      pillar3.setTextureSize(64, 64);
      pillar3.mirror = true;
      setRotation(pillar3, 0F, 0.7853982F, 0F);
      pillar4 = new ModelRenderer(this, 0, 16);
      pillar4.addBox(-4F, 0F, -4F, 8, 7, 8);
      pillar4.setRotationPoint(0F, 15F, 0F);
      pillar4.setTextureSize(64, 64);
      pillar4.mirror = true;
      setRotation(pillar4, 0F, 1.179843F, 0F);
      basetop = new ModelRenderer(this, 0, 0);
      basetop.addBox(0F, 0F, -1F, 16, 1, 16);
      basetop.setRotationPoint(-8F, 14F, -7F);
      basetop.setTextureSize(64, 64);
      basetop.mirror = true;
      setRotation(basetop, 0F, 0F, 0F);
      glass = new ModelRenderer(this, 0, 31);
      glass.addBox(-8F, 0F, -8F, 16, 5, 16);
      glass.setRotationPoint(0F, 9F, 0F);
      glass.setTextureSize(64, 64);
      glass.mirror = true;
      setRotation(glass, 0F, 0F, 0F);
      stand = new ModelRenderer(this, 1, 0);
      stand.addBox(-4F, 0F, 0F, 8, 2, 8);
      stand.setRotationPoint(0F, 14F, 0F);
      stand.setTextureSize(64, 64);
      stand.mirror = true;
      setRotation(stand, 0.6290414F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    base.render(f5);
    pillar1.render(f5);
    pillar2.render(f5);
    pillar3.render(f5);
    pillar4.render(f5);
    basetop.render(f5);
    glass.render(f5);
    stand.render(f5);
   
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
   
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity)
  {
    super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
  }
  

}
