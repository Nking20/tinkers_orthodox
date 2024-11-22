package org.tinkers_orthodox.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class ExampleItem extends Item {
    public ExampleItem() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
