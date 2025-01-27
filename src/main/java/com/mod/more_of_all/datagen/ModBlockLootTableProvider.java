
package com.mod.more_of_all.datagen;


import com.mod.more_of_all.block.custom.ChiliCropBlock;
import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.item.modItems;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SweetBerryBushBlock;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider pRegistries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), pRegistries);
    }

    @Override
    protected void generate() {
        dropSelf(modBlocks.TERMINITE_BLOCK.get());
        dropSelf(modBlocks.RAW_TERMINITE_BLOCK.get());
        dropSelf(modBlocks.THALLIUM_BLOCK.get());
        dropSelf(modBlocks.SALVAGER.get());


        dropSelf(modBlocks.TERMINITE_BUTTON.get());
        dropSelf(modBlocks.TERMINITE_FENCE.get());
        dropSelf(modBlocks.TERMINITE_WALL.get());
        dropSelf(modBlocks.TERMINITE_STAIRS.get());
        dropSelf(modBlocks.TERMINITE_PRESSURE_PLATE.get());
        dropSelf(modBlocks.TERMINITE_TRAP_DOOR.get());
        dropSelf(modBlocks.TERMINITE_FENCE_GATE.get());

        this.add(modBlocks.TERMINITE_SLAB.get(),
                block -> createSlabItemTable(modBlocks.TERMINITE_SLAB.get()));

        this.add(modBlocks.TERMINITE_DOOR.get(),
                block -> createDoorTable(modBlocks.TERMINITE_DOOR.get()));

        dropSelf(modBlocks.THALLIUM_BUTTON.get());
        dropSelf(modBlocks.THALLIUM_FENCE.get());
        dropSelf(modBlocks.THALLIUM_FENCE_GATE.get());
        dropSelf(modBlocks.THALLIUM_WALL.get());
        dropSelf(modBlocks.THALLIUM_TRAP_DOOR.get());
        dropSelf(modBlocks.THALLIUM_PRESSURE_PLATE.get());
        dropSelf(modBlocks.THALLIUM_STAIRS.get());

        dropSelf(modBlocks.BLOODWOOD_BUTTON.get());
        dropSelf(modBlocks.BLOODWOOD_FENCE.get());
        dropSelf(modBlocks.BLOODWOOD_FENCE_GATE.get());
        dropSelf(modBlocks.BLOODWOOD_WALL.get());
        dropSelf(modBlocks.BLOODWOOD_TRAP_DOOR.get());
        dropSelf(modBlocks.BLOODWOOD_PRESSURE_PLATE.get());
        dropSelf(modBlocks.BLOODWOOD_STAIRS.get());

        dropSelf(modBlocks.DRIFTWOOD_BUTTON.get());
        dropSelf(modBlocks.DRIFTWOOD_FENCE.get());
        dropSelf(modBlocks.DRIFTWOOD_FENCE_GATE.get());
        dropSelf(modBlocks.DRIFTWOOD_WALL.get());
        dropSelf(modBlocks.DRIFTWOOD_TRAP_DOOR.get());
        dropSelf(modBlocks.DRIFTWOOD_PRESSURE_PLATE.get());
        dropSelf(modBlocks.DRIFTWOOD_STAIRS.get());

        dropSelf(modBlocks.EUCALYPTUS_BUTTON.get());
        dropSelf(modBlocks.EUCALYPTUS_FENCE.get());
        dropSelf(modBlocks.EUCALYPTUS_FENCE_GATE.get());
        dropSelf(modBlocks.EUCALYPTUS_WALL.get());
        dropSelf(modBlocks.EUCALYPTUS_TRAP_DOOR.get());
        dropSelf(modBlocks.EUCALYPTUS_PRESSURE_PLATE.get());
        dropSelf(modBlocks.EUCALYPTUS_STAIRS.get());

        this.dropSelf(modBlocks.EUCALYPTUS_SAPLING.get());
        this.dropSelf(modBlocks.EUCALYPTUS_LOG.get());
        this.dropSelf(modBlocks.STRIPPED_EUCALYPTUS_LOG.get());
        this.dropSelf(modBlocks.EUCALYPTUS_WOOD.get());
        this.dropSelf(modBlocks.STRIPPED_EUCALYPTUS_WOOD.get());
        this.dropSelf(modBlocks.EUCALYPTUS_PLANKS.get());


        this.add(modBlocks.EUCALYPTUS_LEAVES.get(),
                block -> createLeavesDrops(block, modBlocks.EUCALYPTUS_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(modBlocks.DRIFTWOOD_SAPLING.get());
        this.dropSelf(modBlocks.DRIFTWOOD_LOG.get());
        this.dropSelf(modBlocks.STRIPPED_DRIFTWOOD_LOG.get());
        this.dropSelf(modBlocks.DRIFTWOOD_WOOD.get());
        this.dropSelf(modBlocks.STRIPPED_DRIFTWOOD_WOOD.get());
        this.dropSelf(modBlocks.DRIFTWOOD_PLANKS.get());


        this.add(modBlocks.DRIFTWOOD_LEAVES.get(),
                block -> createLeavesDrops(block, modBlocks.DRIFTWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        this.dropSelf(modBlocks.BLOODWOOD_SAPLING.get());
        this.dropSelf(modBlocks.BLOODWOOD_LOG.get());
        this.dropSelf(modBlocks.STRIPPED_BLOODWOOD_LOG.get());
        this.dropSelf(modBlocks.BLOODWOOD_WOOD.get());
        this.dropSelf(modBlocks.STRIPPED_BLOODWOOD_WOOD.get());
        this.dropSelf(modBlocks.BLOODWOOD_PLANKS.get());


        this.add(modBlocks.BLOODWOOD_LEAVES.get(),
                block -> createLeavesDrops(block, modBlocks.BLOODWOOD_SAPLING.get(), NORMAL_LEAVES_SAPLING_CHANCES));

        dropSelf(modBlocks.THALLIUM_LAMP.get());
        dropSelf(modBlocks.TERMINITE_LAMP.get());

        this.add(modBlocks.THALLIUM_SLAB.get(),
                block -> createSlabItemTable(modBlocks.THALLIUM_SLAB.get()));
        this.add(modBlocks.THALLIUM_DOOR.get(),
                block -> createDoorTable(modBlocks.THALLIUM_DOOR.get()));

        this.add(modBlocks.BLOODWOOD_SLAB.get(),
                block -> createSlabItemTable(modBlocks.BLOODWOOD_SLAB.get()));
        this.add(modBlocks.BLOODWOOD_DOOR.get(),
                block -> createDoorTable(modBlocks.BLOODWOOD_DOOR.get()));
        this.add(modBlocks.DRIFTWOOD_SLAB.get(),
                block -> createSlabItemTable(modBlocks.DRIFTWOOD_SLAB.get()));
        this.add(modBlocks.DRIFTWOOD_DOOR.get(),
                block -> createDoorTable(modBlocks.DRIFTWOOD_DOOR.get()));
        this.add(modBlocks.EUCALYPTUS_SLAB.get(),
                block -> createSlabItemTable(modBlocks.EUCALYPTUS_SLAB.get()));
        this.add(modBlocks.EUCALYPTUS_DOOR.get(),
                block -> createDoorTable(modBlocks.EUCALYPTUS_DOOR.get()));


        this.add(modBlocks.TERMINITE_ORE.get(),
                block -> createOreDrop(modBlocks.TERMINITE_ORE.get(), modItems.RAW_TERMINITE.get()));
        this.add(modBlocks.DEEPSLATE_TERMINITE_ORE.get(),
                block -> createOreDrop(modBlocks.DEEPSLATE_TERMINITE_ORE.get(), modItems.RAW_TERMINITE.get()));
        this.add(modBlocks.DEEPSLATE_THALLIUM_ORE.get(),
                block -> createOreDrop(modBlocks.DEEPSLATE_THALLIUM_ORE.get(), modItems.THALLIUM.get()));
        this.add(modBlocks.THALLIUM_ORE.get(),
                block -> createOreDrop(modBlocks.THALLIUM_ORE.get(), modItems.THALLIUM.get()));


        LootItemCondition.Builder lootItemConditionBuilder = LootItemBlockStatePropertyCondition.hasBlockStateProperties(modBlocks.CHILI_CROP.get())
                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(ChiliCropBlock.AGE, ChiliCropBlock.MAX_AGE));

        this.add(modBlocks.CHILI_CROP.get(), this.createCropDrops(modBlocks.CHILI_CROP.get(),
                modItems.CHILI.get(), modItems.CHILI_SEEDS.get(), lootItemConditionBuilder));


        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);

        this.add(modBlocks.BLUEBERRY_BUSH.get(), block -> this.applyExplosionDecay(
                block,LootTable.lootTable().withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(modBlocks.BLUEBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 3))
                                ).add(LootItem.lootTableItem(modItems.BLUEBERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(3.0F, 4.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                ).withPool(LootPool.lootPool().when(
                                        LootItemBlockStatePropertyCondition.hasBlockStateProperties(modBlocks.BLUEBERRY_BUSH.get())
                                                .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(SweetBerryBushBlock.AGE, 2))
                                ).add(LootItem.lootTableItem(modItems.BLUEBERRIES.get()))
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 3.0F)))
                                .apply(ApplyBonusCount.addUniformBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )));
    }














    protected LootTable.Builder createMultipleOreDrops(Block pBlock, Item item, float minDrops, float maxDrops) {
        HolderLookup.RegistryLookup<Enchantment> registrylookup = this.registries.lookupOrThrow(Registries.ENCHANTMENT);
        return this.createSilkTouchDispatchTable(
                pBlock, this.applyExplosionDecay(
                        pBlock, LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(minDrops, maxDrops)))
                                .apply(ApplyBonusCount.addOreBonusCount(registrylookup.getOrThrow(Enchantments.FORTUNE)))
                )
        );
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return modBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
