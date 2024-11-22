package org.tinkers_orthodox.init;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.tinkers_orthodox.TinkersOrthodox;
import org.tinkers_orthodox.item.ExampleItem;

public class TinkersOrthodoxItem {
    public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, TinkersOrthodox.MODID);
    public static final RegistryObject<Item> ExampleItem = REGISTRY.register("example_item", () -> new ExampleItem());



}
