/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownplinfiresword.init;

import net.minecraft.world.item.Item;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.clownplinfiresword.item.FireSwordItem;
import net.mcreator.clownplinfiresword.ClownplinFireSwordMod;

public class ClownplinFireSwordModItems {
	public static Item FIRE_SWORD;

	public static void load() {
		FIRE_SWORD = Registry.register(BuiltInRegistries.ITEM, new ResourceLocation(ClownplinFireSwordMod.MODID, "fire_sword"), new FireSwordItem());
	}

	public static void clientLoad() {
	}
}
