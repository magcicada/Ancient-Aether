package net.builderdog.ancient_aether.event.hooks;

import com.aetherteam.aether.effect.AetherEffects;
import com.aetherteam.aether.item.AetherItems;
import net.builderdog.ancient_aether.client.AncientSoundEvents;
import net.builderdog.ancient_aether.entity.passive.Fluffalo;
import net.builderdog.ancient_aether.item.AncientEquipmentUtil;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.ItemUtils;

public class EntityHooks {

    public static void skyrootBucketMilking(Entity target, Player player, InteractionHand hand) {
        if ((target instanceof Fluffalo) && !((Animal) target).isBaby()) {
            ItemStack heldStack = player.getItemInHand(hand);
            if (heldStack.is(AetherItems.SKYROOT_BUCKET.get())) {
                player.playSound(AncientSoundEvents.ENTITY_FLUFFALO_MILK.get(), 1.0F, 1.0F);
                ItemStack filledBucket = ItemUtils.createFilledResult(heldStack, player, AetherItems.SKYROOT_MILK_BUCKET.get().getDefaultInstance());
                player.swing(hand);
                player.setItemInHand(hand, filledBucket);
            }
        }
    }

    public static void shieldOfInebriationAbility(LivingEntity player, LivingEntity attacker) {
        if (AncientEquipmentUtil.hasShieldOfInebriation(player)) {
            if (!(attacker == null)) {
                if (RandomSource.create().nextInt(1) == 0) {
                    attacker.addEffect(new MobEffectInstance(AetherEffects.INEBRIATION.get(), 200, 0, false, false, true));
                }
            }
        }
    }
}