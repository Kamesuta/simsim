package com.github.rioriopu.diamondcraft.tool;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class ToolLightDiamondPickaxe extends ItemPickaxe{

	public ToolLightDiamondPickaxe(Item.ToolMaterial mat){
		super(mat);
	}

	@SideOnly(Side.CLIENT)
	public void registerIcons(IIconRegister reg){
		this.itemIcon = reg.registerIcon("diamondcraft:lightdiamond_pickaxe");
	}

}
