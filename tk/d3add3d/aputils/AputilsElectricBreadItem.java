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
public class AputilsElectricBreadItem extends AputilsElectricItem {

	public AputilsElectricBreadItem(int par1) {
		super(par1);
		this.maxCharge = 150000;
		this.tier = 3;
		this.transferLimit = 2048;
	}
	
	public ItemStack onItemRightClick(ItemStack itemstack, World world, EntityPlayer player) {
		if(ElectricItem.manager.use(itemstack, 1500, player)) {
			if(!world.isRemote)
				player.addChatMessage("Beep! I mean: Adding food...");
		player.getFoodStats().addStats(20, 20.0F);
		} else {
			if(!world.isRemote)
				player.addChatMessage("Blip-blop! I mean: Not enough energy...");
		}
		return itemstack;
	}
}
