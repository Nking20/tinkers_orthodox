package org.tinkers_orthodox.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tinkers_orthodox.TinkersOrthodox;

public class TinkersOrthodoxItem {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TinkersOrthodox.MODID);
    public static final RegistryObject<Item> CrushedCobaltOre = REGISTRY.register("crushed_cobalt_ore", org.tinkers_orthodox.item.CrushedCobaltOre::new);
    public static final RegistryObject<Item> CobaltDust =REGISTRY.register("cobalt_oust", org.tinkers_orthodox.item.CobaltDust::new);
}
