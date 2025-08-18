package net.redfox.randomtinkerstweaks.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.redfox.randomtinkerstweaks.RandomTinkersTweaks;
import net.redfox.randomtinkerstweaks.block.ModBlocks;

public class ModCreativeTabs {
  public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
      DeferredRegister.create(Registries.CREATIVE_MODE_TAB, RandomTinkersTweaks.MOD_ID);

  public static final RegistryObject<CreativeModeTab> RANDOM_TINKERS_TWEAKS_TAB =
      CREATIVE_MODE_TABS.register(
          "randomtinkerstweaks_tab",
          () ->
              CreativeModeTab.builder()
                  .icon(() -> new ItemStack(ModBlocks.SEARED_ALLOYER.get()))
                  .title(
                      Component.translatable(
                          "creativetab.randomtinkerstweaks.randomtinkerstweaks_tab"))
                  .displayItems(
                      (pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.SEARED_ALLOYER.get());
                        pOutput.accept(ModItems.SHOVEL_HEAD_PART.get());
                        pOutput.accept(ModItems.GOLD_SHOVEL_HEAD_CAST.get());
                        pOutput.accept(ModItems.SAND_SHOVEL_HEAD_CAST.get());
                        pOutput.accept(ModItems.RED_SAND_SHOVEL_HEAD_CAST.get());
                        pOutput.accept(ModItems.SHOVEL_TOOL.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_NUGGET_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_INGOT_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_GEM_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_ROD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_REPAIR_KIT_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_PLATE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_GEAR_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_COIN_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_WIRE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_PICK_HEAD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_SMALL_AXE_HEAD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_SMALL_BLADE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_ADZE_HEAD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_SHOVEL_HEAD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_HAMMER_HEAD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_BROAD_BLADE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_BROAD_AXE_HEAD_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_LARGE_PLATE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_TOOL_BINDING_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_TOUGH_BINDING_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_TOOL_HANDLE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_TOUGH_HANDLE_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_BOW_LIMB_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_BOW_GRIP_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_HELMET_PLATING_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_CHESTPLATE_PLATING_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_LEGGINGS_PLATING_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_BOOTS_PLATING_CAST.get());
                        pOutput.accept(ModItems.ALUMINUM_BRASS_MAILLE_CAST.get());
                      })
                  .build());

  public static void register(IEventBus eventBus) {
    CREATIVE_MODE_TABS.register(eventBus);
  }
}
