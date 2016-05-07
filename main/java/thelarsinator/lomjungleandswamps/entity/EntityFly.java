package thelarsinator.lomjungleandswamps.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.World;
import thelarsinator.lomcore.init.LotsOMobsItems;

public class EntityFly extends EntityAnimal
{

    public EntityFly(World par1World)
    {
        super(par1World);
        this.setSize(0.3F, 0.3F);
        ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
        float var2 = 0.7F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
        this.tasks.addTask(0, new EntityAIWander(this, var2));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }
    
    /**
     * Called frequently so the entity can update its state every tick as required. For example, zombies and skeletons
     * use this to react to sunlight and start to burn.
     */
    
    public float field_70886_e;
    public float destPos;
    public float field_70884_g;
    public float field_70888_h;
    public float field_70889_i = 1.0F;
    
    public void onLivingUpdate()
    {
        super.onLivingUpdate();
        this.field_70888_h = this.field_70886_e;
        this.field_70884_g = this.destPos;
        this.destPos = (float)((double)this.destPos + (double)(this.onGround ? -1 : 4) * 0.3D);
        this.destPos = MathHelper.clamp_float(this.destPos, 0.0F, 1.0F);

        if (!this.onGround && this.field_70889_i < 1.0F)
        {
            this.field_70889_i = 1.0F;
        }

        this.field_70889_i = (float)((double)this.field_70889_i * 0.9D);

        if (!this.onGround && this.motionY < 0.0D)
        {
            this.motionY *= 0.6D;
        }

        this.field_70886_e += this.field_70889_i * 2.0F;
    }

    public void fall(float distance, float damageMultiplier) {}
    
    public float spiderScaleAmount()    
    {
    	return 0.4F;    
    }

    /**
     * Returns true if the newer Entity AI code should be run
     */
    public boolean isAIEnabled()
    {
        return true;
    }

    protected void func_110147_ax()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(.5D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
    }
    
    /**
     * Plays st
     /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return this.isBurning() ? LotsOMobsItems.smashedBug : LotsOMobsItems.smashedBug;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean par1, int par2)
    {
        int var3 = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + par2);

        for (int var4 = 0; var4 < var3; ++var4)
        {
            if (this.isBurning())
            {
                this.dropItem(LotsOMobsItems.smashedBug, 1);
            }
            else
            {
                this.dropItem(LotsOMobsItems.smashedBug, 1);
            }
        }
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityFly spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityFly(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
}
