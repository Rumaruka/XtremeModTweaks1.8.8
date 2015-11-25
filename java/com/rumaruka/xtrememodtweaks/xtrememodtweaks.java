package com.rumaruka.xtrememodtweaks;

import com.rumaruka.xtrememodtweaks.creativetabs.CreativeTabXtremeMod;
import com.rumaruka.xtrememodtweaks.proxy.CommonProxy;
import com.rumaruka.xtrememodtweaks.reference.Reference;
import com.rumaruka.xtrememodtweaks.registers.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID, name = Reference.NAME, version = Reference.VERSION)
public class xtrememodtweaks {

	// XtremeCreativeTabs
	public static final CreativeTabs tabXtremeModTweaks = new CreativeTabXtremeMod(CreativeTabs.getNextID(),
			Reference.NAME, 1);

	
	@SidedProxy(clientSide = Reference.ClientProxyClass, serverSide = Reference.ServerProxyClass)
	public static CommonProxy proxy;
	@Mod.Instance
	public static xtrememodtweaks instance;

	@EventHandler
	public void preinit(FMLPreInitializationEvent e) {
		ModItems.init();
		ModItems.register();

	}

	@EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.registerRenders();
	}

	@EventHandler
	public void postinit(FMLPostInitializationEvent e) {

	}

}
