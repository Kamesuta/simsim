package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemDiamondStick extends Item
{
	public ItemDiamondStick()
	{
		final String name = "DiamondStick";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:diamondstick" );

		GameRegistry.registerItem( this, name );

		return;
	}
}