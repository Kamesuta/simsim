package com.github.rioriopu.diamondcraft.proxy;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;
import com.github.rioriopu.diamondcraft.armor.DiamondCraftArmor;
import com.github.rioriopu.diamondcraft.block.DiamondCraftBlock;
import com.github.rioriopu.diamondcraft.food.DiamondCraftFood;
import com.github.rioriopu.diamondcraft.hammer.DiamondCraftHammer;
import com.github.rioriopu.diamondcraft.item.DiamondCraftItem;
import com.github.rioriopu.diamondcraft.tool.DiamondCraftTool;

import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class CommonProxy {
	public void preInit(final FMLPreInitializationEvent PreEvent)
	{
		DiamondCraftHammer.registry();
		DiamondCraftItem.registry();
		DiamondCraftBlock.registry();
		DiamondCraftArmor.mainRegistry();
		DiamondCraftTool.mainRegistry();
		DiamondCraftFood.mainRegistry();
	}

	public void init(final FMLInitializationEvent e)
	{
		DiamondCraftRecipe.registry();
	}

	public void postInit(final FMLPostInitializationEvent event)
	{
	}

	public int addArmor(final String armor){
		return 0;
	}
}
