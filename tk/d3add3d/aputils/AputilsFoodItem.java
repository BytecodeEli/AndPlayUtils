package tk.d3add3d.aputils;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import cpw.mods.fml.client.*;
import cpw.mods.fml.relauncher.*;

@SuppressWarnings("unused")
public class AputilsFoodItem extends ItemFood {

	public AputilsFoodItem(int par1, int par2, float par3, String par4String) {
		//par1 - id, par2 - foodStat, par3 - saturation, bool - wolf food
		super(par1, par2, par3, false);
		this.setTextureName("aputils:" + par4String);
		this.setCreativeTab(AputilsCore.tab);
	}
}
