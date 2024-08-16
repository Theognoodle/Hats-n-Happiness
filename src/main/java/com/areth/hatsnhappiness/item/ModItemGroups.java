package com.areth.hatsnhappiness.item;

import com.areth.hatsnhappiness.HatsnHappiness;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static void registerItemGroups() {
        HatsnHappiness.LOGGER.info("Item Groups Or Something");


    }
    public static final ItemGroup DEV_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(HatsnHappiness.MOD_ID, "dev"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.dev")).icon(() -> new ItemStack(ModItems.TOP_HAT)).entries(((displayContext, entries) -> {
                entries.add(ModItems.TOP_HAT);
                entries.add(ModItems.SPOOL);





            })).build());


}
