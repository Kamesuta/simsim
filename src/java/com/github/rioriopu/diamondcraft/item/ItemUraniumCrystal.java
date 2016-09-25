package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemUraniumCrystal extends Item
{
	public ItemUraniumCrystal()
	{
		final String name = "UraniumCrystal";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:uraniumcrystal" );

		GameRegistry.registerItem( this, name );

		return;
	}
}