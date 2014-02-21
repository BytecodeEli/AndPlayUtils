package tk.d3add3d.aputils;

import java.util.Random;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;

public class AputilsBlockOrePowerium extends Block{

	private String blockTexture;

	public AputilsBlockOrePowerium(int par1, Material par2Material, String par3) {
		super(par1, par2Material);
		this.blockTexture = par3;
		this.setStepSound(Block.soundStoneFootstep);
		this.setCreativeTab(AputilsCore.tab);
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerIcons(IconRegister par1IconRegister){
		this.blockIcon = par1IconRegister.registerIcon("aputils:" + this.blockTexture);
	}
	
	@Override
	public int idDropped(int par1, Random par2Random, int par3) {
		return AputilsCore.poweriumGemItem.itemID;
		
	}
	
	@Override
	public boolean canSilkHarvest(){
		return true;
		
	}
	
}
