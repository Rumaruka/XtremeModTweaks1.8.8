package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.material.ToolMaterialMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class xtremediamondpickaxe extends ItemPickaxe {
	
	public xtremediamondpickaxe(){
		super(ToolMaterialMod.XtremeDiamond);
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
		setUnlocalizedName("xtremediamondpickaxe");
	}

}
