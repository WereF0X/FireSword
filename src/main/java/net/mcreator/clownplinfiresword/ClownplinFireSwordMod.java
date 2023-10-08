/*
 *	MCreator note:
 *
 *	If you lock base mod element files, you can edit this file and the proxy files
 *	and they won't get overwritten. If you change your mod package or modid, you
 *	need to apply these changes to this file MANUALLY.
 *
 *
 *	If you do not lock base mod element files in Workspace settings, this file
 *	will be REGENERATED on each build.
 *
 */
package net.mcreator.clownplinfiresword;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import net.mcreator.clownplinfiresword.init.ClownplinFireSwordModTabs;
import net.mcreator.clownplinfiresword.init.ClownplinFireSwordModProcedures;
import net.mcreator.clownplinfiresword.init.ClownplinFireSwordModItems;

import net.fabricmc.api.ModInitializer;

public class ClownplinFireSwordMod implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger();
	public static final String MODID = "clownplin_fire_sword";

	@Override
	public void onInitialize() {
		LOGGER.info("Initializing ClownplinFireSwordMod");

		ClownplinFireSwordModTabs.load();

		ClownplinFireSwordModItems.load();

		ClownplinFireSwordModProcedures.load();

	}
}
