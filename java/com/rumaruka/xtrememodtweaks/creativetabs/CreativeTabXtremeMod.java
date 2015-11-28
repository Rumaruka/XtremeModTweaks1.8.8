package com.rumaruka.xtrememodtweaks.creativetabs;

import com.rumaruka.xtrememodtweaks.registers.ModItems;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class CreativeTabXtremeMod extends CreativeTabs {

	public CreativeTabXtremeMod(int par1, String par25tr, int item) {
		super(par1, par25tr);
		// TODO Auto-generated constructor stub
	}

	@Override
	public Item getTabIconItem() {
		// TODO Auto-generated method stub
		return ModItems.xtremeironaxe;
	}

}
