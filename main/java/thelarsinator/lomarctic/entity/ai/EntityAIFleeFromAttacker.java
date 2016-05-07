package thelarsinator.lomarctic.entity.ai;

import java.util.Iterator;
import java.util.List;

import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.entity.passive.EntityAnimal;
import net.minecraft.util.math.Vec3d;
import thelarsinator.lomarctic.entity.EntityPolarFox;

public class EntityAIFleeFromAttacker extends EntityAIBase
{
    /** The child that is following its parent. */
    EntityAnimal defender;
    EntityPolarFox attacker;
    double speed;
    private int field_75345_d;
    private static final String __OBFID = "CL_00001586";
    private double randPosX;
    private double randPosY;
    private double randPosZ;

    public EntityAIFleeFromAttacker(EntityAnimal p_i1626_1_, double p_i1626_2_)
    {
        this.defender = p_i1626_1_;
        this.speed = p_i1626_2_;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        List list = this.defender.worldObj.getEntitiesWithinAABB(this.defender.getClass(), this.defender.getEntityBoundingBox().expand(8.0D, 4.0D, 8.0D));
        EntityPolarFox entityanimal = null;
        double d0 = Double.MAX_VALUE;
        Iterator iterator = list.iterator();

        //Find closest polar fox
        while (iterator.hasNext())
        {
        	EntityPolarFox entityanimal1 = (EntityPolarFox)iterator.next();

            double d1 = this.defender.getDistanceSqToEntity(entityanimal1);

            if (d1 <= d0)
            {
                d0 = d1;
                entityanimal = entityanimal1;
            }
        }

        if (entityanimal == null)
        {
            return false;
        }
        else if (d0 < 9.0D)
        {
            return false;
        }
        else
        {
            this.attacker = entityanimal;
        	Vec3d vector = new Vec3d(this.attacker.posX, this.attacker.posY, this.attacker.posZ);
        	
        	Vec3d vec3 = RandomPositionGenerator.findRandomTargetBlockAwayFrom(this.defender, 10, 10, vector);
            
            this.randPosX = vec3.xCoord;
            this.randPosY = vec3.yCoord;
            this.randPosZ = vec3.zCoord;
            return true;
        }
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
    	if (!this.attacker.isEntityAlive())
        {
            return false;
        }
        else
        {
            double d0 = this.defender.getDistanceSqToEntity(this.attacker);
            return d0 >= 9.0D && d0 <= 256.0D;
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.field_75345_d = 0;
    }

    /**
     * Resets the task
     */
    public void resetTask()
    {
        this.attacker = null;
    }

    /**
     * Updates the task
     */
    public void updateTask()
    {	
        if (--this.field_75345_d <= 0)
        {
            this.field_75345_d = 10;
            this.defender.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, this.speed);
        }
    }
}