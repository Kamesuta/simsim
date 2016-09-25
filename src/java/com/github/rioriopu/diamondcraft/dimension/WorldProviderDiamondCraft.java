package com.github.rioriopu.diamondcraft.dimension;

import com.github.rioriopu.diamondcraft.biome.BiomeRegistry;

import net.minecraft.world.WorldProvider;
import net.minecraft.world.biome.WorldChunkManagerHell;
import net.minecraft.world.chunk.IChunkProvider;

public class WorldProviderDiamondCraft extends WorldProvider{

	public void registerWorldChunkManager(){
		this.worldChunkMgr = new WorldChunkManagerHell(BiomeRegistry.biomeSapphire, 1.2F);
		this.dimensionId = dimensionRegistry.dimensionId;
	}

	public IChunkProvider createChunkGeneration(){
		return null;
	}

	@Override
	public String getDimensionName() {

		return "Sapphire";
	}

}
