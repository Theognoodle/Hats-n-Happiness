


package com.areth.hatsnhappiness.item;

import com.areth.hatsnhappiness.HatsnHappiness;
import com.areth.hatsnhappiness.item.custom.ModArmorMaterials;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static void registerModItems() {
        HatsnHappiness.LOGGER.info("Generating Mod Items For: " + HatsnHappiness.MOD_ID);
    }
    public static final Item TOP_HAT = registerItem("hattop", new ArmorItem(ModArmorMaterials.COSMETIC,ArmorItem.Type.HELMET, new FabricItemSettings()));

    public static final Item SPOOL = registerItem("spool",new Item(new Item.Settings())) ;

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(HatsnHappiness.MOD_ID, name), item);
    }

}





