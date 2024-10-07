package me.taskforce.obsidian_essentials.datagen;

import me.taskforce.obsidian_essentials.block.ModBlocks;
import me.taskforce.obsidian_essentials.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Model;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSIDIAN_DUST_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.OBSIDIAN_INFUSED_STONE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.OBSIDIAN_FUEL, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_DUST, Models.GENERATED);
        itemModelGenerator.register(ModItems.OBSIDIAN_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_HOE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.OBSIDIAN_CRUSHER, Models.GENERATED);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_BOOTS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_LEGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_CHEST));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.OBSIDIAN_HELM));
    }
}
