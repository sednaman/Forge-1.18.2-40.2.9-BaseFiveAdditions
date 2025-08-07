package net.sedna.basefiveadditions.item;

import net.minecraft.world.item.*;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sedna.basefiveadditions.BaseFiveAdditions;
import net.sedna.basefiveadditions.entity.ModEntityTypes;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BaseFiveAdditions.MOD_ID);

    public static final RegistryObject<Item> FAICONIUM = ITEMS.register("faiconium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static final RegistryObject<Item> FAICONIUM_COIN = ITEMS.register("faiconium_coin",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static final RegistryObject<Item> FAICONIUM_COIN_2 = ITEMS.register("faiconium_coin_2",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static final RegistryObject<Item> FAICONIUM_COIN_3 = ITEMS.register("faiconium_coin_3",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static final RegistryObject<Item> FAICONIUM_SWORD = ITEMS.register("faiconium_sword",
            () -> new SwordItem(ModTiers.FAICONIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static final RegistryObject<Item> FAICONIUM_PICKAXE = ITEMS.register("faiconium_pickaxe",
            () -> new PickaxeItem(ModTiers.FAICONIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static final RegistryObject<Item> FAICONIUM_SHOVEL = ITEMS.register("faiconium_shovel",
            () -> new ShovelItem(ModTiers.FAICONIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));
    public static final RegistryObject<Item> FAICONIUM_AXE = ITEMS.register("faiconium_axe",
            () -> new AxeItem(ModTiers.FAICONIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));
    public static final RegistryObject<Item> FAICONIUM_HOE = ITEMS.register("faiconium_hoe",
            () -> new HoeItem(ModTiers.FAICONIUM, 2, 3f,
                    new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));
    public static final RegistryObject<Item> FALCON_SPAWN_EGG = ITEMS.register("falcon_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntityTypes.FALCON, 0x3d1d00, 0xb5b5b5,
                    new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
