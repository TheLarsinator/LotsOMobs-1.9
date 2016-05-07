package thelarsinator.lomdeserts.entity;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.IEntityLivingData;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.monster.EntitySpider;
import net.minecraft.init.MobEffects;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.DifficultyInstance;
import net.minecraft.world.EnumDifficulty;
import net.minecraft.world.World;

public class EntityScorpion extends EntityDaySpiderBase
{
    private static final String __OBFID = "CL_00001683";

    public EntityScorpion(World worldIn)
    {
        super(worldIn);
        this.setSize(0.2F, 0.3F);
    }

    protected void applyEntityAttributes()
    {
        super.applyEntityAttributes();
        this.getEntityAttribute(SharedMonsterAttributes.MAX_HEALTH).setBaseValue(12.0D);
    }

    public boolean attackEntityAsMob(Entity p_70652_1_)
    {
        if (super.attackEntityAsMob(p_70652_1_))
        {
            if (p_70652_1_ instanceof EntityLivingBase)
            {
                byte b0 = 0;

                if (this.worldObj.getDifficulty() == EnumDifficulty.NORMAL)
                {
                    b0 = 7;
                }
                else if (this.worldObj.getDifficulty() == EnumDifficulty.HARD)
                {
                    b0 = 15;
                }

                if (b0 > 0)
                {
                    ((EntityLivingBase)p_70652_1_).addPotionEffect(new PotionEffect(MobEffects.poison, b0 * 20, 0));
                }
            }

            return true;
        }
        else
        {
            return false;
        }
    }

    public IEntityLivingData func_180482_a(DifficultyInstance p_180482_1_, IEntityLivingData p_180482_2_)
    {
        return p_180482_2_;
    }

    public float getEyeHeight()
    {
        return 0.45F;
    }

	public float spiderScaleAmount() {
		return 0.2F;
	}
}