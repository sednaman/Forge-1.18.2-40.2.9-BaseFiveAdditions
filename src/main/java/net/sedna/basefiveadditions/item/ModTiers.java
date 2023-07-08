package net.sedna.basefiveadditions.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class ModTiers {
    public static final ForgeTier FAICONIUM = new ForgeTier(4, 2031,4f,
            4f,22, BlockTags.NEEDS_IRON_TOOL,
            () -> Ingredient.of(ModItems.FAICONIUM.get()));
}
