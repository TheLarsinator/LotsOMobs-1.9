package thelarsinator.lomforrestandplains.entity;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAIPanic;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import thelarsinator.lomcore.init.LotsOMobsItems;
import thelarsinator.lomcore.init.LotsOMobsSoundEvents;

public class EntityElephant extends EntityAnimal
{
    public EntityElephant(World worldIn)
    {
        super(worldIn);
        this.setSize(3F, 4F);
        ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 2.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.wheat, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(30.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.150000000298023224D);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "lom:elephant";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected SoundEvent getHurtSound()
    {
        return LotsOMobsSoundEvents.elephant;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected SoundEvent getDeathSound()
    {
        return LotsOMobsSoundEvents.elephant;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }


    public EntityElephant createChild(EntityAgeable ageable)
    {
        return new EntityElephant(this.worldObj);
    }

    public float getEyeHeight()
    {
        return this.height;
    }
    
	public float spiderScaleAmount() 
	{
		if(this.isChild())
		{
			return 0.8F;
		}
		else
		{
			return 2F;
		}
	}
}