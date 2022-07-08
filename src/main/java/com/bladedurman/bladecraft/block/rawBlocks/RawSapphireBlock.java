package com.bladedurman.bladecraft.block.rawBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class RawSapphireBlock extends Block {
    public RawSapphireBlock() {
        super(Properties.of(Material.STONE)
                .strength(4.0F, 9.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}
