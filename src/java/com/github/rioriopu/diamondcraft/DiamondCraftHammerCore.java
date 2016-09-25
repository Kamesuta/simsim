package com.github.rioriopu.diamondcraft;

import com.github.rioriopu.diamondcraft.item.DiamondCraftItem;
import com.github.rioriopu.diamondcraft.item.ItemHammerDarkCrystal;
import com.github.rioriopu.diamondcraft.item.ItemHammerDiamond;
import com.github.rioriopu.diamondcraft.item.ItemHammerGold;
import com.github.rioriopu.diamondcraft.item.ItemHammerIron;
import com.github.rioriopu.diamondcraft.item.ItemHammerUranium;

import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

@Mod(modid="DiamondCraftHammerCore", name="DiamondCraftHammerCore", version="0.5.5beta",dependencies="required-after:FML")
//@NetworkMod(clientSideRequired=true serverSideRequired=false)
public class DiamondCraftHammerCore
{
	@Mod.Instance("IronHammer")
	public static DiamondCraftHammerCore instance;
	public static ItemHammerIron IronHammer;
	@Mod.EventHandler
	public void preinit(final FMLPreInitializationEvent event)
	{
		IronHammer = (ItemHammerIron)(new ItemHammerIron()).setUnlocalizedName("ironhammer").setTextureName("diamondcraft:IronHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
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
	}
	@Mod.Instance("GoldHammer")
	public static DiamondCraftHammerCore instance1;
	public static ItemHammerGold GoldHammer;
	@Mod.EventHandler
	public void preinit1(final FMLPreInitializationEvent event)
	{
		//アイテムの登録はpreInitで行う必要あり。
		GoldHammer = (ItemHammerGold)(new ItemHammerGold()).setUnlocalizedName("goldhammer").setTextureName("diamondcraft:GoldHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
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
	}
	@Mod.Instance("DiamondHammer")
	public static DiamondCraftHammerCore instance2;
	public static ItemHammerDiamond DiamondHammer;
	@Mod.EventHandler
	public void preinit2(final FMLPreInitializationEvent event)
	{
		//アイテムの登録はpreInitで行う必要あり。
		DiamondHammer = (ItemHammerDiamond)(new ItemHammerDiamond()).setUnlocalizedName("DiamondHammer").setTextureName("diamondcraft:DiamondHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
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
	}
	@Mod.Instance("UraniumHammer")
	public static DiamondCraftHammerCore instance3;
	public static ItemHammerUranium UraniumHammer;
	@Mod.EventHandler
	public void preinit3(final FMLPreInitializationEvent event)
	{
		//アイテムの登録はpreInitで行う必要あり。
		UraniumHammer = (ItemHammerUranium)(new ItemHammerUranium()).setUnlocalizedName("UraniumHammer").setTextureName("diamondcraft:UraniumHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
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
	}
	@Mod.Instance("DarkCrystalHammer")
	public static DiamondCraftHammerCore instance4;
	public static ItemHammerDarkCrystal DarkCrystalHammer;
	@Mod.EventHandler
	public void preinit4(final FMLPreInitializationEvent event)
	{
		//アイテムの登録はpreInitで行う必要あり。
		DarkCrystalHammer = (ItemHammerDarkCrystal)(new ItemHammerDarkCrystal()).setUnlocalizedName("DarkCrystalHammer").setTextureName("diamondcraft:DarkCrystalHammer").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
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
