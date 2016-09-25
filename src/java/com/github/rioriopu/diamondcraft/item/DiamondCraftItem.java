package com.github.rioriopu.diamondcraft.item;

import net.minecraft.item.Item;

public class DiamondCraftItem
{
	public static Item CompressedDiamond;
	public static Item DiamondStick;
	public static Item IronPlate;
	public static Item GoldPlate;
	public static Item DiamondPlate;
	public static Item CompressedDiamondPlate;
	public static Item UraniumPlate;
	public static Item IronHammer;
	public static Item GoldHammer;
	public static Item DiamondHammer;
	public static Item UraniumHammer;
	public static Item DarkCrystalHammer;
	public static Item EnergyCrystal;
	public static Item UraniumCrystal;
	public static Item DarkCrystal;
	public static Item Uranium;
	public static Item UraniumIngot;
	public static Item LightDiamond;
	public static Item Light;

	public static void registry()
	{
		CompressedDiamond = new ItemCompressedDiamond();
		DiamondStick = new ItemDiamondStick();
		IronPlate = new ItemIronPlate();
		GoldPlate = new ItemGoldPlate();
		IronHammer = new ItemHammerIron();
		GoldHammer = new ItemHammerGold();
		DiamondPlate = new ItemDiamondPlate();
		EnergyCrystal = new ItemEnergyCrystal();
		Uranium = new ItemUranium();
		DarkCrystal = new ItemDarkCrystal();
		UraniumCrystal = new ItemUraniumCrystal();
		UraniumIngot = new ItemUraniumIngot();
		UraniumPlate = new ItemUraniumPlate();
		LightDiamond = new ItemLightDiamond();

		return;
	}
}