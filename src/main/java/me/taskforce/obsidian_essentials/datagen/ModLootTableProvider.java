package me.taskforce.obsidian_essentials.datagen;

import me.taskforce.obsidian_essentials.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.OBSIDIAN_DUST_BLOCK);
        addDrop(ModBlocks.OBSIDIAN_INFUSED_STONE);
    }
}
