package com.github.rioriopu.diamondcraft.biome;

import java.util.List;

import com.github.rioriopu.diamondcraft.block.DiamondCraftBlock;

import net.minecraft.entity.monster.EntitySlime;
import net.minecraft.init.Blocks;
import net.minecraft.world.biome.BiomeGenBase;

public class BiomeGenDiamondCraft extends BiomeGenBase{

	public BiomeGenDiamondCraft(final int id){
		super(id);

		@SuppressWarnings("unchecked")
		final List<Object> creatureList = this.spawnableCreatureList;
		creatureList.add(new SpawnListEntry(EntitySlime.class, 5, 2, 10));

		this.theBiomeDecorator.treesPerChunk = 5;
		this.theBiomeDecorator.grassPerChunk = 2;
		this.theBiomeDecorator.bigMushroomsPerChunk = 2;


		this.topBlock = Blocks.grass;
		this.fillerBlock = DiamondCraftBlock.LightDiamondOre;

	}

}
