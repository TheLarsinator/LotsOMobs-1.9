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
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import thelarsinator.lomcore.init.LotsOMobsSoundEvents;
import thelarsinator.lomforrestandplains.core.ModLootTables;

public class EntityDeer extends EntityAnimal
{
    public EntityDeer(World worldIn)
    {
        super(worldIn);
        this.setSize(0.9F, 1.3F);
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(10.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "lom:deer";
    }

    protected SoundEvent getAmbientSound()
    {
    	return LotsOMobsSoundEvents.deer;
    }

    protected SoundEvent getHurtSound()
    {
        return LotsOMobsSoundEvents.deer;
    }

    protected SoundEvent getDeathSound()
    {
        return LotsOMobsSoundEvents.deer;
    }

    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }
    
    protected ResourceLocation getLootTable()
    {
        return ModLootTables.DEER;
    }

    public EntityDeer createChild(EntityAgeable ageable)
    {
        return new EntityDeer(this.worldObj);
    }

    public float getEyeHeight()
    {
        return this.height;
    }
}