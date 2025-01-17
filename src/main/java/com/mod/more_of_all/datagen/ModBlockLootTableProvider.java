
package com.mod.more_of_all.datagen;


import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.item.modItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
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

        dropSelf(modBlocks.THALLIUM_LAMP.get());
        dropSelf(modBlocks.TERMINITE_LAMP.get());

        this.add(modBlocks.THALLIUM_SLAB.get(),
                block -> createSlabItemTable(modBlocks.THALLIUM_SLAB.get()));
        this.add(modBlocks.THALLIUM_DOOR.get(),
                block -> createDoorTable(modBlocks.THALLIUM_DOOR.get()));


        this.add(modBlocks.TERMINITE_ORE.get(),
                block -> createOreDrop(modBlocks.TERMINITE_ORE.get(), modItems.RAW_TERMINITE.get()));
        this.add(modBlocks.DEEPSLATE_TERMINITE_ORE.get(),
                block -> createOreDrop(modBlocks.DEEPSLATE_TERMINITE_ORE.get(), modItems.RAW_TERMINITE.get()));
        this.add(modBlocks.DEEPSLATE_THALLIUM_ORE.get(),
                block -> createOreDrop(modBlocks.DEEPSLATE_THALLIUM_ORE.get(), modItems.THALLIUM.get()));
        this.add(modBlocks.THALLIUM_ORE.get(),
                block -> createOreDrop(modBlocks.THALLIUM_ORE.get(), modItems.THALLIUM.get()));
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
