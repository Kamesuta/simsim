package com.github.rioriopu.diamondcraft.tool;

import com.google.common.collect.HashMultimap;
import com.google.common.collect.Multimap;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.AttributeModifier;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class ToolObsidianSword extends ItemSword{

	protected final float weaponDamage;

	public ToolObsidianSword(final Item.ToolMaterial mat, final float damage){
		super(mat);
		this.weaponDamage = damage;

	}

	@Override
	@SideOnly(Side.CLIENT)
	public void registerIcons(final IIconRegister reg){
		this.itemIcon = reg.registerIcon("diamondcraft:obsidian_sword");

	}

	@Override
	public Multimap<String, AttributeModifier> getItemAttributeModifiers(){
		final Multimap<String, AttributeModifier> multimap = HashMultimap.create();
		multimap.put(SharedMonsterAttributes.attackDamage.getAttributeUnlocalizedName(), new AttributeModifier(field_111210_e, "Weapon modifier",  this.weaponDamage, 0));
		return multimap;
	}

	@Override
	public void onUpdate(final ItemStack stack, final World world, final Entity entity, final int par4, final boolean par5){
		super.onUpdate(stack, world, entity, par4, par5);
		{
			final EntityPlayer player = (EntityPlayer) entity;
			final ItemStack equipped = player.getCurrentEquippedItem();
			if(equipped == stack){
				player.addPotionEffect(new PotionEffect(Potion.damageBoost.getId(), 100, 2));
			}
		}
	}

}
