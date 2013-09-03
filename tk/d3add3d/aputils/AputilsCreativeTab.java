package tk.d3add3d.aputils;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;

public class AputilsCreativeTab extends CreativeTabs {
	public AputilsCreativeTab(int id, String name) {
		super(id, name);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public int getTabIconItemIndex() {
		return AputilsCore.slimeBlock.blockID;
	}
	
	@Override
    public String getTranslatedTabLabel() {
        return "AndPlay Utils";
    }
}
