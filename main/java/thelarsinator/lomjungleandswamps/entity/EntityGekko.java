package thelarsinator.lomjungleandswamps.entity;

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

public class EntityGekko extends EntityAnimal
{

    public EntityGekko(World par1World)
    {
        super(par1World);
        this.setSize(0.3F, 0.3F);
        ((PathNavigateGround)this.getNavigator()).setCanSwim(true);
        float var2 = 0.7F;
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(1, new EntityAIPanic(this, 0.38F));
        this.tasks.addTask(3, new EntityAIMate(this, var2));
        this.tasks.addTask(4, new EntityAITempt(this, 0.3F, Items.carrot_on_a_stick, false));
        this.tasks.addTask(4, new EntityAITempt(this, 0.3F, Items.carrot, false));
        this.tasks.addTask(5, new EntityAIFollowParent(this, 0.28F));
        this.tasks.addTask(6, new EntityAIWander(this, var2));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(8, new EntityAILookIdle(this));
    }
    
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
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(5.0D);
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.20000000298023224D);
    }

    protected void updateAITasks()
    {
        super.updateAITasks();
    }

  

    /**
     * Returns the sound this mob makes while it's alive.
     */
    protected String getLivingSound()
    {
        return "lom:gekko";
    }

    /**
     * Returns the sound this mob makes when it is hurt.
     */
    protected SoundEvent getHurtSound()
    {
        return LotsOMobsSoundEvents.lizard;
    }

    /**
     * Returns the sound this mob makes on death.
     */
    protected SoundEvent getDeathSound()
    {
        return LotsOMobsSoundEvents.lizard;
    }

    /**
     * Plays st
     /**
     * Returns the item ID for the item the mob drops on death.
     */
    protected Item getDropItem()
    {
        return this.isBurning() ? LotsOMobsItems.cookedReptile : LotsOMobsItems.rawReptile;
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
                this.dropItem(LotsOMobsItems.cookedReptile, 1);
            }
            else
            {
                this.dropItem(LotsOMobsItems.rawReptile, 1);
            }
        }
    }

    /**
     * This function is used when two same-species animals in 'love mode' breed to generate the new baby animal.
     */
    public EntityGekko spawnBabyAnimal(EntityAgeable par1EntityAgeable)
    {
        return new EntityGekko(this.worldObj);
    }

    public EntityAgeable createChild(EntityAgeable par1EntityAgeable)
    {
        return this.spawnBabyAnimal(par1EntityAgeable);
    }
}
