package com.superiorcraft.api.util.item;

import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;
import org.bukkit.material.MaterialData;

public class ItemMetaConstruct {
	
	private ItemConstruct item;
	private ItemMeta meta;
	
	public ItemMetaConstruct(ItemConstruct item) {
		this.item = item;
		setMeta(item.getItemMeta());
	}
	
	public ItemMetaConstruct(ItemConstruct item, String itemName) {
		this.item = item;
		setMeta(item.getItemMeta());
		setName(itemName);
	}
	
	public ItemMetaConstruct setName(String name) {
		getMeta().setDisplayName("&r".replace('&', '�') + name.replace('&', '�'));
		return this;
	}
	
	public ItemMetaConstruct setUnbreakable(boolean unbreakable) {
		meta.setUnbreakable(unbreakable);
		
		return this;
	}
	
	public ItemMetaConstruct removeFlags() {
		meta.addItemFlags(ItemFlag.HIDE_ATTRIBUTES);
		meta.addItemFlags(ItemFlag.HIDE_UNBREAKABLE);
		meta.addItemFlags(ItemFlag.HIDE_DESTROYS);
		meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
		meta.addItemFlags(ItemFlag.HIDE_PLACED_ON);
		
		return this;
	}
	
	@SuppressWarnings("deprecation")
	public ItemMetaConstruct setData(short data) {
		item.setDurability(data);
		
		return this;
	}
	
	public ItemMeta getMeta() {
		return meta;
	}

	public void setMeta(ItemMeta meta) {
		this.meta = meta;
	}
	
	public ItemStack getItem() {
		item.setItemMeta(getMeta());
		return item;
	}
	
}
