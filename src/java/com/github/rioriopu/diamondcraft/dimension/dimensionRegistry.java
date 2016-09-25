package com.github.rioriopu.diamondcraft.dimension;

import net.minecraftforge.common.DimensionManager;

public class dimensionRegistry {

	public static void mainRegistry(){
		registerDimension();
	}

	public static final int dimensionId = 8;

	public static void registerDimension(){
		DimensionManager.registerProviderType(dimensionId, WorldProviderDiamondCraft.class, false);
		DimensionManager.registerDimension(dimensionId, dimensionId);

	}

}
