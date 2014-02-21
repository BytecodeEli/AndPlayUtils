package tk.d3add3d.aputils;

import net.minecraft.item.Item;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.client.*;
import cpw.mods.fml.relauncher.*;

@SuppressWarnings("unused")
public class AputilsItem extends Item {
	
	public AputilsItem(int par1, String par3String) {
		super(par1);
		this.setTextureName("aputils:" + par3String);
		this.setCreativeTab(AputilsCore.tab);
	}

}
