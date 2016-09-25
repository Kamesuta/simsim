package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemUraniumIngot extends Item
{
	public ItemUraniumIngot()
	{
		final String name = "UraniumIngot";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:uranium_ingot" );

		GameRegistry.registerItem( this, name );

		return;
	}
}