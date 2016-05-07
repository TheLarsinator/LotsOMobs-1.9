package thelarsinator.lomarctic.entity;

import java.util.UUID;

import com.google.common.base.Predicate;

import net.minecraft.entity.EntityAgeable;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.EntityAIAttackMelee;
import net.minecraft.entity.ai.EntityAINearestAttackableTarget;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.passive.EntityWolf;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

public class EntityPolarFox extends EntityWolf
{

	public EntityPolarFox(World worldIn) 
	{
		super(worldIn);
        this.tasks.addTask(1, new EntityAIAttackMelee(this, 1.0D, true));
        this.targetTasks.addTask(2, new EntityAINearestAttackableTarget(this, EntityPenguin.class, true));
        this.targetTasks.addTask(3, new EntityAINearestAttackableTarget(this, EntityLiving.class, 10, false, true, new Predicate<EntityLiving>()
        {
            public boolean apply(EntityLiving p_apply_1_)
            {
                return p_apply_1_ != null && IMob.VISIBLE_MOB_SELECTOR.apply(p_apply_1_) && !(p_apply_1_ instanceof EntityPenguin);
            }
        }));
	}

	public float spiderScaleAmount() {
		return 0.7F;
	}
	
    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MOVEMENT_SPEED).setBaseValue(0.35000001192092896D);

        if (this.isTamed())
        {
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(15.0D);
        }
        else
        {
            this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(7.0D);
        }

        //this.getAttributeMap().registerAttribute(SharedMonsterAttributes.attackDamage);
        this.getEntityAttribute(SharedMonsterAttributes.ATTACK_DAMAGE).setBaseValue(.5D);
    }
    
    public boolean processInteract(EntityPlayer player, EnumHand p_184645_2_, ItemStack stack)
    {
        if (this.isTamed())
        {
            if (stack != null)
            {
                if (stack.getItem() instanceof ItemFood)
                {
                    ItemFood itemfood = (ItemFood)stack.getItem();

                    if (itemfood.isWolfsFavoriteMeat())
                    {
                        if (!player.capabilities.isCreativeMode)
                        {
                            --stack.stackSize;
                        }

                        this.heal((float)itemfood.getHealAmount(stack));
                        return true;
                    }
                }
                else if (stack.getItem() == Items.dye)
                {
                    EnumDyeColor enumdyecolor = EnumDyeColor.byDyeDamage(stack.getMetadata());

                    if (enumdyecolor != this.getCollarColor())
                    {
                        this.setCollarColor(enumdyecolor);

                        if (!player.capabilities.isCreativeMode)
                        {
                            --stack.stackSize;
                        }

                        return true;
                    }
                }
            }

            if (this.isOwner(player) && !this.worldObj.isRemote && !this.isBreedingItem(stack))
            {
                this.aiSit.setSitting(!this.isSitting());
                this.isJumping = false;
                this.navigator.clearPathEntity();
                this.setAttackTarget((EntityLivingBase)null);
            }
        }
        else if (stack != null && stack.getItem() == Items.fish && !this.isAngry())
        {
            if (!player.capabilities.isCreativeMode)
            {
                --stack.stackSize;
            }

            if (!this.worldObj.isRemote)
            {
                if (this.rand.nextInt(3) == 0)
                {
                    this.setTamed(true);
                    this.navigator.clearPathEntity();
                    this.setAttackTarget((EntityLivingBase)null);
                    this.aiSit.setSitting(true);
                    this.setHealth(20.0F);
                    this.setOwnerId(player.getUniqueID());
                    this.playTameEffect(true);
                    this.worldObj.setEntityState(this, (byte)7);
                }
                else
                {
                    this.playTameEffect(false);
                    this.worldObj.setEntityState(this, (byte)6);
                }
            }

            return true;
        }

        return super.processInteract(player, p_184645_2_, stack);
    }
    public EntityPolarFox createChild(EntityAgeable ageable)
    {
        EntityPolarFox entityPolarFox = new EntityPolarFox(this.worldObj);
        UUID s = this.getOwnerId();

        if (s != null)
        {
            entityPolarFox.setOwnerId(s);
            entityPolarFox.setTamed(true);
        }

        return entityPolarFox;
    }
}
