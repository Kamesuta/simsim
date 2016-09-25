package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemGoldPlate extends Item{

	public ItemGoldPlate()
	{
		final String name = "GoldPlate";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:GoldPlate" );

		GameRegistry.registerItem( this, name );

		return;
	}
}