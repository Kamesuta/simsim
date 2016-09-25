package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemDarkCrystal extends Item
{
	public ItemDarkCrystal()
	{
		final String name = "DarkCrystal";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:darkcrystal" );

		GameRegistry.registerItem( this, name );

		return;
	}
}