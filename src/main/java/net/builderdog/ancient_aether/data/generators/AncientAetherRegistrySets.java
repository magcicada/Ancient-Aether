package net.builderdog.ancient_aether.data.generators;

import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.data.resources.registries.AncientAetherBiomeModifiers;
import net.builderdog.ancient_aether.data.resources.registries.AncientAetherConfiguredCarvers;
import net.builderdog.ancient_aether.data.resources.registries.AncientAetherNoises;
import net.builderdog.ancient_aether.data.resources.registries.AncientAetherProcessorLists;
import net.builderdog.ancient_aether.data.resources.registries.features.AncientAetherFeatureUtils;
import net.builderdog.ancient_aether.data.resources.registries.placement.AncientAetherPlacementUtils;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public class AncientAetherRegistrySets extends DatapackBuiltinEntriesProvider {
    
    public static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
            .add(Registries.CONFIGURED_FEATURE, AncientAetherFeatureUtils::bootstrap)
            .add(Registries.PLACED_FEATURE, AncientAetherPlacementUtils::bootstrap)
            .add(Registries.CONFIGURED_CARVER, AncientAetherConfiguredCarvers::bootstrap)
            .add(Registries.PROCESSOR_LIST, AncientAetherProcessorLists::bootstrap)
            .add(ForgeRegistries.Keys.BIOME_MODIFIERS, AncientAetherBiomeModifiers::bootstrap)
            .add(Registries.NOISE, AncientAetherNoises::bootstrap);

    public AncientAetherRegistrySets(PackOutput output, CompletableFuture<HolderLookup.Provider> registries) {
        super(output, registries, BUILDER, Set.of(AncientAether.MODID));
    }
}