package com.github.nzddxd.init;

import com.github.nzddxd.Modkerentesting;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ItemInit {
    public static final Item EXAMPLE_ITEM = register("example_item", new Item(new Item.Settings()));

    public static <T extends Item> T register(String name, T item){
        return Registry.register(Registries.ITEM, Identifier.of(Modkerentesting.MOD_ID), item);
    }

    public static void load(){}
}
