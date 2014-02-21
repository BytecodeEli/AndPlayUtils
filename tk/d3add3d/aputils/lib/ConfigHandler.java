package tk.d3add3d.aputils.lib;

import java.io.File;

import net.minecraftforge.common.Configuration;

import tk.d3add3d.aputils.lib.BlockIDs;
import tk.d3add3d.aputils.lib.ItemIDs;
import tk.d3add3d.aputils.lib.MiscConfigs;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();

BlockIDs.BLOCK_dream = config.getBlock("dreamBlock", BlockIDs.BLOCK_dream_default).getInt();
BlockIDs.BLOCK_slime = config.getBlock("zelatinaBlock", BlockIDs.BLOCK_slime_default).getInt();
BlockIDs.BLOCK_customizerOre = config.getBlock("customizerOreBlock", BlockIDs.BLOCK_customizerOre_default).getInt();
BlockIDs.BLOCK_poweriumOre = config.getBlock("poweriumOreBlock", BlockIDs.BLOCK_poweriumOre_default).getInt();

ItemIDs.ITEM_customizerCrystal = config.getItem("customizerCrystalItem", ItemIDs.ITEM_customizerCrystal_default).getInt();
ItemIDs.ITEM_customizerCircuit = config.getItem("customizerCircuitItem", ItemIDs.ITEM_customizerCircuit_default).getInt();
ItemIDs.ITEM_customizerEnergyCore = config.getItem("customizerEnergyCoreItem", ItemIDs.ITEM_customizerEnergyCore_default).getInt();
ItemIDs.ITEM_customizerChargedCrystal = config.getItem("customizerChargedCrystalItem", ItemIDs.ITEM_customizerChargedCrystal_default).getInt();
ItemIDs.ITEM_customizerEnergyCoreAssembly = config.getItem("customizerEnergyCoreAssemblyItem", ItemIDs.ITEM_customizerEnergyCoreAssembly_default).getInt();
ItemIDs.ITEM_customizerBread = config.getItem("customizerBreadItem", ItemIDs.ITEM_customizerBread_default).getInt();
ItemIDs.ITEM_customizerBreadAssembly = config.getItem("customizerBreadAssemblyItem", ItemIDs.ITEM_customizerBreadAssembly_default).getInt();
ItemIDs.ITEM_aputilsDebugHunger = config.getItem("aputilsDebugHunger", ItemIDs.ITEM_aputilsDebugHunger_default).getInt();
ItemIDs.ITEM_aputilsBaconFood = config.getItem("aputilsBaconFoodItem", ItemIDs.ITEM_aputilsBaconFood_default).getInt();
ItemIDs.ITEM_aputilsHotDogFood = config.getItem("aputilsHodDogFoodItem", ItemIDs.ITEM_aputilsHotDogFood_default).getInt();
ItemIDs.ITEM_aputilsPorkMinced = config.getItem("aputilsPorkMincedItem", ItemIDs.ITEM_aputilsPorkMinced_default).getInt();
ItemIDs.ITEM_aputilsPorkDoubleMinced = config.getItem("aputilsPorkDoubleMincedItem", ItemIDs.ITEM_aputilsPorkDoubleMinced_default).getInt();
ItemIDs.ITEM_aputilsKlobasaFood = config.getItem("aputilsKlobasaFoodItem", ItemIDs.ITEM_aputilsKlobasaFood_default).getInt();
ItemIDs.ITEM_aputilsParokFood = config.getItem("aputilsParokFoodItem", ItemIDs.ITEM_aputilsParokFood_default).getInt();
ItemIDs.ITEM_poweriumGem = config.getItem("poweriumGemItem", ItemIDs.ITEM_poweriumGem_default).getInt();

MiscConfigs.MISC_generateNether = config.get("general", "Generate ores in Nether", MiscConfigs.MISC_generateNether_default, "0 for false, 1 for true").getInt();
MiscConfigs.MISC_generateEnd = config.get("general", "Generate ores in The End", MiscConfigs.MISC_generateEnd_default, "0 for false, 1 for true").getInt();

config.save();

}
}
