
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownplinfiresword.init;

import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.Registry;

import net.mcreator.clownplinfiresword.ClownplinFireSwordMod;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;

public class ClownplinFireSwordModTabs {
	public static ResourceKey<CreativeModeTab> TAB_FIRE_SWORD_ADDONS = ResourceKey.create(Registries.CREATIVE_MODE_TAB, new ResourceLocation(ClownplinFireSwordMod.MODID, "fire_sword_addons"));

	public static void load() {
		Registry.register(BuiltInRegistries.CREATIVE_MODE_TAB, TAB_FIRE_SWORD_ADDONS,
				FabricItemGroup.builder().title(Component.translatable("item_group." + ClownplinFireSwordMod.MODID + ".fire_sword_addons")).icon(() -> new ItemStack(Items.FIRE_CHARGE)).build());
	}
}
