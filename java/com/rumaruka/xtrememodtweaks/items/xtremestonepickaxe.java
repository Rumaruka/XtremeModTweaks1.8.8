package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.material.ToolMaterialMod;

import net.minecraft.item.Item;
import net.minecraft.item.ItemPickaxe;

public class xtremestonepickaxe extends ItemPickaxe {
	
	public xtremestonepickaxe(){
		super(ToolMaterialMod.XtremetStone);
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
	}

}
