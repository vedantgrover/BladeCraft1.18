package com.bladedurman.bladecraft.block.gemBlocks;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.OreBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.Material;

public class SapphireOreBlock extends OreBlock {
    public SapphireOreBlock() {
        super(BlockBehaviour.Properties.of(Material.STONE).strength(3.0F, 4.0F).sound(SoundType.STONE).requiresCorrectToolForDrops());
    }

    @Override
    public int getExpDrop(BlockState state, LevelReader reader, BlockPos pos, int fortune, int silktouch) {
        return 1;
    }
}
