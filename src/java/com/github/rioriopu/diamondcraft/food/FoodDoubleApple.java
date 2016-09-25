package com.github.rioriopu.diamondcraft.food;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import net.minecraft.item.ItemFood;

public class FoodDoubleApple extends ItemFood{

	public FoodDoubleApple(final int j, final boolean b){
		super(j, b);
		setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		setTextureName("diamondcraft:double_apple");
	}

}
