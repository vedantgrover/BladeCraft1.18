package com.bladedurman.bladecraft.item;

import com.bladedurman.bladecraft.BladeCraft;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

/**
 * Registering items into the game through the Deferred Register.
 *
 * @author Freyr
 */
public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BladeCraft.MOD_ID); // The Deferred Register. All added blocks and items are stored within here.

    // Items
    public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RUBY_TAB)));
    public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAPPHIRE_TAB)));

    public static final RegistryObject<Item> RAW_RUBY = ITEMS.register("raw_ruby", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.RUBY_TAB)));
    public static final RegistryObject<Item> RAW_SAPPHIRE = ITEMS.register("raw_sapphire", () -> new Item(new Item.Properties().tab(ModCreativeModeTab.SAPPHIRE_TAB)));

    /**
     * Taking everything that is within the Deferred Register and adding it to the game through the event bus.
     *
     * @param eventBus Interacts with the game
     */
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
