package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemCompressedDiamond extends Item
{
	public ItemCompressedDiamond()
	{
		final String name = "CompressedDiamond";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:compresseddiamond" );

		GameRegistry.registerItem( this, name );

		return;
	}
}