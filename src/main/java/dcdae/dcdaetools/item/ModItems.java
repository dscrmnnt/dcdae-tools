package dcdae.dcdaetools.item;

import dcdae.dcdaetools.DcdaeTools;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item RUBY = registerItem("ruby", new Item(new Item.Settings()
            .maxCount(99)
            .registryKey(RegistryKey.of(RegistryKeys.ITEM, Identifier.of(DcdaeTools.MOD_ID,"ruby")))));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(DcdaeTools.MOD_ID, name), item);
    }

    public static void register() {
        DcdaeTools.LOGGER.debug("Registering Mod Items for " + DcdaeTools.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(RUBY);
        });
    }
}
