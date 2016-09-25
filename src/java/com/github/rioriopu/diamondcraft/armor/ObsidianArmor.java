package com.github.rioriopu.diamondcraft.armor;

import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ObsidianArmor extends ItemArmor{
	private String [] armourTypes = new String [] {"LightDiamondHelmet", "LightDiamondChestPlate", "LightDiamondLeggings", "LightDiamondBoots"};

	public ObsidianArmor(ArmorMaterial armorMaterial, int renderIndex, int armourType){
		super(armorMaterial, renderIndex, armourType);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot, String layer){
		if(stack.getItem().equals(DiamondCraftArmor.LightDiamondHelmet)|| stack.getItem().equals(DiamondCraftArmor.LightDiamondChestPlate)|| stack.getItem().equals(DiamondCraftArmor.LightDiamondBoots)){
			return "diamondcraft:textures/models/armor/lightdiamond_layer_1.png";
		}

		if(stack.getItem().equals(DiamondCraftArmor.LightDiamondLeggings)){
			return "diamondcraft:textures/models/armor/lightdiamond_layer_2.png";
		}

		else return null;
	}

	@Override
	public void registerIcons(IIconRegister reg){
		if(this == DiamondCraftArmor.LightDiamondHelmet)
			this.itemIcon = reg.registerIcon("diamondcraft:lightdiamond_helmet");
		if(this == DiamondCraftArmor.LightDiamondChestPlate)
			this.itemIcon = reg.registerIcon("diamondcraft:lightdiamond_chestplate");
		if(this == DiamondCraftArmor.LightDiamondLeggings)
			this.itemIcon = reg.registerIcon("diamondcraft:lightdiamond_leggings");
		if(this == DiamondCraftArmor.LightDiamondBoots)
			this.itemIcon = reg.registerIcon("diamondcraft:lightdiamond_boots");
	}


	@Override
	public void onArmorTick(World world, EntityPlayer player, ItemStack stack){
		if(player.getCurrentArmor(0) != null && player.getCurrentArmor(1) != null && player.getCurrentArmor(2) != null && player.getCurrentArmor(3) != null){
			ItemStack boots = player.getCurrentArmor(0);
			ItemStack legs = player.getCurrentArmor(1);
			ItemStack chest = player.getCurrentArmor(2);
			ItemStack helmet = player.getCurrentArmor(3);

			if(boots.getItem() == DiamondCraftArmor.LightDiamondBoots && legs.getItem() == DiamondCraftArmor.LightDiamondLeggings && chest.getItem() == DiamondCraftArmor.LightDiamondChestPlate && helmet.getItem() == DiamondCraftArmor.LightDiamondHelmet){
				player.addPotionEffect(new PotionEffect(Potion.resistance.getId(), 100, 1));
				player.addPotionEffect(new PotionEffect(Potion.moveSlowdown.getId(), 100, 0));
			}

		}
	}

}