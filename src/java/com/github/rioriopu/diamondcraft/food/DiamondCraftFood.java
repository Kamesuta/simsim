package com.github.rioriopu.diamondcraft.food;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class DiamondCraftFood {


	public static void mainRegistry(){
    	initItems();
    	registerItems();
    }

    public static Item DoubleApple = new ItemFood(32, 10, false);

	public static void initItems(){

		RenderingRegistry.addNewArmourRendererPrefix("5");

	   	DoubleApple = new FoodDoubleApple(10, false).setUnlocalizedName("DoubleApple");
	}

	public static void registerItems(){

    	GameRegistry.registerItem(DoubleApple, "DoubleApple");
	}


}