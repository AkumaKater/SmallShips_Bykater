package de.katersmod.smallshipsbykater.item;

import de.katersmod.smallshipsbykater.shipbyKaterMod;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;


public class ModItem {
    public static final Item MYTHRIL_INGOT = registerItem("mythril_ingot",
            new Item(new FabricItemSettings().group(ShipsItemGroup.Mythril)));
    public static final Item MYTHRIL_NUGGET = registerItem("mythril_nugget",
            new Item(new FabricItemSettings().group(ShipsItemGroup.Mythril)));

    public static final Item BURGER = registerItem("burger",
            new Item(new FabricItemSettings().group(ShipsItemGroup.Ships)));

    public static final Item LETTUCE = registerItem("lettuce",
            new Item(new FabricItemSettings().group(ShipsItemGroup.Ships)));

    public static final Item TOMATO = registerItem("tomato",
            new Item(new FabricItemSettings().group(ShipsItemGroup.Ships)));

    public static final Item TOMATO_LETTUCE = registerItem("tomato_lettuce",
            new Item(new FabricItemSettings().group(ShipsItemGroup.Ships)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(shipbyKaterMod.MOD_ID, name), item);
    }

    public static void registerItems() {
        shipbyKaterMod.LOGGER.info("Registering Mod Items for " + shipbyKaterMod.MOD_ID);
    }
}
