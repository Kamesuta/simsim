package com.github.rioriopu.diamondcraft.enchantment;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.EnumEnchantmentType;

public class EnchantmentSpeedBooster extends Enchantment{

	public EnchantmentSpeedBooster(int id, int rarity){
		super(id, rarity, EnumEnchantmentType.armor_feet);
		this.setName("SpeedBooster");
	}

	public int getMinEnchantability(int par1){
		return 5 + (par1 - 1) * 10;
	}

	public int getMaxEnchantability(int par1){
		return this.getMinEnchantability(par1) + 20;
	}

	public int getMaxLevel(){
		return 3;
	}

}
