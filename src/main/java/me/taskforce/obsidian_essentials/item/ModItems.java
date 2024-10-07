package me.taskforce.obsidian_essentials.item;

import me.taskforce.obsidian_essentials.ObsidianEssentials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class ModItems {
    // Item Definitions
    public static final Item OBSIDIAN_DUST = registerItem("obsidian_dust", new Item(new FabricItemSettings().rarity(Rarity.RARE)));
    public static final Item OBSIDIAN_CRUSHER = registerItem("obsidian_crusher", new Item(new FabricItemSettings()));
    public static final Item OBSIDIAN_FUEL = registerItem("obsidian_fuel", new Item(new FabricItemSettings().rarity(Rarity.UNCOMMON)));
    public static final Item OBSIDIAN_PICKAXE = registerItem("obsidian_pickaxe", new PickaxeItem(ModToolMaterial.OBSIDIAN, 2, 2f, new FabricItemSettings()));
    public static final Item OBSIDIAN_AXE = registerItem("obsidian_axe", new AxeItem(ModToolMaterial.OBSIDIAN, 5, 2f, new FabricItemSettings()));
    public static final Item OBSIDIAN_SHOVEL = registerItem("obsidian_shovel", new ShovelItem(ModToolMaterial.OBSIDIAN, 1, 1f, new FabricItemSettings()));
    public static final Item OBSIDIAN_SWORD = registerItem("obsidian_sword", new SwordItem(ModToolMaterial.OBSIDIAN, 7, 4f, new FabricItemSettings()));
    public static final Item OBSIDIAN_HOE = registerItem("obsidian_hoe", new HoeItem(ModToolMaterial.OBSIDIAN, 0, 0f, new FabricItemSettings()));

    // Register Items, used in Item Definitions
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(ObsidianEssentials.MOD_ID, name), item);
    }

    // Registers Mod Items to their Item Group.
    public static void registerModItems() {
        ObsidianEssentials.LOGGER.info("Registering Mod Items for " + ObsidianEssentials.MOD_ID);
    }
}
