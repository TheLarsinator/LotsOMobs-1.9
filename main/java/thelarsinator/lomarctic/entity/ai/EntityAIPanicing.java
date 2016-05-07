package thelarsinator.lomarctic.entity.ai;

import java.util.Random;

import net.minecraft.entity.EntityCreature;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.math.Vec3d;

public class EntityAIPanicing extends EntityAIBase
{
    private EntityCreature theEntityCreature;
    protected double speed;
    private double randPosX;
    private double randPosY;
    private double randPosZ;
    private static final String __OBFID = "CL_00001604";

    public EntityAIPanicing(EntityCreature p_i1645_1_, double p_i1645_2_)
    {
        this.theEntityCreature = p_i1645_1_;
        this.speed = p_i1645_2_;
        this.setMutexBits(1);
    }

    /**
     * Returns whether the EntityAIBase should begin execution.
     */
    public boolean shouldExecute()
    {
        if (this.theEntityCreature.getAITarget() == null && !this.theEntityCreature.isBurning())
        {
            return false;
        }
        else
        {
        	Vec3d vec3 = RandomPositionGenerator.findRandomTarget(this.theEntityCreature, 10, 10);

            if (vec3 == null)
            {
                return false;
            }
            else
            {
                this.randPosX = vec3.xCoord;
                this.randPosY = vec3.yCoord;
                this.randPosZ = vec3.zCoord;
                return true;
            }
        }
    }

    /**
     * Execute a one shot task or start executing a continuous task
     */
    public void startExecuting()
    {
        this.theEntityCreature.getNavigator().tryMoveToXYZ(this.randPosX, this.randPosY, this.randPosZ, this.speed);
    }

    /**
     * Returns whether an in-progress EntityAIBase should continue executing
     */
    public boolean continueExecuting()
    {
    	Random rand = new Random();
    	if(rand.nextInt(2) == 1)
        return !this.theEntityCreature.getNavigator().noPath();
    	else
    	return true;
    }
}