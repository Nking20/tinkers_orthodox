package org.tinkers_orthodox;

import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.tinkers_orthodox.init.TinkersOrthodoxItem;

@Mod(TinkersOrthodox.MODID)
public class TinkersOrthodox {
    public static final String MODID = "tinkers_orthodox";
    public TinkersOrthodox() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        TinkersOrthodoxItem.REGISTRY.register(bus);
    }
}
