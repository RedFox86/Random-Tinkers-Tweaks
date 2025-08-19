package net.redfox.randomtinkerstweaks.block;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.NoteBlockInstrument;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redfox.randomtinkerstweaks.RandomTinkersTweaks;
import net.redfox.randomtinkerstweaks.block.custom.SearedAlloyerBlock;
import net.redfox.randomtinkerstweaks.item.ModItems;
import slimeknights.tconstruct.smeltery.block.component.SearedBlock;

public class ModBlocks {
  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, RandomTinkersTweaks.MOD_ID);

  public static final RegistryObject<Block> SEARED_ALLOYER =
      registerBlock(
          "seared_alloyer",
          () ->
              new SearedAlloyerBlock(
                  BlockBehaviour.Properties.of()
                      .mapColor(MapColor.COLOR_GRAY)
                      .sound(SoundType.METAL)
                      .instrument(NoteBlockInstrument.BASEDRUM)
                      .requiresCorrectToolForDrops()
                      .strength(3.0F, 9.0F)
                      .isValidSpawn(
                          (s, r, p, e) ->
                              !s.hasProperty(SearedBlock.IN_STRUCTURE)
                                  || !(Boolean) s.getValue(SearedBlock.IN_STRUCTURE))));

  public static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
    RegistryObject<T> toReturn = BLOCKS.register(name, block);
    registerBlockItem(name, toReturn);
    return toReturn;
  }

  private static <T extends Block> RegistryObject<Item> registerBlockItem(
      String name, RegistryObject<T> block) {
    return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
  }

  public static void register(IEventBus eventBus) {
    BLOCKS.register(eventBus);
  }
}
