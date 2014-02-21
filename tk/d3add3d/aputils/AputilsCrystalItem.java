package tk.d3add3d.aputils;

import java.util.List;

import net.minecraft.util.EnumChatFormatting;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.Entity;
import cpw.mods.fml.client.*;
import cpw.mods.fml.relauncher.*;

@SuppressWarnings("unused")
public class AputilsCrystalItem extends Item {
	
	public AputilsCrystalItem(int par1, String par3String) {
		super(par1);
		this.setTextureName(par3String);
		this.setCreativeTab(AputilsCore.tab);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addInformation(ItemStack par1ItemStack, List par2List){
		par2List.add(EnumChatFormatting.YELLOW + "Seems to change apperance for a tick...");
	}

}
