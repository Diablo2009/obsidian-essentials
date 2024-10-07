package me.taskforce.obsidian_essentials.datagen;

import me.taskforce.obsidian_essentials.block.ModBlocks;
import me.taskforce.obsidian_essentials.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.OBSIDIAN_DUST, RecipeCategory.MISC, ModBlocks.OBSIDIAN_DUST_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OBSIDIAN_INFUSED_STONE, 1)
                .pattern("###")
                .pattern("#@#")
                .pattern("###")
                .input('#', ModItems.OBSIDIAN_DUST)
                .input('@', Items.STONE)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.STONE), conditionsFromItem(Items.STONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModBlocks.OBSIDIAN_INFUSED_STONE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_AXE, 1)
                .pattern("## ")
                .pattern("#@ ")
                .pattern(" @ ")
                .input('#', ModItems.OBSIDIAN_DUST)
                .input('@', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_AXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_PICKAXE, 1)
                .pattern("###")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModItems.OBSIDIAN_DUST)
                .input('@', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_PICKAXE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_SHOVEL, 1)
                .pattern(" # ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModItems.OBSIDIAN_DUST)
                .input('@', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_SHOVEL)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_SWORD, 1)
                .pattern(" # ")
                .pattern(" # ")
                .pattern(" @ ")
                .input('#', ModItems.OBSIDIAN_DUST)
                .input('@', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_SWORD)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_HOE, 1)
                .pattern("## ")
                .pattern(" @ ")
                .pattern(" @ ")
                .input('#', ModItems.OBSIDIAN_DUST)
                .input('@', Items.STICK)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.STICK), conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_HOE)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_BOOTS, 1)
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.OBSIDIAN_DUST)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_BOOTS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_LEGS, 1)
                .pattern("###")
                .pattern("# #")
                .pattern("# #")
                .input('#', ModItems.OBSIDIAN_DUST)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_LEGS)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_CHEST, 1)
                .pattern("# #")
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.OBSIDIAN_DUST)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_CHEST)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_HELM, 1)
                .pattern("###")
                .pattern("# #")
                .input('#', ModItems.OBSIDIAN_DUST)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_HELM)));
        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.OBSIDIAN_FUEL, 1)
                .input(ModItems.OBSIDIAN_DUST)
                .input(Items.COAL)
                .criterion(hasItem(ModItems.OBSIDIAN_DUST), conditionsFromItem(ModItems.OBSIDIAN_DUST))
                .criterion(hasItem(Items.COAL), conditionsFromItem(Items.COAL))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.OBSIDIAN_FUEL)));
    }
}
