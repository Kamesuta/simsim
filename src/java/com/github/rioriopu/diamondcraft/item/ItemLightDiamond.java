package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemLightDiamond extends Item
{
	public ItemLightDiamond()
	{
		final String name = "LightDiamond";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:lightdiamond" );

		GameRegistry.registerItem( this, name );

		return;
	}
}