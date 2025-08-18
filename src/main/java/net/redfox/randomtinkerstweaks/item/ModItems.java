package net.redfox.randomtinkerstweaks.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.redfox.randomtinkerstweaks.RandomTinkersTweaks;
import slimeknights.tconstruct.library.tools.item.ModifiableItem;
import slimeknights.tconstruct.library.tools.part.MaterialItem;
import slimeknights.tconstruct.library.tools.part.PartCastItem;
import slimeknights.tconstruct.library.tools.part.ToolPartItem;
import slimeknights.tconstruct.tools.TinkerToolParts;
import slimeknights.tconstruct.tools.stats.HeadMaterialStats;

public class ModItems {
  public static final DeferredRegister<Item> ITEMS =
      DeferredRegister.create(ForgeRegistries.ITEMS, RandomTinkersTweaks.MOD_ID);

  public static final Item.Properties ITEM_PROPERTIES = new Item.Properties();
  public static final RegistryObject<MaterialItem> SHOVEL_HEAD_PART =
      ITEMS.register("shovel_head", () -> new ToolPartItem(ITEM_PROPERTIES, HeadMaterialStats.ID));
  public static final RegistryObject<Item> GOLD_SHOVEL_HEAD_CAST =
      ITEMS.register(
          "gold_shovel_head_cast", () -> new PartCastItem(ITEM_PROPERTIES, SHOVEL_HEAD_PART));
  public static final RegistryObject<Item> SAND_SHOVEL_HEAD_CAST =
      ITEMS.register(
          "sand_shovel_head_cast", () -> new PartCastItem(ITEM_PROPERTIES, SHOVEL_HEAD_PART));
  public static final RegistryObject<Item> RED_SAND_SHOVEL_HEAD_CAST =
      ITEMS.register(
          "red_sand_shovel_head_cast", () -> new PartCastItem(ITEM_PROPERTIES, SHOVEL_HEAD_PART));

  public static final RegistryObject<Item> ALUMINUM_BRASS_BLANK_CAST =
      ITEMS.register("aluminum_brass_blank_cast", () -> new Item(ITEM_PROPERTIES));

  public static final RegistryObject<Item> ALUMINUM_BRASS_INGOT_CAST =
      ITEMS.register("aluminum_brass_ingot_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_NUGGET_CAST =
      ITEMS.register("aluminum_brass_nugget_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_GEM_CAST =
      ITEMS.register("aluminum_brass_gem_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_ROD_CAST =
      ITEMS.register("aluminum_brass_rod_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_REPAIR_KIT_CAST =
      ITEMS.register(
          "aluminum_brass_repair_kit_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.repairKit));

  public static final RegistryObject<Item> ALUMINUM_BRASS_PLATE_CAST =
      ITEMS.register("aluminum_brass_plate_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_GEAR_CAST =
      ITEMS.register("aluminum_brass_gear_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_COIN_CAST =
      ITEMS.register("aluminum_brass_coin_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_WIRE_CAST =
      ITEMS.register("aluminum_brass_wire_cast", () -> new Item(ITEM_PROPERTIES));

  public static final RegistryObject<Item> ALUMINUM_BRASS_PICK_HEAD_CAST =
      ITEMS.register(
          "aluminum_brass_pick_head_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.pickHead));
  public static final RegistryObject<Item> ALUMINUM_BRASS_SMALL_AXE_HEAD_CAST =
      ITEMS.register(
          "aluminum_brass_small_axe_head_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.smallAxeHead));
  public static final RegistryObject<Item> ALUMINUM_BRASS_SMALL_BLADE_CAST =
      ITEMS.register(
          "aluminum_brass_small_blade_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.smallBlade));
  public static final RegistryObject<Item> ALUMINUM_BRASS_ADZE_HEAD_CAST =
      ITEMS.register(
          "aluminum_brass_adze_head_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.adzeHead));
  public static final RegistryObject<Item> ALUMINUM_BRASS_SHOVEL_HEAD_CAST =
      ITEMS.register(
          "aluminum_brass_shovel_head_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, SHOVEL_HEAD_PART));

  // large tool heads
  public static final RegistryObject<Item> ALUMINUM_BRASS_HAMMER_HEAD_CAST =
      ITEMS.register(
          "aluminum_brass_hammer_head_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.hammerHead));
  public static final RegistryObject<Item> ALUMINUM_BRASS_BROAD_BLADE_CAST =
      ITEMS.register(
          "aluminum_brass_broad_blade_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.broadBlade));
  public static final RegistryObject<Item> ALUMINUM_BRASS_BROAD_AXE_HEAD_CAST =
      ITEMS.register(
          "aluminum_brass_broad_axe_head_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.broadAxeHead));
  public static final RegistryObject<Item> ALUMINUM_BRASS_LARGE_PLATE_CAST =
      ITEMS.register(
          "aluminum_brass_large_plate_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.largePlate));
  // bindings
  public static final RegistryObject<Item> ALUMINUM_BRASS_TOOL_BINDING_CAST =
      ITEMS.register(
          "aluminum_brass_tool_binding_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.toolBinding));
  public static final RegistryObject<Item> ALUMINUM_BRASS_TOUGH_BINDING_CAST =
      ITEMS.register(
          "aluminum_brass_tough_binding_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.toughBinding));
  // tool rods
  public static final RegistryObject<Item> ALUMINUM_BRASS_TOOL_HANDLE_CAST =
      ITEMS.register(
          "aluminum_brass_tool_handle_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.toolHandle));
  public static final RegistryObject<Item> ALUMINUM_BRASS_TOUGH_HANDLE_CAST =
      ITEMS.register(
          "aluminum_brass_tough_handle_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.toughHandle));
  // bow
  public static final RegistryObject<Item> ALUMINUM_BRASS_BOW_LIMB_CAST =
      ITEMS.register(
          "aluminum_brass_bow_limb_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.bowLimb));
  public static final RegistryObject<Item> ALUMINUM_BRASS_BOW_GRIP_CAST =
      ITEMS.register(
          "aluminum_brass_bow_grip_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.bowGrip));
  // armor
  public static final RegistryObject<Item> ALUMINUM_BRASS_HELMET_PLATING_CAST =
      ITEMS.register("aluminum_brass_helmet_plating_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_CHESTPLATE_PLATING_CAST =
      ITEMS.register("aluminum_brass_chestplate_plating_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_LEGGINGS_PLATING_CAST =
      ITEMS.register("aluminum_brass_leggings_plating_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_BOOTS_PLATING_CAST =
      ITEMS.register("aluminum_brass_boots_plating_cast", () -> new Item(ITEM_PROPERTIES));
  public static final RegistryObject<Item> ALUMINUM_BRASS_MAILLE_CAST =
      ITEMS.register(
          "aluminum_brass_maille_cast",
          () -> new PartCastItem(ITEM_PROPERTIES, TinkerToolParts.maille));

  public static final RegistryObject<ModifiableItem> SHOVEL_TOOL =
      ITEMS.register(
          "shovel",
          () -> new ModifiableItem(new Item.Properties().stacksTo(1), ToolDefinitions.SHOVEL));

  public static void register(IEventBus eventBus) {
    ITEMS.register(eventBus);
  }
}
