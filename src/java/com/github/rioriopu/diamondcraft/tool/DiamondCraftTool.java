package com.github.rioriopu.diamondcraft.tool;

import com.github.rioriopu.diamondcraft.DiamondCraftRecipe;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class DiamondCraftTool {

	public static ToolMaterial enumToolMaterialObsidian = EnumHelper.addToolMaterial("Obsidian", 4, 1600, 11.0F, 5.0F, 30);
	public static ToolMaterial enumToolMaterialLightDiamond = EnumHelper.addToolMaterial("Light", 3, 3000, 11.0F, 6.0F, 30);

	public static void mainRegistry(){
		initItems();
		registerItems();
	}

	public static Item ObsidianSword;
	public static Item ObsidianPickaxe;
	public static Item ObsidianAxe;
	public static Item ObsidianHoe;
	public static Item ObsidianShovel;
	public static Item LightDiamondSword;
	public static Item LightDiamondPickaxe;
	public static Item LightDiamondAxe;
	public static Item LightDiamondHoe;
	public static Item LightDiamondShovel;

	public static void initItems(){

		RenderingRegistry.addNewArmourRendererPrefix("5");

		ObsidianSword = new ToolObsidianSword(enumToolMaterialObsidian, 6).setUnlocalizedName("ObsidianSword").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianPickaxe = new ToolObsidianPickaxe(enumToolMaterialObsidian).setUnlocalizedName("ObsidianPickaxe").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianShovel = new ToolObsidianShovel(enumToolMaterialObsidian).setUnlocalizedName("ObsidianShovel").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianHoe = new ToolObsidianHoe(enumToolMaterialObsidian).setUnlocalizedName("ObsidianHoe").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		ObsidianAxe = new ToolObsidianAxe(enumToolMaterialObsidian).setUnlocalizedName("ObsidianAxe").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondSword = new ToolObsidianSword(enumToolMaterialLightDiamond, 6).setUnlocalizedName("LightDiamondSword").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondPickaxe = new ToolObsidianPickaxe(enumToolMaterialLightDiamond).setUnlocalizedName("LightDiamondPickaxe").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondShovel = new ToolObsidianShovel(enumToolMaterialLightDiamond).setUnlocalizedName("LightDiamondShovel").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondHoe = new ToolObsidianHoe(enumToolMaterialLightDiamond).setUnlocalizedName("LightDiamondHoe").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);
		LightDiamondAxe = new ToolObsidianAxe(enumToolMaterialLightDiamond).setUnlocalizedName("LightDiamondAxe").setCreativeTab(DiamondCraftRecipe.DiamondCraftTab);


	}


	public static void registerItems(){

		GameRegistry.registerItem(LightDiamondSword, "LightDiamondSword");
		GameRegistry.registerItem(LightDiamondPickaxe, "LightDiamondPickaxe");
		GameRegistry.registerItem(LightDiamondAxe, "LightDiamondAxe");
		GameRegistry.registerItem(LightDiamondHoe, "LightDiamondHoe");
		GameRegistry.registerItem(LightDiamondShovel, "LightDiamondShovel");
		GameRegistry.registerItem(ObsidianSword, "ObsidianSword");
		GameRegistry.registerItem(ObsidianPickaxe, "ObsidianPickaxe");
		GameRegistry.registerItem(ObsidianAxe, "ObsidianAxe");
		GameRegistry.registerItem(ObsidianHoe, "ObsidianHoe");
		GameRegistry.registerItem(ObsidianShovel, "ObsidianShovel");
	}
}
