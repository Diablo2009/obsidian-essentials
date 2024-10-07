package me.taskforce.obsidian_essentials.datagen;

import me.taskforce.obsidian_essentials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE).add(ModBlocks.OBSIDIAN_DUST_BLOCK).add(ModBlocks.OBSIDIAN_INFUSED_STONE);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL).add(ModBlocks.OBSIDIAN_INFUSED_STONE);
    }
}
