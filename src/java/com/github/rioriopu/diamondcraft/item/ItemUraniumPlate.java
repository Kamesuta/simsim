package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemUraniumPlate extends Item
{
	public ItemUraniumPlate()
	{
		final String name = "UraniumPlate";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:uraniumplate" );

		GameRegistry.registerItem( this, name );

		return;
	}
}