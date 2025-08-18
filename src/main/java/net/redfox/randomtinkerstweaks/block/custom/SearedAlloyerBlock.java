package net.redfox.randomtinkerstweaks.block.custom;

import java.util.List;
import net.minecraft.ChatFormatting;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.util.RandomSource;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.entity.BlockEntityTicker;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.redfox.randomtinkerstweaks.block.ModBlockEntities;
import org.jetbrains.annotations.Nullable;
import slimeknights.mantle.util.BlockEntityHelper;
import slimeknights.tconstruct.smeltery.block.controller.AlloyerBlock;

public class SearedAlloyerBlock extends AlloyerBlock {
  public SearedAlloyerBlock(Properties builder) {
    super(builder);
  }

  @Override
  public BlockEntity newBlockEntity(BlockPos pPos, BlockState pState) {
    return new SearedAlloyerBlockEntity(pPos, pState);
  }

  @Override
  public <T extends BlockEntity> BlockEntityTicker<T> getTicker(
      Level pLevel, BlockState pState, BlockEntityType<T> wanted) {
    return pLevel.isClientSide
        ? null
        : BlockEntityHelper.castTicker(
            wanted,
            ModBlockEntities.SEARED_ALLOYER_BLOCK_ENTITY_TYPE.get(),
            SearedAlloyerBlockEntity.SERVER_TICKER);
  }

  @Override
  public void animateTick(BlockState state, Level world, BlockPos pos, RandomSource rand) {
    if (state.getValue(ACTIVE)) {
      double x = pos.getX() + 0.5;
      double y = pos.getY() + (rand.nextFloat() * 4.0 / 16.0);
      double z = pos.getZ() + 0.5;
      double frontOffset = 0.52;
      double sideOffset = rand.nextDouble() * 0.6 - 0.3;
      this.spawnFireParticles(world, state, x, y, z, frontOffset, sideOffset, ParticleTypes.FLAME);
    }
  }

  @Override
  public void appendHoverText(
      ItemStack pStack, @Nullable BlockGetter pLevel, List<Component> pTooltip, TooltipFlag pFlag) {
    pTooltip.add(
        Component.literal("Super simple alloying machine.")
            .withStyle(s -> s.withColor(ChatFormatting.GRAY)));
    pTooltip.add(
        Component.literal("Place above a tank or heater to fuel.")
            .withStyle(s -> s.withColor(ChatFormatting.GRAY)));
    super.appendHoverText(pStack, pLevel, pTooltip, pFlag);
  }
}
