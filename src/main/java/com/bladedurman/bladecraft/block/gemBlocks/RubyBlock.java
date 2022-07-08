package com.bladedurman.bladecraft.block.gemBlocks;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;

public class RubyBlock extends Block {
    public RubyBlock() {
        super(BlockBehaviour.Properties.of(Material.METAL)
                .strength(5.0F, 30.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops()
        );
    }
}
