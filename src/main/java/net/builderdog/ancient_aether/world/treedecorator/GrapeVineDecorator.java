package net.builderdog.ancient_aether.world.treedecorator;

import com.mojang.serialization.Codec;
import net.builderdog.ancient_aether.block.natural.GrapeVineBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.util.RandomSource;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecorator;
import net.minecraft.world.level.levelgen.feature.treedecorators.TreeDecoratorType;
import org.jetbrains.annotations.NotNull;

public class GrapeVineDecorator extends TreeDecorator {
    public static final Codec<GrapeVineDecorator> CODEC =
            BlockState.CODEC.fieldOf("block").xmap(GrapeVineDecorator::new, (instance) -> instance.state).codec();

    private final BlockState state;

    public GrapeVineDecorator(BlockState state) {
        this.state = state;
    }

    protected @NotNull TreeDecoratorType<?> type() {
        return AncientAetherTreeDecoratorTypes.GRAPE_VINE_DECORATOR.get();
    }

    public void placeGrapeVine(Context context, BlockPos pos, BlockState state) {
        context.setBlock(pos, state);
    }

    public void place(Context context) {
        RandomSource random = context.random();
        int age = random.nextIntBetweenInclusive(1, 3);

        context.logs().forEach((pos) -> {
            if (random.nextInt(3) > 0) {
                BlockPos pos1 = pos.north();
                if (context.isAir(pos1)) {
                    placeGrapeVine(context, pos1, state.setValue(GrapeVineBlock.FACING, Direction.NORTH).setValue(GrapeVineBlock.AGE, age));
                }
            }
            if (random.nextInt(3) > 0) {
                BlockPos pos2 = pos.east();
                if (context.isAir(pos2)) {
                    placeGrapeVine(context, pos2, state.setValue(GrapeVineBlock.FACING, Direction.EAST).setValue(GrapeVineBlock.AGE, age));
                }
            }
            if (random.nextInt(3) > 0) {
                BlockPos pos3 = pos.south();
                if (context.isAir(pos3)) {
                    placeGrapeVine(context, pos3, state.setValue(GrapeVineBlock.FACING, Direction.SOUTH).setValue(GrapeVineBlock.AGE, age));
                }
            }
            if (random.nextInt(3) > 0) {
                BlockPos pos4 = pos.west();
                if (context.isAir(pos4)) {
                    placeGrapeVine(context, pos4, state.setValue(GrapeVineBlock.FACING, Direction.WEST).setValue(GrapeVineBlock.AGE, age));
                }
            }
        });
    }
}