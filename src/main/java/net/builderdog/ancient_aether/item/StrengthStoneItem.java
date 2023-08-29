package net.builderdog.ancient_aether.item;

import com.aetherteam.aether.item.accessories.AccessoryItem;
import com.aetherteam.aether.item.accessories.cape.CapeItem;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.ItemStack;
import top.theillusivec4.curios.api.SlotContext;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.common.ForgeMod;
import top.theillusivec4.curios.api.SlotContext;

import java.util.UUID;

public class StrengthStoneItem extends AccessoryItem {
    /**
     * The unique identifier for the item's step height modifier.
     */
    private static final UUID DAMAGE_UUID = UUID.fromString("AC022E1C-E2D5-4A0B-9562-55C75FE53A1E");

    public StrengthStoneItem(Properties properties) {
        super(properties);
    }

    /**
     * Applies a step height modifier to the wearer as long as they aren't holding shift. If they are, the modifier is removed until they stop holding shift.
     * @param slotContext The {@link SlotContext} of the Curio.
     * @param stack The Curio {@link ItemStack}.
     */
    @Override
    public void curioTick(SlotContext slotContext, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();
        AttributeInstance damage = livingEntity.getAttribute(Attributes.ATTACK_DAMAGE);
        if (damage != null) {
            if (!damage.hasModifier(getdamageModifier())) {
                damage.addTransientModifier(getdamageModifier());
            }
        }
    }

    /**
     * Removes the step height modifier when the Agility Cape is unequipped.
     * @param slotContext The {@link SlotContext} of the Curio.
     * @param newStack The new {@link ItemStack} in the slot.
     * @param stack The {@link ItemStack} of the Curio.
     */
    @Override
    public void onUnequip(SlotContext slotContext, ItemStack newStack, ItemStack stack) {
        LivingEntity livingEntity = slotContext.entity();
        AttributeInstance stepHeight = livingEntity.getAttribute(ForgeMod.STEP_HEIGHT_ADDITION.get());
        if (stepHeight != null) {
            if (stepHeight.hasModifier(getdamageModifier())) {
                stepHeight.removeModifier(getdamageModifier());
            }
        }
    }

    /**
     * @return The step height {@link AttributeModifier}. The default step height is 0.5, so this is an additional 0.5 to give the wearer a full block of step height.
     */
    public AttributeModifier getdamageModifier() {
        return new AttributeModifier(DAMAGE_UUID, "Attack Damage increase", 1.3, AttributeModifier.Operation.MULTIPLY_BASE);
    }
}
