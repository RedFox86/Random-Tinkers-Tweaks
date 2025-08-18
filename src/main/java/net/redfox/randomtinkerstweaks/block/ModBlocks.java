package net.redfox.randomtinkerstweaks.block;

import java.util.function.Supplier;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redfox.randomtinkerstweaks.RandomTinkersTweaks;
import net.redfox.randomtinkerstweaks.block.custom.SearedAlloyerBlock;
import net.redfox.randomtinkerstweaks.item.ModItems;
import slimeknights.tconstruct.smeltery.TinkerSmeltery;

public class ModBlocks {
  public static final DeferredRegister<Block> BLOCKS =
      DeferredRegister.create(ForgeRegistries.BLOCKS, RandomTinkersTweaks.MOD_ID);

  public static final RegistryObject<Block> SEARED_ALLOYER =
      registerBlock(
          "seared_alloyer",
          () ->
              new SearedAlloyerBlock(
                  BlockBehaviour.Properties.copy(TinkerSmeltery.scorchedAlloyer.get())));

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
