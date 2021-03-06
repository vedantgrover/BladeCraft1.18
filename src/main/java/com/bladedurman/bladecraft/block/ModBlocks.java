package com.bladedurman.bladecraft.block;

import com.bladedurman.bladecraft.BladeCraft;
import com.bladedurman.bladecraft.block.gemBlocks.RubyBlock;
import com.bladedurman.bladecraft.block.oreBlocks.RubyOreBlock;
import com.bladedurman.bladecraft.block.gemBlocks.SapphireBlock;
import com.bladedurman.bladecraft.block.oreBlocks.SapphireOreBlock;
import com.bladedurman.bladecraft.block.rawBlocks.RawRubyBlock;
import com.bladedurman.bladecraft.block.rawBlocks.RawSapphireBlock;
import com.bladedurman.bladecraft.item.ModCreativeModeTab;
import com.bladedurman.bladecraft.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

/**
 * Registering blocks into the game through the Deferred Register.
 *
 * @author Freyr
 */
public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BladeCraft.MOD_ID); // The Deferred Register. All added blocks and items are stored within here.

    public static final RegistryObject<Block> RUBY_BLOCK = registerBlock("ruby_block", RubyBlock::new, ModCreativeModeTab.RUBY_TAB);
    public static final RegistryObject<Block> SAPPHIRE_BLOCK = registerBlock("sapphire_block", SapphireBlock::new, ModCreativeModeTab.SAPPHIRE_TAB);

    public static final RegistryObject<Block> RUBY_ORE_BLOCK = registerBlock("ruby_ore_block", RubyOreBlock::new, ModCreativeModeTab.RUBY_TAB);
    public static final RegistryObject<Block> SAPPHIRE_ORE_BLOCK = registerBlock("sapphire_ore_block", SapphireOreBlock::new, ModCreativeModeTab.SAPPHIRE_TAB);

    public static final RegistryObject<Block> RAW_RUBY_BLOCK = registerBlock("raw_ruby_block", RawRubyBlock::new, ModCreativeModeTab.RUBY_TAB);
    public static final RegistryObject<Block> RAW_SAPPHIRE_BLOCK = registerBlock("raw_sapphire_block", RawSapphireBlock::new, ModCreativeModeTab.SAPPHIRE_TAB);

    /**
     * Registers a block and a block item within Minecraft.
     *
     * @param name  Name of the block
     * @param block The block we are registering
     * @param tab   The creative mode tab that we want to store the block in.
     * @return The new registered block.
     */
    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block, CreativeModeTab tab) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn, tab);
        return toReturn;
    }

    /**
     * Registers a block item within Minecraft.
     *
     * @param name  Name of the block
     * @param block The block we are registering
     * @param tab   The creative mode tab that we want to store the block in.
     * @return The new registered block item.
     */
    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block, CreativeModeTab tab) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
    }

    /**
     * Taking everything that is within the Deferred Register and adding it to the game through the event bus.
     *
     * @param eventBus Interacts with the game
     */
    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}
