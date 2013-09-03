package tk.d3add3d.aputils;

import ic2.api.recipe.*;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.FurnaceRecipes;
import tk.d3add3d.aputils.lib.BlockIDs;
import tk.d3add3d.aputils.lib.ConfigHandler;
import tk.d3add3d.aputils.lib.ItemIDs;
import tk.d3add3d.aputils.lib.Reference;
import cpw.mods.fml.common.IWorldGenerator;
import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import cpw.mods.fml.common.registry.LanguageRegistry;

@SuppressWarnings("unused")
@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.VERSION_NUMBER)
public class AputilsCore {
	
	public static Block dreamBlock, slimeBlock, customizerOreBlock;
	public static Item customizerCrystalItem, customizerCircuitItem, customizerEnergyCoreItem, customizerChargedCrystalItem, customizerEnergyCoreAssemblyItem, customizerBreadItem, customizerBreadAssemblyItem;
	public static AputilsCreativeTab tab = new AputilsCreativeTab(AputilsCreativeTab.getNextID(),Reference.MOD_ID);
	
		
@EventHandler
public void preInit(FMLPreInitializationEvent event) {
	ConfigHandler.init(event.getSuggestedConfigurationFile());
}

@EventHandler
public void load(FMLInitializationEvent event) {
	
	//init blocks and items
	dreamBlock = new AputilsBlock(BlockIDs.BLOCK_dream, Material.cloth, "dreamBlock").setHardness(0.0F).setResistance(200.0F).setUnlocalizedName("dreamBlock").setStepSound(Block.soundClothFootstep).setLightValue(1.0F).setCreativeTab(AputilsCore.tab);
	slimeBlock = new AputilsBlock(BlockIDs.BLOCK_slime, Material.rock, "slimeBlock").setHardness(1.0F).setLightOpacity(4).setUnlocalizedName("slimeBlock").setStepSound(Block.soundSnowFootstep).setLightValue(0.1F).setCreativeTab(AputilsCore.tab);
	customizerOreBlock = new AputilsBlock(BlockIDs.BLOCK_customizerOre, Material.rock, "customizerOreBlock").setHardness(2.0F).setResistance(1.0F).setUnlocalizedName("customizerOreBlock").setStepSound(Block.soundStoneFootstep).setLightOpacity(7).setCreativeTab(AputilsCore.tab);
	customizerCrystalItem = new AputilsItem(ItemIDs.ITEM_customizerCrystal).setMaxStackSize(64).setUnlocalizedName("customizerCrystalItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerCrystalItem");
	customizerChargedCrystalItem = new AputilsItem(ItemIDs.ITEM_customizerChargedCrystal).setMaxStackSize(64).setUnlocalizedName("customizerChargedCrystalItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerChargedCrystalItem");
	customizerCircuitItem = new AputilsItem(ItemIDs.ITEM_customizerCircuit).setMaxStackSize(16).setUnlocalizedName("customizerCircuitItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerCircuitItem");
	customizerEnergyCoreItem = new AputilsItem(ItemIDs.ITEM_customizerEnergyCore).setMaxStackSize(1).setUnlocalizedName("customizerEnergyCoreItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerEnergyCoreItem");
	customizerEnergyCoreAssemblyItem = new AputilsItem(ItemIDs.ITEM_customizerEnergyCoreAssembly).setMaxStackSize(1).setUnlocalizedName("customizerEnergyCoreAssemblyItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerEnergyCoreAssemblyItem");
	customizerBreadItem = new AputilsItem(ItemIDs.ITEM_customizerBread).setMaxStackSize(1).setUnlocalizedName("customizerBreadItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerBreadItem");
	customizerBreadAssemblyItem = new AputilsItem(ItemIDs.ITEM_customizerBreadAssembly).setMaxStackSize(16).setUnlocalizedName("customizerBreadAssemblyItem").setCreativeTab(AputilsCore.tab).func_111206_d("aputils:customizerBreadAssemblyItem");
	
	//block registers
	LanguageRegistry.addName(dreamBlock, "Dream Block");
	GameRegistry.registerBlock(dreamBlock, "dreamBlock");
	LanguageRegistry.addName(slimeBlock, "Slime Block");
	GameRegistry.registerBlock(slimeBlock, "slimeBlock");
	LanguageRegistry.addName(customizerOreBlock, "Customizer Ore");
	GameRegistry.registerBlock(customizerOreBlock, "customizerOreBlock");
	
	//item registers
	LanguageRegistry.addName(customizerCrystalItem, "Customizer Crystal");
	GameRegistry.registerItem(customizerCrystalItem, "customizerCrystalItem");
	LanguageRegistry.addName(customizerCircuitItem, "Customizer Circuit");
	GameRegistry.registerItem(customizerCircuitItem, "customizerCircuitItem");
	GameRegistry.registerItem(customizerEnergyCoreItem, "customizerEnergyCoreItem");
	GameRegistry.registerItem(customizerEnergyCoreAssemblyItem, "customizerEnergyCoreAssemblyItem");
	GameRegistry.registerItem(customizerBreadItem, "customizerBreadItem");
	GameRegistry.registerItem(customizerBreadAssemblyItem, "customizerBreadAssemblyItem");
	
}

@EventHandler
public void postInit(FMLPostInitializationEvent event) {
	
	//define ItemStacks
	ItemStack slimeBlockStack = new ItemStack(slimeBlock);
	ItemStack customizerCrystalStack = new ItemStack(customizerCrystalItem);
	ItemStack customizerOreStack = new ItemStack(customizerOreBlock);
	ItemStack customizerChargedCrystalStack = new ItemStack(customizerChargedCrystalItem);
	ItemStack customizerCircuitStack = new ItemStack(customizerCircuitItem);
	ItemStack customizerEnergyCoreStack = new ItemStack(customizerEnergyCoreItem);
	ItemStack vanillaDiamondStack = new ItemStack(Item.diamond);
	ItemStack vanillaRedstoneStack = new ItemStack(Item.redstone);
	ItemStack vanillaIronStack = new ItemStack(Item.ingotIron);
	ItemStack vanillaBreadStack = new ItemStack(Item.bread);
	ItemStack vanillaLimeDyeStack = new ItemStack(Item.dyePowder, 1, 10);
	
	//smelting registers
	GameRegistry.addSmelting(customizerOreBlock.blockID, new ItemStack(customizerCrystalItem, 2), 0.1F);
	FurnaceRecipes.smelting().addSmelting(customizerCrystalItem.itemID, 0, new ItemStack(customizerChargedCrystalItem), 0.2F);
	FurnaceRecipes.smelting().addSmelting(customizerEnergyCoreAssemblyItem.itemID, 0, new ItemStack(customizerEnergyCoreItem), 0.3F);
	FurnaceRecipes.smelting().addSmelting(customizerBreadAssemblyItem.itemID, 0, new ItemStack(customizerBreadItem), 0.8F);
	//temp recipe
	GameRegistry.addSmelting(22, new ItemStack(customizerOreBlock, 16), 0.1F);
	
	//crafting registers
	GameRegistry.addRecipe(new ItemStack(dreamBlock, 4), "   ", " x ", "   ", 'x', customizerCrystalStack);
	GameRegistry.addShapelessRecipe(new ItemStack(slimeBlock, 3), customizerCrystalStack, vanillaLimeDyeStack);
	GameRegistry.addRecipe(new ItemStack(customizerEnergyCoreAssemblyItem), "dxd", "xyx", "dxd", 'x', customizerChargedCrystalStack, 'y', customizerCrystalStack, 'd', vanillaDiamondStack);
	GameRegistry.addRecipe(new ItemStack(customizerCircuitItem), "rcr", "chc", "rir", 'r', vanillaRedstoneStack, 'c', customizerCrystalStack, 'h', customizerChargedCrystalStack, 'i', vanillaIronStack);
	GameRegistry.addRecipe(new ItemStack(customizerBreadAssemblyItem), "qrq", "fcf", "bqb", 'q', customizerCircuitStack, 'r', customizerCrystalStack, 'c', customizerEnergyCoreStack, 'f', customizerChargedCrystalStack, 'b', vanillaBreadStack);
	
	//ic2 macerating recipes
	if (Loader.isModLoaded("IC2")) {
	Recipes.macerator.addRecipe(new RecipeInputItemStack(customizerOreStack, 1), null, new ItemStack(customizerCrystalItem, 4));
	Recipes.extractor.addRecipe(new RecipeInputItemStack(slimeBlockStack, 64), null, new ItemStack(Item.slimeBall, 16));
	}
	
}

}