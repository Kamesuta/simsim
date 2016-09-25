package com.github.rioriopu.diamondcraft.block;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;

public class DiamondCraftBlock
{
	public static Block CompressedDiamondBlock;
	public static Block LightDiamondBlock;
	public static Block LightDiamondOre;
	public static Block UraniumOre;
	public static Block UraniumBlock;
	public static Block TwilightPortalBlock;
	public static Block sapphireChest;


	public static void registry()
	{
		CompressedDiamondBlock = new BlockCompressedDiamond();
		LightDiamondBlock = new BlockLightDiamond();
		LightDiamondOre = new OreLightDiamond();
		UraniumOre = new OreUranium();
		UraniumBlock = new BlockUranium();
		TwilightPortalBlock = new BlockTwilightPortal();
		sapphireChest = new BlockReverseChest(0).setBlockName("Reverse Chest").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);

		return;
	}
	public static void registerBlocks(){
		GameRegistry.registerBlock(sapphireChest, "sapphireChest");
	}
}