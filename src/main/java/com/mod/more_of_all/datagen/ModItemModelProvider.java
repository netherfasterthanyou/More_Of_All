package com.mod.more_of_all.datagen;

import com.mod.more_of_all.ExampleMod;
import com.mod.more_of_all.block.modBlocks;
import com.mod.more_of_all.item.modItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.armortrim.TrimMaterial;
import net.minecraft.world.item.armortrim.TrimMaterials;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.LinkedHashMap;

import static net.minecraft.world.entity.EquipmentSlot.FEET;

public class ModItemModelProvider extends ItemModelProvider {
    private static final LinkedHashMap<ResourceKey<TrimMaterial>, Float> trimMaterials = new LinkedHashMap<>();

    static {


        trimMaterials.put(TrimMaterials.QUARTZ, 0.1F);
        trimMaterials.put(TrimMaterials.IRON, 0.2F);
        trimMaterials.put(TrimMaterials.NETHERITE, 0.3F);
        trimMaterials.put(TrimMaterials.REDSTONE, 0.4F);
        trimMaterials.put(TrimMaterials.COPPER, 0.5F);
        trimMaterials.put(TrimMaterials.GOLD, 0.6F);
        trimMaterials.put(TrimMaterials.EMERALD, 0.7F);
        trimMaterials.put(TrimMaterials.DIAMOND, 0.8F);
        trimMaterials.put(TrimMaterials.LAPIS, 0.9F);
        trimMaterials.put(TrimMaterials.AMETHYST, 1.0F);
    }


    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
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
        basicItem(modItems.BLUEBERRIES.get());
        basicItem(modItems.CHILI_SEEDS.get());

        basicItem(modItems.TERMINITE_HORSE_ARMOR.get());
        basicItem(modItems.THALLIUM_HORSE_ARMOR.get());
        basicItem(modItems.TRACK_SMITHING_TEMPLATE.get());



        buttonItem(modBlocks.TERMINITE_BUTTON, modBlocks.TERMINITE_BLOCK);
        fenceItem(modBlocks.TERMINITE_FENCE, modBlocks.TERMINITE_BLOCK);
        wallItem(modBlocks.TERMINITE_WALL, modBlocks.TERMINITE_BLOCK);


        buttonItem(modBlocks.BLOODWOOD_BUTTON, modBlocks.BLOODWOOD_PLANKS);
        fenceItem(modBlocks.BLOODWOOD_FENCE, modBlocks.BLOODWOOD_PLANKS);
        wallItem(modBlocks.BLOODWOOD_WALL, modBlocks.BLOODWOOD_PLANKS);
        buttonItem(modBlocks.DRIFTWOOD_BUTTON, modBlocks.DRIFTWOOD_PLANKS);
        fenceItem(modBlocks.DRIFTWOOD_FENCE, modBlocks.DRIFTWOOD_PLANKS);
        wallItem(modBlocks.DRIFTWOOD_WALL, modBlocks.DRIFTWOOD_PLANKS);
        buttonItem(modBlocks.EUCALYPTUS_BUTTON, modBlocks.EUCALYPTUS_PLANKS);
        fenceItem(modBlocks.EUCALYPTUS_FENCE, modBlocks.EUCALYPTUS_PLANKS);
        wallItem(modBlocks.EUCALYPTUS_WALL, modBlocks.EUCALYPTUS_PLANKS);




        buttonItem(modBlocks.THALLIUM_BUTTON, modBlocks.THALLIUM_BLOCK);
        fenceItem(modBlocks.THALLIUM_FENCE, modBlocks.THALLIUM_BLOCK);
        wallItem(modBlocks.THALLIUM_WALL, modBlocks.THALLIUM_BLOCK);

        simpleBlockItem(modBlocks.TERMINITE_DOOR);
        simpleBlockItem(modBlocks.THALLIUM_DOOR);
        simpleBlockItem(modBlocks.BLOODWOOD_DOOR);
        simpleBlockItem(modBlocks.DRIFTWOOD_DOOR);
        simpleBlockItem(modBlocks.EUCALYPTUS_DOOR);




        handheldItem(modItems.HAMMER);
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


        trimmedArmorItem(modItems.TERMINITE_HELMET);
        trimmedArmorItem(modItems.TERMINITE_CHESTPLATE);
        trimmedArmorItem(modItems.TERMINITE_LEGGINGS);
        trimmedArmorItem(modItems.TERMINITE_BOOTS);

        trimmedArmorItem(modItems.THALLIUM_HELMET);
        trimmedArmorItem(modItems.THALLIUM_CHESTPLATE);
        trimmedArmorItem(modItems.THALLIUM_LEGGINGS);
        trimmedArmorItem(modItems.THALLIUM_BOOTS);


        saplingItem(modBlocks.EUCALYPTUS_SAPLING);
        saplingItem(modBlocks.DRIFTWOOD_SAPLING);
        saplingItem(modBlocks.BLOODWOOD_SAPLING);

    }
    private ItemModelBuilder saplingItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID,"block/" + item.getId().getPath()));
    }
    private void trimmedArmorItem(RegistryObject<Item> itemRegistryObject) {
        final String MOD_ID = ExampleMod.MOD_ID; // Change this to your mod id

        if(itemRegistryObject.get() instanceof ArmorItem armorItem) {
            trimMaterials.forEach((trimMaterial, value) -> {
                float trimValue = value;

                String armorType = switch (armorItem.getEquipmentSlot()) {
                    case HEAD -> "helmet";
                    case CHEST -> "chestplate";
                    case LEGS -> "leggings";
                    case FEET -> "boots";
                    default -> "";
                };

                String armorItemPath = armorItem.toString();
                String trimPath = "trims/items/" + armorType + "_trim_" + trimMaterial.location().getPath();
                String currentTrimName = armorItemPath + "_" + trimMaterial.location().getPath() + "_trim";
                ResourceLocation armorItemResLoc = ResourceLocation.parse(armorItemPath);
                ResourceLocation trimResLoc = ResourceLocation.parse(trimPath); // minecraft namespace
                ResourceLocation trimNameResLoc = ResourceLocation.parse(currentTrimName);


                existingFileHelper.trackGenerated(trimResLoc, PackType.CLIENT_RESOURCES, ".png", "textures");


                getBuilder(currentTrimName)
                        .parent(new ModelFile.UncheckedModelFile("item/generated"))
                        .texture("layer0", armorItemResLoc.getNamespace() + ":item/" + armorItemResLoc.getPath())
                        .texture("layer1", trimResLoc);


                this.withExistingParent(itemRegistryObject.getId().getPath(),
                                mcLoc("item/generated"))
                        .override()
                        .model(new ModelFile.UncheckedModelFile(trimNameResLoc.getNamespace()  + ":item/" + trimNameResLoc.getPath()))
                        .predicate(mcLoc("trim_type"), trimValue).end()
                        .texture("layer0",
                                ResourceLocation.fromNamespaceAndPath(MOD_ID,
                                        "item/" + itemRegistryObject.getId().getPath()));
            });
        }


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


    private ItemModelBuilder simpleBlockItem(RegistryObject<? extends Block> item) {
        return withExistingParent(item.getId().getPath(),
                ResourceLocation.parse("item/generated")).texture("layer0",
                ResourceLocation.fromNamespaceAndPath(ExampleMod.MOD_ID,"item/" + item.getId().getPath()));
    }

}
