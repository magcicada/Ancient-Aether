package net.builderdog.ancient_aether.item;

import com.aetherteam.aether.block.natural.BlueAercloudBlock;
import com.aetherteam.aether_genesis.client.GenesisSoundEvents;
import net.builderdog.ancient_aether.block.AncientAetherBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.projectile.EyeOfEnder;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;

public class EnchantedSentryRuneItem extends Item {
    public EnchantedSentryRuneItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level level = context.getLevel();
        BlockPos pos = context.getClickedPos();
        ItemStack item = context.getItemInHand();
        BlockState state = level.getBlockState(pos);
        Player player = context.getPlayer();

        if (state.getBlock() == AncientAetherBlocks.BROKEN_ENCHANTED_OBELISK.get()) {
            if (player != null && !level.isClientSide) {
                level.setBlockAndUpdate(pos, AncientAetherBlocks.ENCHANTED_OBELISK.get().defaultBlockState());
                player.awardStat(Stats.ITEM_USED.get(item.getItem()));
                item.shrink(1);
            }
            level.playSound(player, pos, GenesisSoundEvents.BLUE_AERCLOUD_BOUNCE.get(), SoundSource.BLOCKS, 0.8f,
                    0.5f + (((float)(Math.pow(level.random.nextDouble(), 2.5))) * 0.5f));
            return InteractionResult.sidedSuccess(level.isClientSide);
        }
        else {
            return InteractionResult.PASS;
        }
    }
}