package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.item.modItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

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

        buttonItem(modBlocks.TERMINITE_BUTTON, modBlocks.TERMINITE_BLOCK);
        fenceItem(modBlocks.TERMINITE_FENCE, modBlocks.TERMINITE_BLOCK);
        wallItem(modBlocks.TERMINITE_WALL, modBlocks.TERMINITE_BLOCK);

        buttonItem(modBlocks.THALLIUM_BUTTON, modBlocks.THALLIUM_BLOCK);
        fenceItem(modBlocks.THALLIUM_FENCE, modBlocks.THALLIUM_BLOCK);
        wallItem(modBlocks.THALLIUM_WALL, modBlocks.THALLIUM_BLOCK);

        simpleBlockItem(modBlocks.TERMINITE_DOOR);
        simpleBlockItem(modBlocks.THALLIUM_DOOR);

        simpleBlockItem(modBlocks.TERMINITE_TRAP_DOOR);
        simpleBlockItem(modBlocks.THALLIUM_TRAP_DOOR);





        handheldItem(modItems.TERMINITE_SWORD);
        handheldItem(modItems.TERMINITE_PICKAXE);
        handheldItem(modItems.TERMINITE_AXE);
        handheldItem(modItems.TERMINITE_SHOVEL);
        handheldItem(modItems.TERMINITE_HOE);
        handheldItem(modItems.THALLIUM_HOE);
        handheldItem(modItems.THALLIUM_PICKAXE);
        handheldItem(modItems.THALLIUM_AXE);
        handheldItem(modItems.THALLIUM_SWORD);
        handheldItem(modItems.THALLIUM_SHOVEL);
    }
    private void handheldItem(RegistryObject<Item> item) {
        withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/handheld"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID, "item/" + item.getId().getPath()));
    }




    public void buttonItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        String blockPath = block.getId().getPath();
        String baseBlockPath = baseBlock.getId().getPath();
        String namespace = block.getId().getNamespace();

        this.withExistingParent(blockPath, mcLoc("block/button_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(namespace, "block/" + baseBlockPath));
    }
    public void fenceItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        String blockPath = block.getId().getPath();
        String baseBlockPath = baseBlock.getId().getPath();
        String namespace = block.getId().getNamespace();

        this.withExistingParent(blockPath, mcLoc("block/fence_inventory"))
                .texture("texture", ResourceLocation.fromNamespaceAndPath(namespace, "block/" + baseBlockPath));
    }

    public void wallItem(RegistryObject<? extends Block> block, RegistryObject<Block> baseBlock) {
        String blockPath = block.getId().getPath();
        String baseBlockPath = baseBlock.getId().getPath();
        String namespace = block.getId().getNamespace();

        this.withExistingParent(blockPath, mcLoc("block/wall_inventory"))
                .texture("wall", ResourceLocation.fromNamespaceAndPath(namespace, "block/" + baseBlockPath));
    }


    public void simpleBlockItem(RegistryObject<? extends Block> block) {
        String path = block.getId().getPath();
        String namespace = block.getId().getNamespace();

        // For most blocks, the texture is in the block folder
        String texturePath = "block/" + path;

        // Special case for doors, which typically have textures in the item folder
        if (path.contains("door")) {
            texturePath = "item/" + path;
        }

        withExistingParent(path, mcLoc("item/generated"))
                .texture("layer0", ResourceLocation.fromNamespaceAndPath(namespace, texturePath));
    }

}
