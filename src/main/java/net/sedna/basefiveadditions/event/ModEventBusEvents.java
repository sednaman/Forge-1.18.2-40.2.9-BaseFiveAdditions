package net.sedna.basefiveadditions.event;

import net.sedna.basefiveadditions.BaseFiveAdditions;
import net.sedna.basefiveadditions.entity.ModEntityTypes;
import net.sedna.basefiveadditions.entity.custom.FalconEntity;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import javax.annotation.Nonnull;

@Mod.EventBusSubscriber(modid = BaseFiveAdditions.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void entityAttributeEvent(EntityAttributeCreationEvent event) {
        event.put(ModEntityTypes.FALCON.get(), FalconEntity.setAttributes());
    }
}
