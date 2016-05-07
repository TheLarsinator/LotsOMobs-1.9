package thelarsinator.lomcore.core;

import net.minecraft.entity.player.EntityPlayer;

public interface LotsOMobsProxy
{
	void preInit();

	void init();

	void postInit();

	/**
	 * Perform a right click on the client side.
	 */
	void doClientRightClick();

	/**
	 * Get the client player if on the client, or null if on the dedicated server.
	 *
	 * @return The client player
	 */
	EntityPlayer getClientPlayer();
}