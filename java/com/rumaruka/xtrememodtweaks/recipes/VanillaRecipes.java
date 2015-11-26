package com.rumaruka.xtrememodtweaks.recipes;

import com.rumaruka.xtrememodtweaks.registers.ModItems;
import com.sun.prism.Material;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class VanillaRecipes {
	
	public static final void loadRecipes(){
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremediamondpickaxe), new Object[]{
						"DPD",
						"ESE",
						"ESE",
						'P', Items.diamond_pickaxe, 'D', Items.diamond, 'S', Items.stick
		});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremestonepickaxe), new Object[]{
				"CPC",
				"ESE",
				"ESE",
				'P', Items.stone_pickaxe, 'C', Blocks.cobblestone, 'S', Items.stick
});	
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremeironpickaxe), new Object[]{
				"IPI",
				"ESE",
				"ESE",
				'P', Items.iron_pickaxe, 'I', Items.iron_ingot , 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremegoldpickaxe), new Object[]{
				"GPG",
				"ESE",
				"ESE",
				'P', Items.golden_pickaxe, 'G', Items.gold_ingot , 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremewoodenpickaxe), new Object[]{
				"WPW",
				"ESE",
				"ESE",
				'P', Items.wooden_pickaxe, 'W', Blocks.planks , 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremewoodenaxe), new Object[]{
				"WPE",
				"WSE",
				"ESE",
				'P', Items.wooden_axe, 'W', Blocks.planks , 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremegoldaxe), new Object[]{
				"GPE",
				"GSE",
				"ESE",
				'P', Items.golden_axe, 'G', Items.gold_ingot , 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremeironaxe), new Object[]{
				"IPE",
				"ISE",
				"ESE",
				'P', Items.iron_axe, 'I', Items.iron_ingot , 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremestoneaxe), new Object[]{
				"CPE",
				"CSE",
				"ESE",
				'P', Items.stone_axe, 'C', Blocks.cobblestone, 'S', Items.stick
});
		GameRegistry.addRecipe(new ItemStack(ModItems.xtremediamondaxe), new Object[]{
				"DPE",
				"DSE",
				"ESE",
				'P', Items.diamond_axe, 'D', Items.diamond, 'S', Items.stick
});
		
	}
	

}
