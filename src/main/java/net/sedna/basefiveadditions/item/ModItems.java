package net.sedna.basefiveadditions.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sedna.basefiveadditions.BaseFiveAdditions;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BaseFiveAdditions.MOD_ID);

    public static final RegistryObject<Item> FAICONIUM = ITEMS.register("faiconium",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.BASE_FIVE_TAB)));



    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
