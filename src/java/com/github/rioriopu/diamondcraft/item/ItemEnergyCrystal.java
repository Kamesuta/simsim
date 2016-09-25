package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;

public class ItemEnergyCrystal extends Item
{
	public ItemEnergyCrystal()
	{
		final String name = "EnergyCrystal";

		setCreativeTab( DiamondCraftRecipe.DiamondCraftTab );
		setUnlocalizedName( name );
		this.maxStackSize = 64;
		setTextureName( "diamondcraft:energycrystal" );

		GameRegistry.registerItem( this, name );

		return;
	}
}