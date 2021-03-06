package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemIronPlate extends Item{

	public ItemIronPlate()
	{
		final String name = "IronPlate";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:IronPlate" );

		GameRegistry.registerItem( this, name );

		return;
	}
}