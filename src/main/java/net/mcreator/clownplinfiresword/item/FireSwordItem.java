
package net.mcreator.clownplinfiresword.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.InteractionHand;

import net.mcreator.clownplinfiresword.procedures.FireSwordToolInInventoryTickProcedure;
import net.mcreator.clownplinfiresword.procedures.FireSwordRightclickedProcedure;
import net.mcreator.clownplinfiresword.init.ClownplinFireSwordModTabs;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;

public class FireSwordItem extends SwordItem {
	public FireSwordItem() {
		super(new Tier() {
			public int getUses() {
				return 1300;
			}

			public float getSpeed() {
				return 4f;
			}

			public float getAttackDamageBonus() {
				return 2.8f;
			}

			public int getLevel() {
				return 1;
			}

			public int getEnchantmentValue() {
				return 2;
			}

			public Ingredient getRepairIngredient() {
				return Ingredient.of(new ItemStack(Items.LAVA_BUCKET));
			}
		}, 3, -2.4f, new Item.Properties().fireResistant());
		ItemGroupEvents.modifyEntriesEvent(ClownplinFireSwordModTabs.TAB_FIRE_SWORD_ADDONS).register(content -> content.accept(this));
	}

	@Override
	public InteractionResultHolder<ItemStack> use(Level world, Player entity, InteractionHand hand) {
		InteractionResultHolder<ItemStack> ar = super.use(world, entity, hand);
		FireSwordRightclickedProcedure.execute(entity, ar.getObject());
		return ar;
	}

	@Override
	public void inventoryTick(ItemStack itemstack, Level world, Entity entity, int slot, boolean selected) {
		super.inventoryTick(itemstack, world, entity, slot, selected);
		FireSwordToolInInventoryTickProcedure.execute(entity, itemstack);
	}
}
