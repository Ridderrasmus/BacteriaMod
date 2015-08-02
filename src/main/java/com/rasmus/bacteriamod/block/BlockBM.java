package com.rasmus.bacteriamod.block;

import com.rasmus.bacteriamod.BacteriaMod;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumWorldBlockLayer;
import net.minecraft.world.IBlockAccess;


/**
 * Created by Rasmus on 01-08-2015.
 */
public class BlockBM extends Block
{
    public BlockBM(Material material) {
        super(material);
        this.setCreativeTab(BacteriaMod.tabBacteria);
    }

}
