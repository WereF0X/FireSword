
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.clownplinfiresword.init;

import net.mcreator.clownplinfiresword.procedures.FireSwordToolInInventoryTickProcedure;
import net.mcreator.clownplinfiresword.procedures.FireSwordRightclickedProcedure;

@SuppressWarnings("InstantiationOfUtilityClass")
public class ClownplinFireSwordModProcedures {
	public static void load() {
		new FireSwordRightclickedProcedure();
		new FireSwordToolInInventoryTickProcedure();
	}
}
