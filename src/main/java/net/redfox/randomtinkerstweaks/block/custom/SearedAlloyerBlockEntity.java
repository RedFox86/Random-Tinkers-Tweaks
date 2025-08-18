package net.redfox.randomtinkerstweaks.block.custom;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.state.BlockState;
import net.redfox.randomtinkerstweaks.block.ModBlockEntities;
import slimeknights.tconstruct.smeltery.block.entity.controller.AlloyerBlockEntity;

public class SearedAlloyerBlockEntity extends AlloyerBlockEntity {
  public SearedAlloyerBlockEntity(BlockPos pos, BlockState state) {
    super(pos, state);
  }

  @Override
  public BlockEntityType<?> getType() {
    return ModBlockEntities.SEARED_ALLOYER_BLOCK_ENTITY_TYPE.get();
  }
}
