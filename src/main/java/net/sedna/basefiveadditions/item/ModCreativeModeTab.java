package net.sedna.basefiveadditions.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab BASE_FIVE_TAB = new CreativeModeTab("basefivetab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.FAICONIUM.get());
        }
    };
}
