package net.guramee.justforfun.block.custom;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalFacingBlock;
import net.minecraft.block.ShapeContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemPlacementContext;
import net.minecraft.item.ItemStack;
import net.minecraft.state.StateManager;
import net.minecraft.state.property.DirectionProperty;
import net.minecraft.state.property.Properties;
import net.minecraft.text.Text;
import net.minecraft.util.BlockMirror;
import net.minecraft.util.BlockRotation;
import net.minecraft.util.Formatting;
import net.minecraft.util.function.BooleanBiFunction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.shape.VoxelShape;
import net.minecraft.util.shape.VoxelShapes;
import net.minecraft.world.BlockView;
import org.jetbrains.annotations.Nullable;

import java.util.List;
import java.util.stream.Stream;

public class TesseractBlock extends HorizontalFacingBlock {
    public static final DirectionProperty FACING = Properties.HORIZONTAL_FACING;

    public TesseractBlock(Settings settings) {
        super(settings);
    }

    private static VoxelShape SHAPE =
            Stream.of(
                    Block.createCuboidShape(1, 15, 0, 15, 16, 1),
                    Block.createCuboidShape(1, 15, 15, 16, 16, 16),
                    Block.createCuboidShape(15, 0, 0, 16, 1, 16),
                    Block.createCuboidShape(1, 0, 0, 15, 1, 1),
                    Block.createCuboidShape(1, 0, 15, 15, 1, 16),
                    Block.createCuboidShape(0, 0, 0, 1, 1, 16),
                    Block.createCuboidShape(0, 15, 0, 1, 16, 16),
                    Block.createCuboidShape(15, 15, 0, 16, 16, 15),
                    Block.createCuboidShape(15, 1, 15, 16, 15, 16),
                    Block.createCuboidShape(0, 1, 15, 1, 15, 16),
                    Block.createCuboidShape(0, 1, 0, 1, 15, 1),
                    Block.createCuboidShape(15, 1, 0, 16, 15, 1),
                    Block.createCuboidShape(1, 14, 1, 2, 15, 2),
                    Block.createCuboidShape(14, 14, 1, 15, 15, 2),
                    Block.createCuboidShape(14, 14, 14, 15, 15, 15),
                    Block.createCuboidShape(1, 14, 14, 2, 15, 15),
                    Block.createCuboidShape(1, 1, 1, 2, 2, 2),
                    Block.createCuboidShape(14, 1, 1, 15, 2, 2),
                    Block.createCuboidShape(14, 1, 14, 15, 2, 15),
                    Block.createCuboidShape(1, 1, 14, 2, 2, 15),
                    Block.createCuboidShape(2, 2, 13, 3, 3, 14),
                    Block.createCuboidShape(13, 2, 13, 14, 3, 14),
                    Block.createCuboidShape(13, 2, 2, 14, 3, 3),
                    Block.createCuboidShape(2, 2, 2, 3, 3, 3),
                    Block.createCuboidShape(2, 13, 2, 3, 14, 3),
                    Block.createCuboidShape(13, 13, 2, 14, 14, 3),
                    Block.createCuboidShape(13, 13, 13, 14, 14, 14),
                    Block.createCuboidShape(2, 13, 13, 3, 14, 14),
                    Block.createCuboidShape(3, 12, 3, 4, 13, 4),
                    Block.createCuboidShape(12, 12, 3, 13, 13, 4),
                    Block.createCuboidShape(12, 12, 12, 13, 13, 13),
                    Block.createCuboidShape(3, 12, 12, 4, 13, 13),
                    Block.createCuboidShape(3, 3, 12, 4, 4, 13),
                    Block.createCuboidShape(3, 3, 3, 4, 4, 4),
                    Block.createCuboidShape(12, 3, 3, 13, 4, 4),
                    Block.createCuboidShape(12, 3, 12, 13, 4, 13),
                    Block.createCuboidShape(4, 4, 11, 5, 5, 12),
                    Block.createCuboidShape(4, 4, 4, 5, 5, 5),
                    Block.createCuboidShape(11, 4, 4, 12, 5, 5),
                    Block.createCuboidShape(11, 4, 11, 12, 5, 12),
                    Block.createCuboidShape(4, 11, 11, 5, 12, 12),
                    Block.createCuboidShape(11, 11, 4, 12, 12, 5),
                    Block.createCuboidShape(11, 11, 11, 12, 12, 12),
                    Block.createCuboidShape(4, 11, 4, 5, 12, 5),
                    Block.createCuboidShape(5, 5, 10, 11, 6, 11),
                    Block.createCuboidShape(10, 10, 6, 11, 11, 10),
                    Block.createCuboidShape(5, 10, 6, 6, 11, 10),
                    Block.createCuboidShape(5, 5, 6, 6, 6, 10),
                    Block.createCuboidShape(10, 5, 6, 11, 6, 10),
                    Block.createCuboidShape(5, 5, 5, 11, 6, 6),
                    Block.createCuboidShape(5, 10, 5, 11, 11, 6),
                    Block.createCuboidShape(5, 10, 10, 11, 11, 11),
                    Block.createCuboidShape(5, 6, 10, 6, 10, 11),
                    Block.createCuboidShape(10, 6, 10, 11, 10, 11),
                    Block.createCuboidShape(10, 6, 5, 11, 10, 6),
                    Block.createCuboidShape(5, 6, 5, 6, 10, 6)
            ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, BooleanBiFunction.OR)).get();

    public VoxelShape getOutlineShape(BlockState state, BlockView world, BlockPos pos, ShapeContext context) {
        return SHAPE;
    }

    @Nullable
    @Override
    public BlockState getPlacementState(ItemPlacementContext ctx) {
        return this.getDefaultState().with(FACING, ctx.getPlayerFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, BlockRotation rotation) {
        return state.with(FACING, rotation.rotate(state.get(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, BlockMirror mirror) {
        return state.rotate(mirror.getRotation(state.get(FACING)));
    }

    @Override
    protected void appendProperties(StateManager.Builder<Block, BlockState> builder) {
        builder.add(FACING);
    }

    @Override
    public void appendTooltip(ItemStack stack, @Nullable BlockView world, List<Text> tooltip, TooltipContext options) {
        if (Screen.hasShiftDown()) {
            tooltip.add(Text.literal("WARNING! Heavy processor block due to complex VoxelShape!").formatted(Formatting.RED).formatted(Formatting.UNDERLINE));
        }   else {
            tooltip.add(Text.literal("Press shift for more info").formatted(Formatting.DARK_GRAY));
        }
        super.appendTooltip(stack, world, tooltip, options);
    }
}
