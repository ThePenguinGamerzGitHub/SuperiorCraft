package com.superiorcraft.api.crafting;

import org.bukkit.Material;
import org.bukkit.block.Dropper;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.event.inventory.InventoryCloseEvent;
import org.bukkit.event.inventory.InventoryMoveItemEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class CustomCrafter extends CustomCraftingRecipe {
	
	public static String name = "&6Custom Crafter".replace('&', '�');
	
	public CustomCrafter(ItemStack[] a) {
		super(a, new ItemStack(Material.DROPPER));
		ncon = "container.dropper";
	}
	
	@Override
	public void craft(InventoryCloseEvent e) {
		//e.getWhoClicked().closeInventory();
		e.getPlayer().sendMessage(name + "&r created!".replace('&', '�'));
		Dropper a = (Dropper) e.getInventory().getLocation().getBlock().getState();
		a.setCustomName(name);
		a.update();
		e.getInventory().clear();
	}
	
}
