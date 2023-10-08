package net.mcreator.clownplinfiresword.procedures;

import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.item.enchantment.EnchantmentHelper;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class FireSwordToolInInventoryTickProcedure {
	public static void execute(Entity entity, ItemStack itemstack) {
		if (entity == null)
			return;
		if (EnchantmentHelper.getItemEnchantmentLevel(Enchantments.FIRE_ASPECT, itemstack) != 0) {
			if (entity instanceof Player _player)
				_player.giveExperiencePoints(0);
		} else {
			itemstack.enchant(Enchantments.FIRE_ASPECT, 3);
		}
	}
}
