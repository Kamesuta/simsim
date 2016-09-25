package com.github.rioriopu.diamondcraft.block;

import java.util.Random;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockUranium extends Block
{
	public BlockUranium() {
		super(Material.rock);
		final String uraniumblock = "UraniumBlock";
		setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);/*クリエイティブタブの選択*/
		setBlockName("UraniumBlock");/*システム名の設定*/
		setBlockTextureName( "diamondcraft:uranium_block" );/*ブロックのテクスチャの指定(複数指定の場合は消してください)*/
		/*以下のものは消しても結構です*/
		setHardness(1.5F);/*硬さ*/
		GameRegistry.registerBlock( this, uraniumblock );
	}

	@Override
	public int quantityDropped(final int meta, final int fortune, final Random random){
		//ドロップするアイテムを返す
		return quantityDroppedWithBonus(fortune, random);
	}
	@Override
	public int quantityDropped(final Random random){
		//ドロップさせる量を返す
		return 1;
	}


}
