package tk.d3add3d.aputils.lib;

import java.io.File;

import net.minecraftforge.common.Configuration;

import tk.d3add3d.aputils.lib.BlockIDs;
import tk.d3add3d.aputils.lib.ItemIDs;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();

BlockIDs.BLOCK_dream = config.getBlock("dreamBlock", BlockIDs.BLOCK_dream_default).getInt();
BlockIDs.BLOCK_slime = config.getBlock("zelatinaBlock", BlockIDs.BLOCK_slime_default).getInt();
BlockIDs.BLOCK_customizerOre = config.getBlock("customizerOreBlock", BlockIDs.BLOCK_customizerOre_default).getInt();
ItemIDs.ITEM_customizerCrystal = config.getItem("customizerCrystalItem", ItemIDs.ITEM_customizerCrystal_default).getInt();
ItemIDs.ITEM_customizerCircuit = config.getItem("customizerCircuitItem", ItemIDs.ITEM_customizerCircuit_default).getInt();
ItemIDs.ITEM_customizerEnergyCore = config.getItem("customizerEnergyCoreItem", ItemIDs.ITEM_customizerEnergyCore_default).getInt();
ItemIDs.ITEM_customizerChargedCrystal = config.getItem("customizerChargedCrystalItem", ItemIDs.ITEM_customizerChargedCrystal_default).getInt();
ItemIDs.ITEM_customizerEnergyCoreAssembly = config.getItem("customizerEnergyCoreAssemblyItem", ItemIDs.ITEM_customizerEnergyCoreAssembly_default).getInt();
ItemIDs.ITEM_customizerBread = config.getItem("customizerBreadItem", ItemIDs.ITEM_customizerBread_default).getInt();
ItemIDs.ITEM_customizerBreadAssembly = config.getItem("customizerBreadAssemblyItem", ItemIDs.ITEM_customizerBreadAssembly_default).getInt();

config.save();

}
}
