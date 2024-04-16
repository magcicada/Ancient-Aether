package net.builderdog.ancient_aether.world.biome;

import com.aetherteam.aether.data.resources.AetherFeatureStates;
import net.builderdog.ancient_aether.data.resources.AncientAetherFeatureStates;
import net.builderdog.ancient_aether.data.resources.registries.AncientAetherBiomes;
import net.builderdog.ancient_aether.data.resources.registries.AncientAetherNoises;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.Noises;
import net.minecraft.world.level.levelgen.SurfaceRules;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.placement.CaveSurface;

public class AncientAetherSurfaceRules {

    public static SurfaceRules.RuleSource makeRules() {
        return SurfaceRules.sequence(
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.WYNDCAP_PEAKS),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR,
                                SurfaceRules.ifTrue(SurfaceRules.noiseCondition(Noises.POWDER_SNOW, 0.45D, 0.58D),
                                        SurfaceRules.state(Blocks.POWDER_SNOW.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.WYNDCAP_PEAKS),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(Blocks.SNOW_BLOCK.defaultBlockState()))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.WYNDCAP_TAIGA, AncientAetherBiomes.FESTIVE_WYNDCAP_TAIGA, AncientAetherBiomes.WYNDCAP_HIGHLAND),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(AncientAetherFeatureStates.FROZEN_AETHER_GRASS_BLOCK))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.ELEVATED_FOREST, AncientAetherBiomes.ELEVATED_CLEARING),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(AncientAetherFeatureStates.PALE_AETHER_GRASS_BLOCK))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.HOLYSTONE_CAVERNS, AncientAetherBiomes.FROZEN_CAVERNS, AncientAetherBiomes.ELEVATED_CAVERNS, AncientAetherBiomes.ATMOSINE_GROTTO),
                        SurfaceRules.ifTrue(SurfaceRules.ON_FLOOR, SurfaceRules.state(AetherFeatureStates.HOLYSTONE))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.WYNDCAP_PEAKS, AncientAetherBiomes.HOLYSTONE_CAVERNS, AncientAetherBiomes.FROZEN_CAVERNS, AncientAetherBiomes.ELEVATED_CAVERNS, AncientAetherBiomes.ATMOSINE_GROTTO),
                        SurfaceRules.ifTrue(SurfaceRules.stoneDepthCheck(0, true, 0, CaveSurface.FLOOR), SurfaceRules.state(AetherFeatureStates.HOLYSTONE))
                ),


                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -0.2D, 0.2D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_layer_01", VerticalAnchor.absolute(103), VerticalAnchor.absolute(103)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -0.5D, 0.5D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_layer_02", VerticalAnchor.absolute(104), VerticalAnchor.absolute(104)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -0.75D, 0.75D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_layer_03", VerticalAnchor.absolute(105), VerticalAnchor.absolute(105)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -1.0D, 1.0D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_layer_04", VerticalAnchor.absolute(106), VerticalAnchor.absolute(106)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -1.2D, 1.2D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_layer_05", VerticalAnchor.absolute(107), VerticalAnchor.absolute(107)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -1.35D, 1.35D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_layer_06", VerticalAnchor.absolute(108), VerticalAnchor.absolute(108)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -1.5D, 1.5D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("lake_top_layer", VerticalAnchor.absolute(109), VerticalAnchor.absolute(109)), SurfaceRules.state(Blocks.WATER.defaultBlockState())))
                ),
                SurfaceRules.ifTrue(SurfaceRules.isBiome(AncientAetherBiomes.SKY_LAKE),
                        SurfaceRules.ifTrue(SurfaceRules.noiseCondition(AncientAetherNoises.SKYLANDS_AQUIFER, -1.5D, 1.5D),
                                SurfaceRules.ifTrue(SurfaceRules.verticalGradient("above_lake", VerticalAnchor.absolute(256), VerticalAnchor.absolute(256)), SurfaceRules.state(Blocks.AIR.defaultBlockState())))
                )
        );
    }
}