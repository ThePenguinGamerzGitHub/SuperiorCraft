package com.superiorcraft.api.crafting;

import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CustomCraftingRecipe {
	
	public ItemStack[] recipe = new ItemStack[9];
	public String ncon = CustomCrafter.name;
	
	public CustomCraftingRecipe(ItemStack[] a) {
		recipe = a;
	}
	
	public boolean check(ItemStack[] a) {
		boolean match = true;
		if (a.length == 9) {
			for (int i = 0; i < recipe.length; i++) {
				if (match) {
					if (recipe[i] != null) {
						match = recipe[i].equals(a[i]);
					}
					else {
						
					}
				}
			}
		}
		
		return match;
	}
	
	public boolean nCheck(String name) {
		if (name.contains(ncon)) {
			return true;
		}
		
		return false;
	}
	
	public void onCraft(InventoryClickEvent e) {
		if (nCheck(e.getInventory().getName())) {
			craft(e);
		}
	}
	
	public void craft(InventoryClickEvent e) {
		
	}
	
	public void onCraft(InventoryCloseEvent e) {
		if (nCheck(e.getInventory().getName())) {
			craft(e);
		}
	}
	
	public void craft(InventoryCloseEvent e) {
		
	}
	
}
