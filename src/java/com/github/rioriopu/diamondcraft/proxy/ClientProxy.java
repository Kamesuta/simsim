package com.github.rioriopu.diamondcraft.proxy;

import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{

	@Override
	public void preInit(final FMLPreInitializationEvent PreEvent){
		super.preInit(PreEvent);
	}

	@Override
	public int addArmor(final String armor){
		return RenderingRegistry.addNewArmourRendererPrefix(armor);
	}

}
