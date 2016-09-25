package com.github.rioriopu.diamondcraft.hammer;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;
import com.github.rioriopu.diamondcraft.item.DiamondCraftItem;
import com.github.rioriopu.diamondcraft.item.ItemHammerDarkCrystal;
import com.github.rioriopu.diamondcraft.item.ItemHammerDiamond;
import com.github.rioriopu.diamondcraft.item.ItemHammerGold;
import com.github.rioriopu.diamondcraft.item.ItemHammerIron;
import com.github.rioriopu.diamondcraft.item.ItemHammerUranium;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

public class DiamondCraftHammer
{
	public static ItemHammerIron IronHammer;
	public static ItemHammerGold GoldHammer;
	public static ItemHammerDiamond DiamondHammer;
	public static ItemHammerUranium UraniumHammer;
	public static ItemHammerDarkCrystal DarkCrystalHammer;

	public static void registry()
	{
		IronHammer = new ItemHammerIron();
		IronHammer.setUnlocalizedName("ironhammer").setTextureName("diamondcraft:IronHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		//1.7以降はこのメソッドで登録。
		GameRegistry.registerItem(IronHammer, "IronHammer");
		{
			//onCraftingがイベント処理に変わったので、FMLに登録。
			FMLCommonHandler.instance().bus().register(IronHammer);
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.IronPlate, 2, 3),
					new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(IronHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.GoldPlate, 2, 3),
					new ItemStack(Items.gold_ingot), new ItemStack(Items.gold_ingot), new ItemStack(IronHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.DiamondPlate, 2, 3),
					new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack(IronHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.UraniumPlate, 2, 3),
					new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(IronHammer,1,32767));
		}

		//アイテムの登録はpreInitで行う必要あり。
		GoldHammer = new ItemHammerGold();
		GoldHammer.setUnlocalizedName("goldhammer").setTextureName("diamondcraft:GoldHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		//1.7以降はこのメソッドで登録。
		GameRegistry.registerItem(GoldHammer, "GoldHammer");
		{
			//onCraftingがイベント処理に変わったので、FMLに登録。
			FMLCommonHandler.instance().bus().register(GoldHammer);
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.IronPlate, 2, 3),
					new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(GoldHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.GoldPlate, 2, 3),
					new ItemStack(Items.gold_ingot), new ItemStack(Items.gold_ingot), new ItemStack(GoldHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.DiamondPlate, 2, 3),
					new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack(GoldHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.UraniumPlate, 2, 3),
					new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(GoldHammer,1,32767));
		}

		//アイテムの登録はpreInitで行う必要あり。
		DiamondHammer = new ItemHammerDiamond();
		DiamondHammer.setUnlocalizedName("DiamondHammer").setTextureName("diamondcraft:DiamondHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		//1.7以降はこのメソッドで登録。
		GameRegistry.registerItem(DiamondHammer, "DiamondHammer");
		{
			//onCraftingがイベント処理に変わったので、FMLに登録。
			FMLCommonHandler.instance().bus().register(DiamondHammer);
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.IronPlate, 2, 3),
					new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(DiamondHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.GoldPlate, 2, 3),
					new ItemStack(Items.gold_ingot), new ItemStack(Items.gold_ingot), new ItemStack(DiamondHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.DiamondPlate, 2, 3),
					new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack(DiamondHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.UraniumPlate, 2, 3),
					new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DiamondHammer,1,32767));
		}

		//アイテムの登録はpreInitで行う必要あり。
		UraniumHammer = new ItemHammerUranium();
		UraniumHammer.setUnlocalizedName("UraniumHammer").setTextureName("diamondcraft:UraniumHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		//1.7以降はこのメソッドで登録。
		GameRegistry.registerItem(UraniumHammer, "UraniumHammer");
		{
			//onCraftingがイベント処理に変わったので、FMLに登録。
			FMLCommonHandler.instance().bus().register(UraniumHammer);
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.IronPlate, 2, 3),
					new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(UraniumHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.GoldPlate, 2, 3),
					new ItemStack(Items.gold_ingot), new ItemStack(Items.gold_ingot), new ItemStack(UraniumHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.DiamondPlate, 2, 3),
					new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack(UraniumHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.UraniumPlate, 2, 3),
					new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(UraniumHammer,1,32767));
		}

		//アイテムの登録はpreInitで行う必要あり。
		DarkCrystalHammer = new ItemHammerDarkCrystal();
		DarkCrystalHammer.setUnlocalizedName("DarkCrystalHammer").setTextureName("diamondcraft:DarkCrystalHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		//1.7以降はこのメソッドで登録。
		GameRegistry.registerItem(DarkCrystalHammer, "DarkCrystalHammer");
		{
			//onCraftingがイベント処理に変わったので、FMLに登録。
			FMLCommonHandler.instance().bus().register(DarkCrystalHammer);
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.IronPlate, 2, 3),
					new ItemStack(Items.iron_ingot), new ItemStack(Items.iron_ingot), new ItemStack(DarkCrystalHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.GoldPlate, 2, 3),
					new ItemStack(Items.gold_ingot), new ItemStack(Items.gold_ingot), new ItemStack(DarkCrystalHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.DiamondPlate, 2, 3),
					new ItemStack(Items.diamond), new ItemStack(Items.diamond), new ItemStack(DarkCrystalHammer,1,32767));
			GameRegistry.addShapelessRecipe(new ItemStack(DiamondCraftItem.UraniumPlate, 2, 3),
					new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DiamondCraftItem.UraniumIngot), new ItemStack(DarkCrystalHammer,1,32767));
		}
	}
}
