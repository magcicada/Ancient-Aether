package net.builderdog.ancient_aether.block;

import com.aetherteam.aether.block.AetherBlocks;
import net.builderdog.ancient_aether.client.AncientAetherSoundEvents;
import net.builderdog.ancient_aether.item.AncientAetherItems;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;

public class BrokenBlightedObeliskBlock extends Block {
    public BrokenBlightedObeliskBlock(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult use(BlockState blockstate, Level world, BlockPos pos, Player entity, InteractionHand hand, BlockHitResult hit) {
        super.use(blockstate, world, pos, entity, hand, hit);
        int x = pos.getX();
        int y = pos.getY();
        int z = pos.getZ();
        double hitX = hit.getLocation().x;
        double hitY = hit.getLocation().y;
        double hitZ = hit.getLocation().z;
        Level level = world;
        Player player = entity;

        if (player instanceof ServerPlayer _plr0 && _plr0.level instanceof ServerLevel
                && _plr0.getAdvancements().getOrStartProgress(_plr0.server.getAdvancements().getAdvancement(new ResourceLocation("aether:silver_dungeon"))).isDone()) {
            if ((player instanceof ServerPlayer _livEnt ? _livEnt.getMainHandItem() : ItemStack.EMPTY).getItem() == AncientAetherItems.BLIGHTED_SENTRY_RUNE.get()) {
                ItemStack stack = player.getMainHandItem();
                player.awardStat(Stats.ITEM_USED.get(stack.getItem()));
            stack.shrink(1);
                for (int x1 = Mth.floor(x - 30); x1 <= Mth.ceil(x + 30); x1++) {
                    for (int y1 = Mth.floor(y - 20); y1 <= Mth.ceil(y + 20); y1++) {
                        for (int z1 = Mth.floor(z - 30); z1 <= Mth.ceil(z + 30); z1++) {
                            BlockPos checkedPos = new BlockPos(x1, y1, z1);
                            BlockState checkedState = level.getBlockState(checkedPos);

                            if (checkedState.getBlock() == AetherBlocks.LOCKED_CARVED_STONE.get()) {
                                level.setBlockAndUpdate(checkedPos, AetherBlocks.CARVED_STONE.get().defaultBlockState());
                            }
                            if (checkedState.getBlock() == AncientAetherBlocks.LOCKED_CARVED_STONE_MOSAIC.get()) {
                                level.setBlockAndUpdate(checkedPos, AncientAetherBlocks.CARVED_STONE_MOSAIC.get().defaultBlockState());
                            }
                            if (checkedState.getBlock() == AncientAetherBlocks.LOCKED_BLIGHTED_SENTRY_STONE.get()) {
                                level.setBlockAndUpdate(checkedPos, AncientAetherBlocks.BLIGHTED_SENTRY_STONE.get().defaultBlockState());
                            }
                            if (checkedState.getBlock() == AetherBlocks.BOSS_DOORWAY_CARVED_STONE.get()) {
                                level.setBlockAndUpdate(checkedPos, Blocks.AIR.defaultBlockState());
                            }
                            if (checkedState.getBlock() == AncientAetherBlocks.BROKEN_BLIGHTED_OBELISK.get()) {
                                level.setBlockAndUpdate(checkedPos, AncientAetherBlocks.BLIGHTED_OBELISK.get().defaultBlockState());
                            }
                        }
                    }
                }
            }
        } else {
            if (player != null && !level.isClientSide) {
                player.displayClientMessage(Component.translatable("gui.ancient_aether.obelisk_valkyrie_queen").withStyle(ChatFormatting.RED), true);
            } else {
                level.playSound(player, pos, AncientAetherSoundEvents.OBELISK_ACTIVATION.get(), SoundSource.BLOCKS, 0.8f,
                        0.5f + (((float) (Math.pow(level.random.nextDouble(), 2.5))) * 0.5f));
                return InteractionResult.sidedSuccess(level.isClientSide);
            }
        }
        return InteractionResult.SUCCESS;
    }
}

