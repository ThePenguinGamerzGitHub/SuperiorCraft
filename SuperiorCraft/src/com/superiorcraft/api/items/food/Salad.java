package com.superiorcraft.api.items.food;

import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

public class Salad extends CustomFood {

	public Salad(ItemStack item, String id) {
		super(item, id);
	}

	@Override
	public void onEat(Player player) {
		
	}

	@Override
	public int getNutritionLevel() {
		return 5;
	}

	@Override
	public int getSaturationLevel() {
		return 1;
	}

}
