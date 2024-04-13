package net.builderdog.ancient_aether.data.generators.tags;

import com.aetherteam.aether.AetherTags;
import com.aetherteam.aether.block.AetherBlocks;
import com.aetherteam.aether.item.AetherItems;
import net.builderdog.ancient_aether.AncientAether;
import net.builderdog.ancient_aether.AncientAetherTags;
import net.builderdog.ancient_aether.block.AncientAetherBlocks;
import net.builderdog.ancient_aether.item.AncientAetherItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class AncientAetherItemTagData extends ItemTagsProvider {
    public AncientAetherItemTagData(PackOutput output, CompletableFuture<HolderLookup.Provider> registries, CompletableFuture<TagLookup<Block>> blockTags, @Nullable ExistingFileHelper helper) {
        super(output, registries, blockTags, AncientAether.MODID, helper);
    }

    @Override
    public void addTags(HolderLookup.@NotNull Provider provider) {
        copy(AncientAetherTags.Blocks.HIGHSPROOT_LOGS, AncientAetherTags.Items.HIGHSPROOT_LOGS);
        copy(AncientAetherTags.Blocks.SAKURA_LOGS, AncientAetherTags.Items.SAKURA_LOGS);
        copy(AncientAetherTags.Blocks.MOSAIC_BLOCKS, AncientAetherTags.Items.MOSAIC_BLOCKS);
        copy(AncientAetherTags.Blocks.AEROGETIC_BLOCKS, AncientAetherTags.Items.AEROGETIC_BLOCKS);
        copy(AncientAetherTags.Blocks.VASES, AncientAetherTags.Items.VASES);

        tag(AncientAetherTags.Items.WINDBLOWER_INGREDIENTS).add(
                AetherBlocks.BLUE_AERCLOUD.get().asItem(),
                AncientAetherBlocks.VIOLET_AERCLOUD.get().asItem()
        );
        tag(AncientAetherTags.Items.VALKYRUM_REPAIRING).add(
                AncientAetherItems.VALKYRUM.get()
        );
        tag(AncientAetherTags.Items.ARKENZUS_REPAIRING);
        tag(AncientAetherTags.Items.ANCIENT_REPAIRING);
        tag(AncientAetherTags.Items.FLUFFALO_TEMPTATION_ITEMS).add(
                AncientAetherBlocks.WYND_THISTLE.get().asItem()
        );
        tag(AncientAetherTags.Items.COMMON_LOOT).add(
                AetherItems.HAMMER_OF_KINGBDOGZ.get(),
                AetherItems.LIGHTNING_KNIFE.get(),
                AetherItems.BLUE_GUMMY_SWET.get(),
                AetherItems.GOLDEN_GUMMY_SWET.get(),
                AetherItems.AGILITY_CAPE.get(),
                AetherItems.SWET_CAPE.get(),
                AetherItems.CLOUD_STAFF.get(),
                AncientAetherItems.FESTIVE_GUMMY_SWET.get(),
                AncientAetherItems.HERMES_RING.get(),
                AncientAetherItems.HERMES_PENDANT.get()
        );
        tag(AncientAetherTags.Items.RARE_LOOT).add(
                AetherItems.FLAMING_SWORD.get(),
                AetherItems.LIGHTNING_SWORD.get(),
                AetherItems.HOLY_SWORD.get(),
                AetherItems.CANDY_CANE_SWORD.get(),
                AetherItems.PHOENIX_BOW.get(),
                AetherItems.NEPTUNE_CHESTPLATE.get(),
                AetherItems.NEPTUNE_LEGGINGS.get(),
                AetherItems.NEPTUNE_BOOTS.get(),
                AetherItems.NEPTUNE_GLOVES.get(),
                AetherItems.SENTRY_BOOTS.get(),
                AetherItems.VALKYRIE_CAPE.get(),
                AetherItems.GOLDEN_FEATHER.get(),
                AetherItems.IRON_BUBBLE.get(),
                AetherItems.SHIELD_OF_REPULSION.get(),
                AncientAetherItems.AERONAUTIC_DART_SHOOTER.get(),
                AncientAetherItems.ANCIENT_RING.get(),
                AncientAetherItems.ARKENIUM_PENDANT.get(),
                AncientAetherItems.WYND_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.WHALE_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.ASCENDED_ARMOR_TRIM_SMITHING_TEMPLATE.get()
        );
        tag(AncientAetherTags.Items.EPIC_LOOT).add(
                AetherItems.VAMPIRE_BLADE.get(),
                AetherItems.PIG_SLAYER.get(),
                AetherItems.PHOENIX_HELMET.get(),
                AetherItems.PHOENIX_CHESTPLATE.get(),
                AetherItems.PHOENIX_LEGGINGS.get(),
                AetherItems.PHOENIX_BOOTS.get(),
                AetherItems.PHOENIX_GLOVES.get(),
                AetherItems.INVISIBILITY_CLOAK.get(),
                AetherItems.REGENERATION_STONE.get(),
                AncientAetherItems.ARKENZUS_PICKAXE.get(),
                AncientAetherItems.HEALTH_RING.get(),
                AncientAetherItems.HEALTH_PENDANT.get(),
                AncientAetherItems.ANCIENT_RING.get(),
                AncientAetherItems.ANCIENT_PENDANT.get(),
                AncientAetherItems.STRENGTH_STONE.get(),
                AncientAetherItems.SHIELD_OF_INEBRIATION.get(),
                AncientAetherItems.SHIELD_OF_REMEDIATION.get(),
                AncientAetherItems.MYSTERIOUS_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.MECHANICAL_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.MOSAIC_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.ROYAL_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.SOLAR_ARMOR_TRIM_SMITHING_TEMPLATE.get(),
                AncientAetherItems.ANCIENT_ARMOR_TRIM_SMITHING_TEMPLATE.get()
        );
        tag(AncientAetherTags.Items.MYTHIC_LOOT).add(
                AetherItems.OBSIDIAN_HELMET.get(),
                AetherItems.OBSIDIAN_CHESTPLATE.get(),
                AetherItems.OBSIDIAN_LEGGINGS.get(),
                AetherItems.OBSIDIAN_BOOTS.get(),
                AetherItems.OBSIDIAN_GLOVES.get(),
                AetherItems.LIFE_SHARD.get(),
                AncientAetherItems.ANCIENT_SWORD.get()
        );

        tag(AetherTags.Items.AERCLOUDS).add(
                AncientAetherBlocks.VIOLET_AERCLOUD.get().asItem()
        );
        tag(AetherTags.Items.LOCKED_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.LOCKED_CARVED_TILES.get().asItem(),
                AncientAetherBlocks.LOCKED_WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.LOCKED_AEROGETIC_STONE.get().asItem(),
                AncientAetherBlocks.LOCKED_AERONAUTIC_STONE.get().asItem(),
                AncientAetherBlocks.LOCKED_CORRUPTED_AERONAUTIC_STONE.get().asItem()
        );
        tag(AetherTags.Items.TRAPPED_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.TRAPPED_CARVED_TILES.get().asItem(),
                AncientAetherBlocks.TRAPPED_AEROGETIC_STONE.get().asItem(),
                AncientAetherBlocks.TRAPPED_AERONAUTIC_STONE.get().asItem(),
                AncientAetherBlocks.TRAPPED_CORRUPTED_AERONAUTIC_STONE.get().asItem()
        );
        tag(AetherTags.Items.BOSS_DOORWAY_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.BOSS_DOORWAY_WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.BOSS_DOORWAY_AEROGETIC_STONE.get().asItem(),
                AncientAetherBlocks.BOSS_DOORWAY_AERONAUTIC_STONE.get().asItem(),
                AncientAetherBlocks.BOSS_DOORWAY_CORRUPTED_AERONAUTIC_STONE.get().asItem()
        );
        tag(AetherTags.Items.TREASURE_DOORWAY_DUNGEON_BLOCKS).add(
                AncientAetherBlocks.TREASURE_DOORWAY_WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.TREASURE_DOORWAY_AEROGETIC_STONE.get().asItem(),
                AncientAetherBlocks.TREASURE_DOORWAY_AERONAUTIC_STONE.get().asItem(),
                AncientAetherBlocks.TREASURE_DOORWAY_CORRUPTED_AERONAUTIC_STONE.get().asItem()
        );
        tag(AetherTags.Items.DUNGEON_BLOCKS).add(
                AncientAetherBlocks.CARVED_TILES.get().asItem(),
                AncientAetherBlocks.WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.AEROGETIC_STONE.get().asItem(),
                AncientAetherBlocks.AERONAUTIC_STONE.get().asItem(),
                AncientAetherBlocks.CORRUPTED_AERONAUTIC_STONE.get().asItem()
        );
        tag(AetherTags.Items.SENTRY_BLOCKS).add(
                AncientAetherBlocks.CARVED_TILES.get().asItem(),
                AncientAetherBlocks.CARVED_TILE_STAIRS.get().asItem(),
                AncientAetherBlocks.CARVED_TILE_SLAB.get().asItem(),
                AncientAetherBlocks.CARVED_TILE_WALL.get().asItem(),
                AncientAetherBlocks.LOCKED_CARVED_TILES.get().asItem(),
                AncientAetherBlocks.TRAPPED_CARVED_TILES.get().asItem(),
                AncientAetherBlocks.CARVED_STONE_MOSAIC.get().asItem(),
                AncientAetherBlocks.LOCKED_CARVED_STONE_MOSAIC.get().asItem(),
                AncientAetherBlocks.WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.LOCKED_WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.BOSS_DOORWAY_WYND_SENTRY_STONE.get().asItem(),
                AncientAetherBlocks.TREASURE_DOORWAY_WYND_SENTRY_STONE.get().asItem()
        );
        tag(AetherTags.Items.ANGELIC_BLOCKS).add(
                AncientAetherBlocks.ANGELIC_STONE_MOSAIC.get().asItem(),
                AncientAetherBlocks.LOCKED_ANGELIC_STONE_MOSAIC.get().asItem()
        );
        tag(AetherTags.Items.HELLFIRE_BLOCKS).add(
                AncientAetherBlocks.HELLFIRE_STONE_MOSAIC.get().asItem(),
                AncientAetherBlocks.LOCKED_HELLFIRE_STONE_MOSAIC.get().asItem()
        );
        tag(AetherTags.Items.PLANKS_CRAFTING).add(
                AncientAetherBlocks.HIGHSPROOT_PLANKS.get().asItem(),
                AncientAetherBlocks.SAKURA_PLANKS.get().asItem()
        );
        tag(AetherTags.Items.SKYROOT_STICK_CRAFTING).add(
                AncientAetherBlocks.HIGHSPROOT_PLANKS.get().asItem(),
                AncientAetherBlocks.SAKURA_PLANKS.get().asItem()
        );
        tag(AetherTags.Items.SKYROOT_TOOL_CRAFTING).add(
                AncientAetherBlocks.HIGHSPROOT_PLANKS.get().asItem(),
                AncientAetherBlocks.SAKURA_PLANKS.get().asItem()
        );
        tag(AetherTags.Items.DART_SHOOTERS).add(
                AncientAetherItems.AERONAUTIC_DART_SHOOTER.get()
        );
        tag(AetherTags.Items.DUNGEON_KEYS).add(
                AncientAetherItems.LABORATORY_DUNGEON_KEY.get(),
                AncientAetherItems.ANCIENT_DUNGEON_KEY.get()
        );
        tag(AetherTags.Items.MOA_EGGS).add(
                AncientAetherItems.TURQUOISE_MOA_EGG.get(),
                AncientAetherItems.TEAL_MOA_EGG.get(),
                AncientAetherItems.SKY_BLUE_MOA_EGG.get(),
                AncientAetherItems.LAVENDER_MOA_EGG.get(),
                AncientAetherItems.SAKURA_MOA_EGG.get(),
                AncientAetherItems.VIOLET_MOA_EGG.get(),
                AncientAetherItems.BURGUNDY_MOA_EGG.get()
        );
        tag(AetherTags.Items.BRONZE_DUNGEON_LOOT).replace();
        tag(AetherTags.Items.SILVER_DUNGEON_LOOT).replace();
        tag(AetherTags.Items.GOLD_DUNGEON_LOOT).replace();
        tag(AetherTags.Items.PHYG_TEMPTATION_ITEMS).add(
                AncientAetherItems.GRAPES.get()
        );
        tag(AetherTags.Items.FLYING_COW_TEMPTATION_ITEMS).add(
                AncientAetherItems.GRAPES.get()
        );
        tag(AetherTags.Items.SHEEPUFF_TEMPTATION_ITEMS).add(
                AncientAetherItems.GRAPES.get()
        );
        tag(AetherTags.Items.AERBUNNY_TEMPTATION_ITEMS).add(
                AncientAetherItems.GRAPES.get()
        );
        tag(AetherTags.Items.SKYROOT_REPAIRING).add(
                AncientAetherBlocks.HIGHSPROOT_PLANKS.get().asItem(),
                AncientAetherBlocks.SAKURA_PLANKS.get().asItem()
        );
        tag(AetherTags.Items.TOOLS_LANCES).add(
                AncientAetherItems.VALKYRUM_LANCE.get()
        );
        tag(AetherTags.Items.ACCESSORIES_RINGS).add(
                AncientAetherItems.VALKYRUM_RING.get(),
                AncientAetherItems.HERMES_RING.get(),
                AncientAetherItems.ARKENIUM_RING.get(),
                AncientAetherItems.HEALTH_RING.get(),
                AncientAetherItems.ANCIENT_RING.get()
        );
        tag(AetherTags.Items.ACCESSORIES_PENDANTS).add(
                AncientAetherItems.VALKYRUM_PENDANT.get(),
                AncientAetherItems.HERMES_PENDANT.get(),
                AncientAetherItems.ARKENIUM_PENDANT.get(),
                AncientAetherItems.HEALTH_PENDANT.get(),
                AncientAetherItems.ANCIENT_PENDANT.get()
        );
        tag(AetherTags.Items.ACCESSORIES_GLOVES).add(
                AncientAetherItems.VALKYRUM_GLOVES.get()
        );
        tag(AetherTags.Items.ACCESSORIES_CAPES).add(
                AncientAetherItems.PINK_CAPE.get()
        );
        tag(AetherTags.Items.ACCESSORIES_MISCELLANEOUS).add(
                AncientAetherItems.STRENGTH_STONE.get()
        );
        tag(AetherTags.Items.ACCESSORIES_SHIELDS).add(
                AncientAetherItems.SHIELD_OF_INEBRIATION.get(),
                AncientAetherItems.SHIELD_OF_REMEDIATION.get()
        );

        tag(Tags.Items.BOOKSHELVES).add(
                AncientAetherBlocks.HIGHSPROOT_BOOKSHELF.get().asItem(),
                AncientAetherBlocks.SAKURA_BOOKSHELF.get().asItem()
        );
        tag(Tags.Items.FENCE_GATES).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get().asItem(),
                AncientAetherBlocks.SAKURA_FENCE_GATE.get().asItem()
        );
        tag(Tags.Items.FENCE_GATES_WOODEN).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE_GATE.get().asItem(),
                AncientAetherBlocks.SAKURA_FENCE_GATE.get().asItem()
        );
        tag(Tags.Items.FENCES).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE.get().asItem(),
                AncientAetherBlocks.SAKURA_FENCE.get().asItem()
        );
        tag(Tags.Items.FENCES_WOODEN).add(
                AncientAetherBlocks.HIGHSPROOT_FENCE.get().asItem(),
                AncientAetherBlocks.SAKURA_FENCE.get().asItem()
        );
        tag(Tags.Items.GLASS).add(
                AncientAetherBlocks.AEROGEL_GLASS.get().asItem()
        );
        tag(Tags.Items.GLASS_COLORLESS).add(
                AncientAetherBlocks.AEROGEL_GLASS.get().asItem()
        );
        tag(Tags.Items.GLASS_PANES).add(
                AncientAetherBlocks.AEROGEL_GLASS_PANE.get().asItem()
        );
        tag(Tags.Items.GLASS_PANES_COLORLESS).add(
                AncientAetherBlocks.AEROGEL_GLASS_PANE.get().asItem()
        );
        tag(Tags.Items.ORE_RATES_SINGULAR).add(
                AncientAetherBlocks.AETHER_QUARTZ_ORE.get().asItem(),
                AncientAetherBlocks.VALKYRUM_ORE.get().asItem()
        );
        tag(Tags.Items.ORES).add(
                AncientAetherBlocks.AETHER_QUARTZ_ORE.get().asItem(),
                AncientAetherBlocks.VALKYRUM_ORE.get().asItem()
        );
        tag(Tags.Items.STORAGE_BLOCKS).add(
                AncientAetherBlocks.VALKYRUM_BLOCK.get().asItem()
        );
        tag(Tags.Items.ARMORS_HELMETS).add(
                AncientAetherItems.VALKYRUM_HELMET.get()
        );
        tag(Tags.Items.ARMORS_CHESTPLATES).add(
                AncientAetherItems.VALKYRUM_CHESTPLATE.get()
        );
        tag(Tags.Items.ARMORS_LEGGINGS).add(
                AncientAetherItems.VALKYRUM_LEGGINGS.get()
        );
        tag(Tags.Items.ARMORS_BOOTS).add(
                AncientAetherItems.VALKYRUM_BOOTS.get()
        );
    }
}