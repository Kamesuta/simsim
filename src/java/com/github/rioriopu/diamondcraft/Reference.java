package com.github.rioriopu.diamondcraft;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Reference {
	public static final String MODID = "diamondcraft";
	public static final String NAME = "DiamondCraft";
	public static final String VERSION = "${version}";
	public static final String FORGE = "${forgeversion}";
	public static final String MINECRAFT = "${mcversion}";
	public static final String PROXY_SERVER = "com.github.rioriopu.diamondcraft.proxy.CommonProxy";
	public static final String PROXY_CLIENT = "com.github.rioriopu.diamondcraft.proxy.ClientProxy";

	public static Logger logger = LogManager.getLogger(Reference.MODID);
}
