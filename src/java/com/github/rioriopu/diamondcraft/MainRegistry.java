package com.github.rioriopu.diamondcraft;

import com.github.rioriopu.diamondcraft.proxy.CommonProxy;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.Mod.Metadata;
import cpw.mods.fml.common.ModMetadata;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class MainRegistry
{
	@SidedProxy(clientSide = Reference.PROXY_CLIENT, serverSide = Reference.PROXY_SERVER)
	public static CommonProxy proxy;

	@Metadata
	public static ModMetadata meta;

	@Instance(Reference.MODID)
	public static MainRegistry modInstance;

	@EventHandler
	public void preInit(final FMLPreInitializationEvent PreEvent)
	{
		proxy.preInit(PreEvent);
	}

	public void init(final FMLInitializationEvent e)
	{
		proxy.init(e);
	}
	@EventHandler
	public void postInit(final FMLPostInitializationEvent event)
	{
		proxy.postInit(event);
	}
}