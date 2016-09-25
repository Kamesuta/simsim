package com.github.rioriopu.diamondcraft.armor;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class DiamondCraftArmor {

	public static ArmorMaterial enumArmorMaterialDiamond = EnumHelper.addArmorMaterial("SAPPHIRE", 50, new int[] {5, 10, 8, 3}, 30);
	public static ArmorMaterial enumArmorMaterialObsidian = EnumHelper.addArmorMaterial("SAPPHIRE", 50, new int[] {5, 10, 8, 3}, 30);


	public static void mainRegistry(){
		initItems();
		registerItems();
	}

	public static Item LightDiamondHelmet;
	public static Item LightDiamondChestPlate;
	public static Item LightDiamondLeggings;
	public static Item LightDiamondBoots;
	public static Item ObsidianHelmet;
	public static Item ObsidianChestPlate;
	public static Item ObsidianLeggings;
	public static Item ObsidianBoots;

	public static void initItems(){

		RenderingRegistry.addNewArmourRendererPrefix("5");

		LightDiamondHelmet = new LightArmor(enumArmorMaterialDiamond, 5, 0).setUnlocalizedName("LightDiamondHelmet").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondChestPlate = new LightArmor(enumArmorMaterialDiamond, 5, 1).setUnlocalizedName("LightDiamondChestPlate").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondLeggings = new LightArmor(enumArmorMaterialDiamond, 5, 2).setUnlocalizedName("LightDiamondLeggings").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondBoots = new LightArmor(enumArmorMaterialDiamond, 5, 3).setUnlocalizedName("LightDiamondBoots").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianHelmet = new LightArmor(enumArmorMaterialObsidian, 5, 0).setUnlocalizedName("ObsidianHelmet").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianChestPlate = new LightArmor(enumArmorMaterialObsidian, 5, 1).setUnlocalizedName("ObsidianChestPlate").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianLeggings = new LightArmor(enumArmorMaterialObsidian, 5, 2).setUnlocalizedName("ObsidianLeggings").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianBoots = new LightArmor(enumArmorMaterialObsidian, 5, 3).setUnlocalizedName("ObsidianBoots").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
	}

	public static void registerItems(){

		GameRegistry.registerItem(LightDiamondHelmet, "LightDiamondHelmet");
		GameRegistry.registerItem(LightDiamondChestPlate, "LightDiamondChestPlate");
		GameRegistry.registerItem(LightDiamondLeggings, "LightDiamondLeggings");
		GameRegistry.registerItem(LightDiamondBoots, "LightDiamondBoots");
		GameRegistry.registerItem(ObsidianHelmet, "ObsidianHelmet");
		GameRegistry.registerItem(ObsidianChestPlate, "ObsidianChestPlate");
		GameRegistry.registerItem(ObsidianLeggings, "ObsidianLeggings");
		GameRegistry.registerItem(ObsidianBoots, "ObsidianBoots");
	}

}
