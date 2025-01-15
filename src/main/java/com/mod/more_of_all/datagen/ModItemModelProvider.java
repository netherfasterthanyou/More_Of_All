package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.item.modItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper){
        super(output, ExampleMod.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        basicItem(modItems.CHAINSAW.get());
        basicItem(modItems.CHISEL.get());
        basicItem(modItems.BLACKSTONE_CHISEL.get());
        basicItem(modItems.NETHER_BRICK_CHISEL.get());
        basicItem(modItems.RAW_TERMINITE.get());
        basicItem(modItems.THALLIUM.get());
        basicItem(modItems.TERMINITE.get());
        basicItem(modItems.RAYMINER.get());
        basicItem(modItems.SAND_CHISEL.get());
        basicItem(modItems.DEEPSLATE_CHISEL.get());
        basicItem(modItems.DORMANT_STARLIGHT.get());
        basicItem(modItems.PRISMARINE_CHISEL.get());
        basicItem(modItems.TUFF_CHISEL.get());
        basicItem(modItems.CHILI.get());
    }
}
