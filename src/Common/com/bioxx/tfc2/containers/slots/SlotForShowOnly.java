package com.bioxx.tfc2.containers.slots;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.IInventory;
import net.minecraft.inventory.Slot;
import net.minecraft.item.ItemStack;

public class SlotForShowOnly extends Slot
{
	public SlotForShowOnly(IInventory iinventory, int i, int j, int k)
	{
		super(iinventory, i, j, k);
	}

	@Override
	public boolean canTakeStack(EntityPlayer par1EntityPlayer)
	{
		return false;
	}

	@Override
	public boolean isItemValid(ItemStack par1ItemStack)
	{
		return false;
	}

	@Override
	public int getSlotStackLimit()
	{
		return 0;
	}
	@Override
	public int getItemStackLimit(ItemStack stack)
	{
		return 0;
	}
}
