package net.builderdog.ancient_aether.block;

import com.aetherteam.aether.block.AetherBlockStateProperties;
import net.builderdog.ancient_aether.block.blockstate.AetherGrassType;
import net.builderdog.ancient_aether.block.blockstate.AetherTallGrassLength;
import net.builderdog.ancient_aether.block.blockstate.AncientAetherBlockStateProperties;
import net.minecraft.world.level.block.state.BlockState;

public class AncientAetherFeatureStates {
    public static final BlockState SKYROOT_PINE_LEAVES = AncientAetherBlocks.SKYROOT_PINE_LEAVES.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState CRYSTAL_SKYROOT_LEAVES = AncientAetherBlocks.CRYSTAL_SKYROOT_LEAVES.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState ENCHANTED_SKYROOT_LEAVES = AncientAetherBlocks.ENCHANTED_SKYROOT_LEAVES.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState HIGHSPROOT_LEAVES = AncientAetherBlocks.HIGHSPROOT_LEAVES.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState FROSTED_HIGHSPROOT_LEAVES = AncientAetherBlocks.FROSTED_HIGHSPROOT_LEAVES.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState SAKURA_LEAVES = AncientAetherBlocks.SAKURA_LEAVES.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState HIGHSPROOT_LOG = AncientAetherBlocks.HIGHSPROOT_LOG.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState SAKURA_LOG = AncientAetherBlocks.SAKURA_LOG.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState VIOLET_AERCLOUD = AncientAetherBlocks.VIOLET_AERCLOUD.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState SKY_GRASS_VERY_SHORT = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.VERY_SHORT);
    public static final BlockState SKY_GRASS_SHORT = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.SHORT);
    public static final BlockState SKY_GRASS_MEDIUM = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.MEDIUM);
    public static final BlockState SKY_GRASS_TALL = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.TALL);
    public static final BlockState SKY_GRASS_VERY_TALL = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.VERY_TALL);
    public static final BlockState SKY_GRASS_VERY_SHORT_FROZEN = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.VERY_SHORT).setValue(AncientAetherBlockStateProperties.TYPE, AetherGrassType.FROZEN);
    public static final BlockState SKY_GRASS_SHORT_FROZEN = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.SHORT).setValue(AncientAetherBlockStateProperties.TYPE, AetherGrassType.FROZEN);
    public static final BlockState SKY_GRASS_MEDIUM_FROZEN = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.MEDIUM).setValue(AncientAetherBlockStateProperties.TYPE, AetherGrassType.FROZEN);
    public static final BlockState SKY_GRASS_VERY_SHORT_PALE = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.VERY_SHORT).setValue(AncientAetherBlockStateProperties.TYPE, AetherGrassType.PALE);
    public static final BlockState SKY_GRASS_SHORT_PALE = AncientAetherBlocks.SKY_GRASS.get().defaultBlockState().setValue(AncientAetherBlockStateProperties.LENGTH, AetherTallGrassLength.SHORT).setValue(AncientAetherBlockStateProperties.TYPE, AetherGrassType.PALE);
    public static final BlockState GRAVITY_GRAVEL = AncientAetherBlocks.GRAVITY_GRAVEL.get().defaultBlockState().setValue(AetherBlockStateProperties.DOUBLE_DROPS, true);
    public static final BlockState WYND_ICE = AncientAetherBlocks.WYND_ICE.get().defaultBlockState();
}