package thelarsinator.lomarctic.entity;

import net.minecraft.block.Block;
import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIFollowParent;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMate;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAITempt;
import net.minecraft.entity.ai.EntityAIWander;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.pathfinding.PathNavigateGround;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import thelarsinator.lomarctic.entity.ai.EntityAIPanicing;
import thelarsinator.lomcore.init.LotsOMobsSoundEvents;

public class EntityPenguin extends EntityAnimal
{
    public EntityPenguin(World worldIn)
    {
        super(worldIn);
        this.setSize(0.9F, 0.8F);
        ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanicing(this, 2.5D));
        //this.tasks.addTask(1, new EntityAIFleeFromAttacker(this, 3.0D));
        this.tasks.addTask(2, new EntityAIMate(this, 1.0D));
        this.tasks.addTask(3, new EntityAITempt(this, 1.25D, Items.fish, false));
        this.tasks.addTask(4, new EntityAIFollowParent(this, 1.25D));
        this.tasks.addTask(5, new EntityAIWander(this, 1.0D));
        this.tasks.addTask(6, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));


        //For noe tull
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(13.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.18200000298023224D);
    }

    protected SoundEvent getAmbientSound()
    {
    	return LotsOMobsSoundEvents.penguin;
    }

    protected SoundEvent getHurtSound()
    {
    	return LotsOMobsSoundEvents.penguin;

    }

    protected SoundEvent getDeathSound()
    {
    	return LotsOMobsSoundEvents.penguin;

    }
    
    /**
     * Returns the volume for the sounds this mob makes.
     */
    protected float getSoundVolume()
    {
        return 0.4F;
    }

    protected Item getDropItem()
    {
        return Items.feather;
    }

    /**
     * Drop 0-2 items of this living's type
     */
    protected void dropFewItems(boolean p_70628_1_, int p_70628_2_)
    {
        int j = this.rand.nextInt(3) + this.rand.nextInt(1 + p_70628_2_);
        int k;

        for (k = 0; k < j; ++k)
        {
            this.dropItem(Items.feather, 1);
        }

        j = this.rand.nextInt(3) + 1 + this.rand.nextInt(1 + p_70628_2_);

        for (k = 0; k < j; ++k)
        {
            if (this.isBurning())
            {
                this.dropItem(Items.cooked_chicken, 1);
            }
            else
            {
                this.dropItem(Items.chicken, 1);
            }
        }
    }

    public EntityPenguin createChild(EntityAgeable ageable)
    {
        return new EntityPenguin(this.worldObj);
    }

    public float getEyeHeight()
    {
        return this.height;
    }
    
    public float scaleSize()
    {
    	if(this.isChild())
    	{
    		return 0.8F;
    	}
    	else
    	{
    		return 1.5F;
    	}
    }
    
    public boolean shouldGlide()
    {
    	BlockPos position = new BlockPos(this.posX, this.posY-1, this.posZ);

    	if(worldObj.getBlockState(position).getBlock() == Blocks.ice && (this.motionX != 0 || this.motionZ != 0))
    	{
    		this.motionX *= 3;
    		this.motionY *= 3;
    		return true;
    	}
    	return false;
    }
}