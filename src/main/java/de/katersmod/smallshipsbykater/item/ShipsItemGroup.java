package de.katersmod.smallshipsbykater.item;

import de.katersmod.smallshipsbykater.shipbyKaterMod;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ShipsItemGroup {
    public static final ItemGroup Mythril = FabricItemGroupBuilder.build(new Identifier(shipbyKaterMod.MOD_ID, "mythril"),
            () -> new ItemStack(ModItem.MYTHRIL_INGOT));

    public static final ItemGroup Ships = FabricItemGroupBuilder.build(new Identifier(shipbyKaterMod.MOD_ID, "ships"),
            () -> new ItemStack(ModItem.MYTHRIL_NUGGET));

}
