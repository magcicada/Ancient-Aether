package net.builderdog.ancient_aether.data;

import net.builderdog.ancient_aether.data.generators.AncientAetherBlockStateData;
import net.builderdog.ancient_aether.data.generators.AncientAetherItemModelData;
import net.builderdog.ancient_aether.data.generators.AncientAetherRecipeData;
import net.builderdog.ancient_aether.data.generators.AncientAetherRegistrySets;
import net.builderdog.ancient_aether.data.providers.AncientAetherLootTableProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;

import java.util.concurrent.CompletableFuture;

public class AncientAetherData {
    public static void dataSetup(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();
        PackOutput packOutput = generator.getPackOutput();

        generator.addProvider(true, AncientAetherLootTableProvider.create(packOutput));
        generator.addProvider(true, new AncientAetherBlockStateData(packOutput, fileHelper));
        generator.addProvider(true, new AncientAetherRecipeData(packOutput));
        generator.addProvider(true, new AncientAetherItemModelData(packOutput, fileHelper));
        generator.addProvider(event.includeServer(), new AncientAetherRegistrySets(packOutput, lookupProvider));
    }
}