package com.github.rioriopu.diamondcraft.render.item;

import com.github.rioriopu.diamondcraft.block.TileEntityReverseChest;

import net.minecraft.client.model.ModelChest;
import net.minecraft.client.renderer.tileentity.TileEntityRendererDispatcher;
import net.minecraft.item.ItemStack;
import net.minecraftforge.client.IItemRenderer;

public class ItemRendererReverseChest implements IItemRenderer {

	protected ModelChest chestModel;

	@Override
	public boolean handleRenderType(final ItemStack item, final ItemRenderType type) {

		return true;
	}

	@Override
	public void renderItem(final ItemRenderType type, final ItemStack item, final Object... data) {
		TileEntityRendererDispatcher.instance.renderTileEntityAt(new TileEntityReverseChest(), 0.0D, 0.0D, 0.0D, 0.0F);


	}

	@Override
	public boolean shouldUseRenderHelper(final ItemRenderType type, final ItemStack item,
			final ItemRendererHelper helper) {

		return true;
	}

}
