package com.github.rioriopu.diamondcraft.item;

import com.github.rioriopu.diamondcraft.DiamondCraftHammer;

import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.common.gameevent.PlayerEvent.ItemCraftedEvent;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

public class ItemHammerIron extends Item
{
    private boolean repair = false;
    public ItemHammerIron()
    {
        super();
        String IronHammer = "IronHammer";
        this.setUnlocalizedName( IronHammer );
        setUnlocalizedName("IronHammer");
        this.setMaxStackSize(1);
        this.setMaxDamage(256); //効果がわかりやすいように数値を低く設定
    }
    //鉄ハンマーレシピ

    //アイテムがクラフト後に戻らないようにする
    @Override
    public boolean doesContainerItemLeaveCraftingGrid(ItemStack par1ItemStack)
    {
        return false;
    }

    //修理以外ならクラフト後にgetContainerItemStackを呼び出す
    @Override
    public boolean hasContainerItem()
    {
        return !repair;
    }
	//修理かどうかを判定する
	@SubscribeEvent
	public void onCrafting(ItemCraftedEvent event)
	{
		//IDが無くなったので、アイテムインスタンスで比較。
		repair = DiamondCraftHammer.IronHammer == event.crafting.getItem();
	}
    //クラフト後のアイテムを、ダメージを与えて返す
    @Override
    public ItemStack getContainerItem(ItemStack itemStack)
    {
        if (itemStack != null && itemStack.getItem() == this)
        {
            itemStack.setItemDamage(itemStack.getItemDamage() + 1);
        }
        return itemStack;
    }

}
