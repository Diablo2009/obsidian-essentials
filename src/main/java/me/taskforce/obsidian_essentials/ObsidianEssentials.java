package me.taskforce.obsidian_essentials;

import me.taskforce.obsidian_essentials.block.ModBlocks;
import me.taskforce.obsidian_essentials.item.ModItemGroups;
import me.taskforce.obsidian_essentials.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ObsidianEssentials implements ModInitializer {
	public static final String MOD_ID = "obsidian_essentials";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("Hello Fabric world!");
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}