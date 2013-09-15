package tk.d3add3d.aputils;

import ic2.api.item.ElectricItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.client.*;
import cpw.mods.fml.relauncher.*;

@SuppressWarnings("unused")
public class AputilsElectricDebugHungerItem extends AputilsElectricItem {

	public AputilsElectricDebugHungerItem(int par1) {
		super(par1);
		this.maxCharge = 1000;
		this.tier = 1;
		this.transferLimit = 32;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if(ElectricItem.manager.use(itemstack, 0, player)) {
			if(!world.isRemote)
				player.addChatMessage("DEBUG: ADDING HUNGER!");
		player.getFoodStats().addStats(-18, 0.1F);
		} else {
			if(!world.isRemote)
				player.addChatMessage("DEBUG: NOT ENOUGH CHARGE!");
		}
		return itemstack;
	}
}
