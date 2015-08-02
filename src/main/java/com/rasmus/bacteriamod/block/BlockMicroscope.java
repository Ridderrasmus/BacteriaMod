package com.rasmus.bacteriamod.block;

import net.minecraft.block.material.Material;
import net.minecraft.util.EnumWorldBlockLayer;

/**
 * Created by Rasmus on 02-08-2015.
 */


//TODO: Create GUI for the microscope
//TODO: More stuff gotta find out later


public class BlockMicroscope extends BlockBM
{

    public BlockMicroscope()
    {
        super(Material.iron);
        setUnlocalizedName("microscope");
    }

    @Override
    public boolean isOpaqueCube() {
        return false;
    }

    @Override
    public boolean isFullCube() {
        return false;
    }

    @Override
    public EnumWorldBlockLayer getBlockLayer() {
        return EnumWorldBlockLayer.CUTOUT;
    }
}
