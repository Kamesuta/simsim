package com.github.rioriopu.diamondcraft;

import com.github.rioriopu.diamondcraft.armor.DiamondCraftArmor;
import com.github.rioriopu.diamondcraft.block.DiamondCraftBlock;
import com.github.rioriopu.diamondcraft.item.DiamondCraftItem;
import com.github.rioriopu.diamondcraft.tool.DiamondCraftTool;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class DiamondCraftRecipe
{
	public static CreativeTabs DiamondCraftTab = new CreativeTabs( "DiamondCraft" ) {
		@Override
		public Item getTabIconItem()
		{
			return DiamondCraftTool.ObsidianPickaxe;
		}
	};

	public static void registry()
	{
		//アイテムレシピ
		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftItem.DiamondStick, 1 ),
				new Object[] {
						" x ",
						" x ",
						'x', Items.diamond } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftItem.CompressedDiamond, 1 ),
				new Object[] {
						"x",
						"y",
						'x', Blocks.planks,
						'y', Items.diamond } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftItem.IronHammer, 1 ),
				new Object[] {
						"x x x",
						"x x x",
						"  y  ",
						'x', Items.iron_ingot,
						'y', Items.stick } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftItem.GoldHammer, 1 ),
				new Object[] {
						"x x x",
						"x x x",
						"  y  ",
						'x', Items.gold_ingot,
						'y', Items.stick } );

		GameRegistry.addRecipe(
				new ItemStack( Blocks.stone_slab, 12 ),
				new Object[] {
						"x",
						"y",
						'x', Blocks.stone,
						'y', DiamondCraftItem.GoldHammer } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftItem.CompressedDiamond, 9 ),
				new Object[] {
						"x",
						'x', DiamondCraftBlock.CompressedDiamondBlock,} );

		//ブロックレシピ
		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftBlock.CompressedDiamondBlock, 1 ),
				new Object[] {
						"xxx",
						"xxx",
						"xxx",
						'x', Blocks.diamond_block } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftBlock.LightDiamondBlock, 1 ),
				new Object[] {
						"xxx",
						"xxx",
						"xxx",
						'x', DiamondCraftItem.LightDiamond } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftBlock.UraniumBlock, 1 ),
				new Object[] {
						"xxx",
						"xxx",
						"xxx",
						'x', DiamondCraftItem.UraniumIngot } );


		//防具レシピ
		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftArmor.LightDiamondHelmet, 1 ),
				new Object[] {
						"xxx",
						"x x",
						'x', DiamondCraftItem.LightDiamond } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftArmor.LightDiamondChestPlate, 1 ),
				new Object[] {
						"x x",
						"xxx",
						"xxx",
						'x', DiamondCraftItem.LightDiamond } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftArmor.LightDiamondLeggings, 1 ),
				new Object[] {
						"xxx",
						"x x",
						"x x",
						'x', DiamondCraftItem.LightDiamond } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftArmor.LightDiamondBoots, 1 ),
				new Object[] {
						"x x",
						"x x",
						'x', DiamondCraftItem.LightDiamond } );

		//ツールレシピ
		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftTool.ObsidianPickaxe, 1 ),
				new Object[] {
						"yyy",
						" x ",
						" x ",
						'x', DiamondCraftItem.DiamondStick,
						'y', Blocks.obsidian } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftTool.ObsidianShovel, 1 ),
				new Object[] {
						" y ",
						" x ",
						" x ",
						'x', DiamondCraftItem.DiamondStick,
						'y', Blocks.obsidian } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftTool.ObsidianAxe, 1 ),
				new Object[] {
						"yy ",
						"yx ",
						" x ",
						'x', DiamondCraftItem.DiamondStick,
						'y', Blocks.obsidian } );

		GameRegistry.addRecipe(
				new ItemStack( DiamondCraftTool.ObsidianSword, 1 ),
				new Object[] {
						" y ",
						" y ",
						" x ",
						'x', DiamondCraftItem.DiamondStick,
						'y', Blocks.obsidian } );

		return;
	}
}
