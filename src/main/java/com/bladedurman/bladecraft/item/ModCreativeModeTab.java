package com.bladedurman.bladecraft.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import org.jetbrains.annotations.NotNull;

/**
 * All the new creative mode tabs that I add will be here
 *
 * @author Freyr
 */
public class ModCreativeModeTab {
    public static final CreativeModeTab RUBY_TAB = new CreativeModeTab("ruby_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.RUBY.get());
        }
    };

    public static final CreativeModeTab SAPPHIRE_TAB = new CreativeModeTab("sapphire_tab") {
        @Override
        public @NotNull ItemStack makeIcon() {
            return new ItemStack(ModItems.SAPPHIRE.get());
        }
    };
}
