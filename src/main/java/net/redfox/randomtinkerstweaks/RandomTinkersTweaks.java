package net.redfox.randomtinkerstweaks;

import com.mojang.logging.LogUtils;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.redfox.randomtinkerstweaks.block.ModBlockEntities;
import net.redfox.randomtinkerstweaks.block.ModBlocks;
import net.redfox.randomtinkerstweaks.item.ModCreativeTabs;
import net.redfox.randomtinkerstweaks.item.ModItems;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(RandomTinkersTweaks.MOD_ID)
public class RandomTinkersTweaks {
  // Define mod id in a common place for everything to reference
  public static final String MOD_ID = "randomtinkerstweaks";
  // Directly reference a slf4j logger
  private static final Logger LOGGER = LogUtils.getLogger();

  public RandomTinkersTweaks(FMLJavaModLoadingContext context) {
    IEventBus modEventBus = context.getModEventBus();
    MinecraftForge.EVENT_BUS.register(this);

    ModCreativeTabs.register(modEventBus);
    ModItems.register(modEventBus);
    ModBlocks.register(modEventBus);
    ModBlockEntities.register(modEventBus);
  }
}
