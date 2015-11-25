package com.rumaruka.xtrememodtweaks.registers;

import com.rumaruka.xtrememodtweaks.items.xtremediamondpickaxe;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	public static Item xtremediamondpickaxe;

	public static final void init() {
		xtremediamondpickaxe = new xtremediamondpickaxe().setUnlocalizedName("xtremediamondpickaxe");
	}

	public static final void register() {
		xtremediamondpickaxe = new xtremediamondpickaxe();
		GameRegistry.registerItem(xtremediamondpickaxe, xtremediamondpickaxe.getUnlocalizedName().substring(5));

	}

	public static void registerRenders() {

		registerRender(xtremediamondpickaxe);

	}

	public static void registerRender(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0,
				new ModelResourceLocation(Reference.MODID + ":" + i.getUnlocalizedName().substring(5), "inventory"));

	}

}
