package com.rumaruka.xtrememodtweaks.proxy;

import com.rumaruka.xtrememodtweaks.items.xtremediamondpickaxe;
import com.rumaruka.xtrememodtweaks.registers.ModItems;

public class ClientProxy extends CommonProxy{

	@Override
	public void registerRenders(){
		ModItems.registerRenders();
	}
}
