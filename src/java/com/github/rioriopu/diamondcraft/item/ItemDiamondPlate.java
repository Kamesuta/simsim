package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemDiamondPlate extends Item
{
	public ItemDiamondPlate()
	{
		final String name = "DiamondPlate";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:DiamondPlate" );

		GameRegistry.registerItem( this, name );

		return;
	}
}