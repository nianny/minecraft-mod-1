package nianny2007.hallo.coin;

import net.fabricmc.api.ModInitializer;
// import net.fabricmc.fabric.api.client.networking.v1.C2SPlayChannelEvents.Register;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class HalloCoin implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LogManager.getLogger("hallocoin");

	public static final Item HALLO_COIN = new Item(new Item.Settings().group(ItemGroup.MISC));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("hallocoin", "hallo_coin"), HALLO_COIN);
		LOGGER.info("Hello Fabric world!");
	}
}
