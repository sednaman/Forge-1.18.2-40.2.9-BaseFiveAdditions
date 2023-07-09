package net.sedna.basefiveadditions;

import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.sedna.basefiveadditions.block.ModBlocks;
import net.sedna.basefiveadditions.entity.ModEntityTypes;
import net.sedna.basefiveadditions.item.ModItems;
import org.slf4j.Logger;
import software.bernie.geckolib3.GeckoLib;
import net.sedna.basefiveadditions.entity.client.FalconRenderer;

import java.util.stream.Collectors;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BaseFiveAdditions.MOD_ID)
public class BaseFiveAdditions
{
    public static final String MOD_ID = "basefiveadditions";

    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BaseFiveAdditions()
    {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModItems.register(eventBus);
        ModBlocks.register(eventBus);

        eventBus.addListener(this::setup);
        eventBus.addListener(this::clientSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        ModEntityTypes.register(eventBus);

        GeckoLib.initialize();
    }

    private void clientSetup(final FMLClientSetupEvent event){
        EntityRenderers.register(ModEntityTypes.FALCON.get(), FalconRenderer::new);
    }
    private void setup(final FMLCommonSetupEvent event)
    {
        // some preinit code
        LOGGER.info("HELLO FROM PREINIT");
        LOGGER.info("DIRT BLOCK >> {}", Blocks.DIRT.getRegistryName());
    }

}
