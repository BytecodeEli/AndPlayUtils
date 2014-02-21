package tk.d3add3d.aputils;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.client.*;
import cpw.mods.fml.relauncher.*;

@SuppressWarnings("unused")
public class AputilsBlock extends Block{

	private String blockTexture;

	public AputilsBlock(int par1, Material par2Material, String par3String) {
		super(par1, par2Material);
		this.blockTexture = par3String;
		this.setCreativeTab(AputilsCore.tab);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon("aputils:" + this.blockTexture);
	}
	
}
