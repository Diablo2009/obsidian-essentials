package me.taskforce.obsidian_essentials.item;

import me.taskforce.obsidian_essentials.ObsidianEssentials;
import me.taskforce.obsidian_essentials.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup OBSIDIAN_ESSENTIALS_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(ObsidianEssentials.MOD_ID, "obsidian_essentials"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.obsidian_essentials"))
                    .icon(() -> new ItemStack(ModItems.OBSIDIAN_DUST)).entries((displayContext, entries) -> {
                        entries.add(ModItems.OBSIDIAN_DUST);
                        entries.add(ModItems.OBSIDIAN_CRUSHER);
                        entries.add(ModItems.OBSIDIAN_FUEL);
                        entries.add(ModItems.OBSIDIAN_PICKAXE);
                        entries.add(ModItems.OBSIDIAN_AXE);
                        entries.add(ModItems.OBSIDIAN_HOE);
                        entries.add(ModItems.OBSIDIAN_SHOVEL);
                        entries.add(ModItems.OBSIDIAN_SWORD);
                        entries.add(ModItems.OBSIDIAN_BOOTS);
                        entries.add(ModItems.OBSIDIAN_LEGS);
                        entries.add(ModItems.OBSIDIAN_CHEST);
                        entries.add(ModItems.OBSIDIAN_HELM);
                        entries.add(ModBlocks.OBSIDIAN_DUST_BLOCK);
                        entries.add(ModBlocks.OBSIDIAN_INFUSED_STONE);
                    }).build());

    public static void registerItemGroups() {
        ObsidianEssentials.LOGGER.info("Registering Item Groups for " +ObsidianEssentials.MOD_ID);
    }
}
