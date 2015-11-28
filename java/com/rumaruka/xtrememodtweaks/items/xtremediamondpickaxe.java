package com.rumaruka.xtrememodtweaks.items;

import com.rumaruka.xtrememodtweaks.xtrememodtweaks;
import com.rumaruka.xtrememodtweaks.material.ToolMaterialMod;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;

public class xtremediamondpickaxe extends ItemPickaxe {
	
	public xtremediamondpickaxe(){
		super(ToolMaterialMod.XtremeDiamond);
		setCreativeTab(xtrememodtweaks.tabXtremeModTweaks);
		setUnlocalizedName("xtremediamondpickaxe");
	}
	
	   
}
