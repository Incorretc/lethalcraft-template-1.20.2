package me.inco.lethalcraft.item;

import me.inco.lethalcraft.LethalCraft;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item STOPSIGN = registerItem("stopsign", new Item(new FabricItemSettings()));
    private static void addItemsToToolsTabItemGroup(FabricItemGroupEntries entries){
        entries.add(STOPSIGN);
    }
    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, new Identifier(LethalCraft.MOD_ID, name), item);
    }
    public static void registerModItems() {
        LethalCraft.LOGGER.info("Registering Mod Items for "+ LethalCraft.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.TOOLS).register(ModItems::addItemsToToolsTabItemGroup);
    }
}
