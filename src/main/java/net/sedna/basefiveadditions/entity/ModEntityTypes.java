package net.sedna.basefiveadditions.entity;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.sedna.basefiveadditions.BaseFiveAdditions;
import net.sedna.basefiveadditions.entity.custom.FalconEntity;

public class ModEntityTypes {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITIES, BaseFiveAdditions.MOD_ID);

    public static final RegistryObject<EntityType<FalconEntity>> FALCON =
            ENTITY_TYPES.register("falcon",
                    () -> EntityType.Builder.of(FalconEntity::new, MobCategory.CREATURE)
                            .sized(0.8f, 0.6f)
                            .build(new ResourceLocation(BaseFiveAdditions.MOD_ID,"falcon").toString()));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
