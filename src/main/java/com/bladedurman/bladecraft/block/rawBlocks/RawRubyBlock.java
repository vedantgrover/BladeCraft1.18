package com.bladedurman.bladecraft.block.rawBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RawRubyBlock extends Block {
    public RawRubyBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE)
                .strength(4.0F, 9.0F)
                .sound(SoundType.STONE)
                .requiresCorrectToolForDrops()
        );
    }
}
