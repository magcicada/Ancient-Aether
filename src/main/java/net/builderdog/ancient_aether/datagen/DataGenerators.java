package net.builderdog.ancient_aether.datagen;

import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.datagen.generators.AncientAetherBlockStateData;
import net.builderdog.ancient_aether.datagen.generators.AncientAetherItemModelData;
import net.builderdog.ancient_aether.datagen.generators.AncientAetherRecipeData;
import net.builderdog.ancient_aether.datagen.providers.AncientAetherLootTableProvider;
import net.builderdog.ancient_aether.datagen.resources.AncientAetherWorldGenProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.concurrent.CompletableFuture;

@Mod.EventBusSubscriber(modid = AncientAether.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        PackOutput packOutput = generator.getPackOutput();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();
        CompletableFuture<HolderLookup.Provider> lookupProvider = event.getLookupProvider();

        generator.addProvider(true, AncientAetherLootTableProvider.create(packOutput));
        generator.addProvider(true, new AncientAetherBlockStateData(packOutput, existingFileHelper));
        generator.addProvider(true, new AncientAetherRecipeData(packOutput));
        generator.addProvider(true, new AncientAetherItemModelData(packOutput, existingFileHelper));
        generator.addProvider(event.includeServer(), new AncientAetherWorldGenProvider(packOutput, lookupProvider));
    }
}
