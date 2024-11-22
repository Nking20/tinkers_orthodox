package org.tinkers_orthodox.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;

public class CrushedCobaltOre extends Item {
    public CrushedCobaltOre() {
        super(new Item.Properties().stacksTo(64).rarity(Rarity.COMMON));
    }
}
