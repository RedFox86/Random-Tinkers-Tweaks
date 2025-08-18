package net.redfox.randomtinkerstweaks.block;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redfox.randomtinkerstweaks.RandomTinkersTweaks;
import net.redfox.randomtinkerstweaks.block.custom.SearedAlloyerBlockEntity;

public class ModBlockEntities {
  public static final DeferredRegister<BlockEntityType<?>> BLOCK_ENTITIES =
      DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RandomTinkersTweaks.MOD_ID);

  public static final RegistryObject<BlockEntityType<SearedAlloyerBlockEntity>>
      SEARED_ALLOYER_BLOCK_ENTITY_TYPE =
          BLOCK_ENTITIES.register(
              "seared_alloyer_block_entity",
              () ->
                  BlockEntityType.Builder.of(
                          SearedAlloyerBlockEntity::new, ModBlocks.SEARED_ALLOYER.get())
                      .build(null));

  public static void register(IEventBus eventBus) {
    BLOCK_ENTITIES.register(eventBus);
  }
}
