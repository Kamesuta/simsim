package com.github.rioriopu.diamondcraft.block;

import java.util.Random;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;

public class BlockCompressedDiamond extends Block
{
	public BlockCompressedDiamond() {
		super(Material.rock);
		final String compresseddiamondblock = "CompressedDiamondBlock";
		setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);/*クリエイティブタブの選択*/
		setBlockName("CompressedDiamondBlock");/*システム名の設定*/
		setBlockTextureName( "diamondcraft:compresseddiamond_block" );/*ブロックのテクスチャの指定(複数指定の場合は消してください)*/
		/*以下のものは消しても結構です*/
		setHardness(1.5F);/*硬さ*/
		GameRegistry.registerBlock( this, compresseddiamondblock );
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
