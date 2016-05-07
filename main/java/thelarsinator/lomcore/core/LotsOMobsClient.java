package thelarsinator.lomcore.core;

import net.minecraft.client.Minecraft;
import net.minecraft.client.settings.KeyBinding;
import net.minecraft.entity.player.EntityPlayer;
import thelarsinator.lomcore.core.handler.ModelHandler;


public class LotsOMobsClient implements LotsOMobsProxy
{
    @Override
	public void preInit()
    {
    	ModelHandler.INSTANCE.registerAllModels();
    	
    }
	private final Minecraft minecraft = Minecraft.getMinecraft();

	@Override
	public void init() {
	}

	@Override
	public void postInit() {

	}

	@Override
	public void doClientRightClick() {
		// Press the Use Item keybinding
		KeyBinding.onTick(minecraft.gameSettings.keyBindUseItem.getKeyCode());
	}

	@Override
	public EntityPlayer getClientPlayer() {
		return minecraft.thePlayer;
	}
}
