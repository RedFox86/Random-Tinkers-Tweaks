package net.redfox.randomtinkerstweaks.event;

import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.redfox.randomtinkerstweaks.RandomTinkersTweaks;
import net.redfox.randomtinkerstweaks.block.ModBlockEntities;
import slimeknights.tconstruct.smeltery.client.render.TankBlockEntityRenderer;

@Mod.EventBusSubscriber(
    modid = RandomTinkersTweaks.MOD_ID,
    value = Dist.CLIENT,
    bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEvents {
  @SubscribeEvent
  static void registerRenderers(EntityRenderersEvent.RegisterRenderers event) {
    event.registerBlockEntityRenderer(
        ModBlockEntities.SEARED_ALLOYER_BLOCK_ENTITY_TYPE.get(), TankBlockEntityRenderer::new);
  }
}
