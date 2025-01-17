package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.item.modItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.*;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    public ModRecipeProvider(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pRegistries) {
        super(pOutput, pRegistries);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        List<ItemLike> TERMINITE_SMELTABLES = List.of(modItems.RAW_TERMINITE.get(),
                modBlocks.TERMINITE_ORE.get(), modBlocks.DEEPSLATE_TERMINITE_ORE.get());
        List<ItemLike> THALLIUM_SMELTABLES = List.of(modBlocks.THALLIUM_ORE.get(), modBlocks.DEEPSLATE_THALLIUM_ORE.get());


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.TERMINITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', modItems.TERMINITE.get())
                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.RAW_TERMINITE_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', modItems.RAW_TERMINITE.get())
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.THALLIUM_BLOCK.get())
                .pattern("AAA")
                .pattern("AAA")
                .pattern("AAA")
                .define('A', modItems.THALLIUM.get())
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.SALVAGER.get())
                .pattern("XAX")
                .pattern("AXA")
                .pattern("XAX")
                .define('A', modItems.THALLIUM.get())
                .define('X', modItems.TERMINITE.get())
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.RAYMINER.get())
                .pattern("XXX")
                .pattern(" A ")
                .pattern(" A ")
                .define('A', Items.NETHERITE_INGOT)
                .define('X', Items.NETHER_STAR)
                .unlockedBy(getHasName(Items.NETHER_STAR), has(Items.NETHER_STAR)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.CHAINSAW.get())
                .pattern(" SS")
                .pattern("XSA")
                .pattern("XXA")
                .define('A', Items.DIAMOND)
                .define('S', Items.IRON_INGOT)
                .define('X', Items.YELLOW_CONCRETE)
                .unlockedBy(getHasName(Items.IRON_INGOT), has(Items.IRON_INGOT)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.DORMANT_STARLIGHT.get())
                .pattern("XAX")
                .pattern("AAA")
                .pattern("XAX")
                .define('A', modItems.THALLIUM.get())
                .define('X', Items.COAL_BLOCK)
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.COBBLESTONE)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.PRISMARINE_CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.PRISMARINE)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.DEEPSLATE_CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.COBBLED_DEEPSLATE)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.NETHER_BRICK_CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.NETHER_BRICK)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.BLACKSTONE_CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.BLACKSTONE)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.SAND_CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.SAND)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modItems.TUFF_CHISEL.get())
                .pattern("SA ")
                .pattern("AX ")
                .pattern("SA ")
                .define('X', Items.DIAMOND)
                .define('A', Items.TUFF)
                .define('S', Items.STICK)
                .unlockedBy(getHasName(Items.STICK), has(Items.STICK)).save(pRecipeOutput);



        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.TERMINITE_LAMP.get())
                .pattern("   ")
                .pattern("AX ")
                .pattern("   ")
                .define('X', modItems.TERMINITE.get())
                .define('A', Items.GLOWSTONE)

                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, modBlocks.THALLIUM_LAMP.get())
                .pattern("   ")
                .pattern("AX ")
                .pattern("   ")
                .define('X', modItems.THALLIUM.get())
                .define('A', Items.GLOWSTONE)

                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);







        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, modItems.TERMINITE.get(), 9)
                .requires(modBlocks.TERMINITE_BLOCK.get())
                .unlockedBy(getHasName(modBlocks.TERMINITE_BLOCK.get()), has(modBlocks.TERMINITE_BLOCK.get())).save(pRecipeOutput);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, modItems.RAW_TERMINITE.get(), 9)
                .requires(modBlocks.RAW_TERMINITE_BLOCK.get())
                .unlockedBy(getHasName(modBlocks.RAW_TERMINITE_BLOCK.get()), has(modBlocks.RAW_TERMINITE_BLOCK.get())).save(pRecipeOutput);


        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, modItems.THALLIUM.get(), 9)
                .requires(modBlocks.THALLIUM_BLOCK.get())
                .unlockedBy(getHasName(modBlocks.THALLIUM_BLOCK.get()), has(modBlocks.THALLIUM_BLOCK.get())).save(pRecipeOutput);







        stairBuilder(modBlocks.TERMINITE_STAIRS.get(), Ingredient.of(modItems.TERMINITE.get())).group("terminite")
                        .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);

        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, modBlocks.TERMINITE_SLAB.get(), modItems.TERMINITE.get());

        fenceBuilder(modBlocks.TERMINITE_FENCE.get(), Ingredient.of(modItems.TERMINITE.get())).group("terminite")
                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);

        fenceGateBuilder(modBlocks.TERMINITE_FENCE_GATE.get(), Ingredient.of(modItems.TERMINITE.get())).group("terminite")
                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);

        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, modBlocks.TERMINITE_WALL.get(), modItems.TERMINITE.get());

        buttonBuilder(modBlocks.TERMINITE_BUTTON.get(), Ingredient.of(modItems.TERMINITE.get())).group("terminite")
                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);

        pressurePlate(pRecipeOutput, modBlocks.TERMINITE_PRESSURE_PLATE.get(), modItems.TERMINITE.get());

        doorBuilder(modBlocks.TERMINITE_DOOR.get(), Ingredient.of(modItems.TERMINITE.get())).group("terminite")
                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);

        trapdoorBuilder(modBlocks.TERMINITE_TRAP_DOOR.get(), Ingredient.of(modItems.TERMINITE.get())).group("terminite")
                .unlockedBy(getHasName(modItems.TERMINITE.get()), has(modItems.TERMINITE.get())).save(pRecipeOutput);



        stairBuilder(modBlocks.THALLIUM_STAIRS.get(), Ingredient.of(modItems.THALLIUM.get())).group("thallium")
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        slab(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, modBlocks.THALLIUM_SLAB.get(), modItems.THALLIUM.get());

        fenceBuilder(modBlocks.THALLIUM_FENCE.get(), Ingredient.of(modItems.THALLIUM.get())).group("thallium")
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        fenceGateBuilder(modBlocks.THALLIUM_FENCE_GATE.get(), Ingredient.of(modItems.THALLIUM.get())).group("thallium")
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        wall(pRecipeOutput, RecipeCategory.BUILDING_BLOCKS, modBlocks.THALLIUM_WALL.get(), modItems.THALLIUM.get());

        buttonBuilder(modBlocks.THALLIUM_BUTTON.get(), Ingredient.of(modItems.THALLIUM.get())).group("thallium")
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        pressurePlate(pRecipeOutput, modBlocks.THALLIUM_PRESSURE_PLATE.get(), modItems.THALLIUM.get());

        doorBuilder(modBlocks.THALLIUM_DOOR.get(), Ingredient.of(modItems.THALLIUM.get())).group("thallium")
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);

        trapdoorBuilder(modBlocks.THALLIUM_TRAP_DOOR.get(), Ingredient.of(modItems.THALLIUM.get())).group("thallium")
                .unlockedBy(getHasName(modItems.THALLIUM.get()), has(modItems.THALLIUM.get())).save(pRecipeOutput);






        oreSmelting(pRecipeOutput, TERMINITE_SMELTABLES, RecipeCategory.MISC, modItems.TERMINITE.get(), 0.25f, 200, "terminite");
        oreSmelting(pRecipeOutput, THALLIUM_SMELTABLES, RecipeCategory.MISC, modItems.THALLIUM.get(), 0.25f, 200, "thallium");
        oreBlasting(pRecipeOutput, TERMINITE_SMELTABLES, RecipeCategory.MISC, modItems.TERMINITE.get(), 0.25f, 100, "terminite");
        oreBlasting(pRecipeOutput, THALLIUM_SMELTABLES, RecipeCategory.MISC, modItems.THALLIUM.get(), 0.25f, 100, "thallium");




    }
    protected static void oreSmelting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.SMELTING_RECIPE, SmeltingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput recipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult,
                                      float pExperience, int pCookingTime, String pGroup) {
        oreCooking(recipeOutput, RecipeSerializer.BLASTING_RECIPE, BlastingRecipe::new, pIngredients, pCategory, pResult,
                pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static <T extends AbstractCookingRecipe> void oreCooking(RecipeOutput recipeOutput, RecipeSerializer<T> pCookingSerializer, AbstractCookingRecipe.Factory<T> factory,
                                                                       List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pCookingSerializer, factory).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(recipeOutput, ExampleMod.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
}
}
