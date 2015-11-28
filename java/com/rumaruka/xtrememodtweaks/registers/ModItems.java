package com.rumaruka.xtrememodtweaks.registers;

import com.rumaruka.xtrememodtweaks.items.xtremediamondaxe;
import com.rumaruka.xtrememodtweaks.items.xtremediamondpickaxe;
import com.rumaruka.xtrememodtweaks.items.xtremediamondshovel;
import com.rumaruka.xtrememodtweaks.items.xtremegoldaxe;
import com.rumaruka.xtrememodtweaks.items.xtremegoldpickaxe;
import com.rumaruka.xtrememodtweaks.items.xtremegoldshovel;
import com.rumaruka.xtrememodtweaks.items.xtremeironaxe;
import com.rumaruka.xtrememodtweaks.items.xtremeironpickaxe;
import com.rumaruka.xtrememodtweaks.items.xtremeironshovel;
import com.rumaruka.xtrememodtweaks.items.xtremestoneaxe;
import com.rumaruka.xtrememodtweaks.items.xtremestonepickaxe;
import com.rumaruka.xtrememodtweaks.items.xtremestoneshovel;
import com.rumaruka.xtrememodtweaks.items.xtremewoodenkaxe;
import com.rumaruka.xtrememodtweaks.items.xtremewoodenpickaxe;
import com.rumaruka.xtrememodtweaks.items.xtremewoodenshovel;
import com.rumaruka.xtrememodtweaks.reference.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
	
	//Pickaxe
	public static Item xtremediamondpickaxe;
	public static Item xtremestonepickaxe;
	public static Item xtremeironpickaxe;
	public static Item xtremewoodenpickaxe;
	public static Item xtremegoldpickaxe;
	//Axe
	public static Item xtremewoodenaxe;
	public static Item xtremestoneaxe;
	public static Item xtremeironaxe;
	public static Item xtremegoldaxe;
	public static Item xtremediamondaxe;
	//Shovel
	public static Item xtremewoodenshovel;
	public static Item xtremestoneshovel;
	public static Item xtremeironshovel;
	public static Item xtremegoldshovel;
	public static Item xtremediamondshovel;
	
	public static final void init() {
		//Pickaxe
		xtremegoldpickaxe = new xtremegoldpickaxe().setUnlocalizedName("xtremegoldpickaxe");
		xtremewoodenpickaxe = new xtremewoodenpickaxe().setUnlocalizedName("xtremewoodenpickaxe");
		xtremediamondpickaxe = new xtremediamondpickaxe().setUnlocalizedName("xtremediamondpickaxe");
		xtremestonepickaxe = new xtremestonepickaxe().setUnlocalizedName("xtremestonepickaxe");
		xtremeironpickaxe = new xtremeironpickaxe().setUnlocalizedName("xtremeironpickaxe");
		//Axe
		xtremewoodenaxe = new xtremewoodenkaxe().setUnlocalizedName("xtremewoodenaxe");
		xtremestoneaxe = new xtremestoneaxe().setUnlocalizedName("xtremestoneaxe");
		xtremeironaxe = new xtremeironaxe().setUnlocalizedName("xtremeironaxe");
		xtremegoldaxe = new xtremegoldaxe().setUnlocalizedName("xtremegoldaxe");
		xtremediamondaxe = new xtremediamondaxe().setUnlocalizedName("xtremediamondaxe");
		//Shovel
		xtremewoodenshovel = new xtremewoodenshovel().setUnlocalizedName("xtremewoodenshovel");
		xtremestoneshovel = new xtremestoneshovel().setUnlocalizedName("xtremestoneshovel");
		xtremeironshovel = new xtremeironshovel().setUnlocalizedName("xtremeironshovel");
		xtremegoldshovel = new xtremegoldshovel().setUnlocalizedName("xtremegoldshovel");
		xtremediamondshovel = new xtremediamondshovel().setUnlocalizedName("xtremediamondshovel");
	}

	public static final void register() {
		//Pickaxe
		GameRegistry.registerItem(xtremeironpickaxe, xtremeironpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremestonepickaxe, xtremestonepickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremediamondpickaxe, xtremediamondpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremegoldpickaxe, xtremegoldpickaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremewoodenpickaxe, xtremewoodenpickaxe.getUnlocalizedName().substring(5));
		//Axe
		GameRegistry.registerItem(xtremeironaxe, xtremeironaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremestoneaxe, xtremestoneaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremediamondaxe, xtremediamondaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremegoldaxe, xtremegoldaxe.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremewoodenaxe, xtremewoodenaxe.getUnlocalizedName().substring(5));
		//Shovel
		GameRegistry.registerItem(xtremewoodenshovel, xtremewoodenshovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremestoneshovel, xtremestoneshovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremeironshovel, xtremeironshovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremegoldshovel, xtremegoldshovel.getUnlocalizedName().substring(5));
		GameRegistry.registerItem(xtremediamondshovel, xtremediamondshovel.getUnlocalizedName().substring(5));
	}

	public static void registerRenders() {
		//PickAxe
		registerRender(xtremestonepickaxe);
		registerRender(xtremeironpickaxe);
		registerRender(xtremediamondpickaxe);
		registerRender(xtremewoodenpickaxe);
		registerRender(xtremegoldpickaxe);
		//Axe
		registerRender(xtremewoodenaxe);
		registerRender(xtremestoneaxe);
		registerRender(xtremeironaxe);
		registerRender(xtremegoldaxe);
		registerRender(xtremediamondaxe);
		//Shovel
		registerRender(xtremewoodenshovel);
		registerRender(xtremestoneshovel);
		registerRender(xtremeironshovel);
		registerRender(xtremegoldshovel);
		registerRender(xtremediamondshovel);
	}

	public static void registerRender(Item i) {
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(i, 0,
				new ModelResourceLocation(Reference.MODID + ":" + i.getUnlocalizedName().substring(5), "inventory"));

	}

}
