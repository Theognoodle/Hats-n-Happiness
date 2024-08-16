package com.areth.hatsnhappiness;

import com.areth.hatsnhappiness.item.ModItemGroups;
import com.areth.hatsnhappiness.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;





public class HatsnHappiness implements ModInitializer {

    public static final Logger LOGGER = LoggerFactory.getLogger("hatsnhappiness");
	public static final String MOD_ID = "hatsnhappiness";
	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		LOGGER.info("HatsnHappiness Is Active");
	}
}