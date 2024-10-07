package me.taskforce.obsidian_essentials.item;

import me.taskforce.obsidian_essentials.ObsidianEssentials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    // Item Definitions
    public static final Item OBSIDIAN_DUST = registerItem("obsidian_dust", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_CRUSHER = registerItem("obsidian_crusher", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_FUEL = registerItem("obsidian_fuel", new Item(new FabricItemSettings()));

    // Register Items, used in Item Definitions
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ObsidianEssentials.MOD_ID, name), item);
    }

    // Registers Mod Items to their Item Group.
    public static void registerModItems() {
        ObsidianEssentials.LOGGER.info("Registering Mod Items for " + ObsidianEssentials.MOD_ID);
    }
}
