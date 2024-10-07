package net.deftera.ProjectGamma.Content.Items;

import net.deftera.ProjectGamma.ProjectGamma;
import net.legacyfabric.fabric.api.registry.v1.RegistryHelper;
import net.legacyfabric.fabric.api.util.Identifier;
import net.minecraft.client.TextureRegistry;
import net.minecraft.item.Item;

public class GammaItems {

    public static Item testItem = registerItem("test_item", new Item());

    private static Item registerItem(String name, Item item) {
        return RegistryHelper.registerItem(item, new Identifier(name));
    }


    public static void registerModItems() {

        ProjectGamma.LOGGER.debug("Registering ProjectGamma items...");

    }
}
