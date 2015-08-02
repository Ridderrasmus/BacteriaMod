package com.rasmus.bacteriamod.init;

import com.rasmus.bacteriamod.Reference;
import com.rasmus.bacteriamod.block.BlockMicroscope;
import com.rasmus.bacteriamod.block.BlockBM;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rasmus on 01-08-2015.
 */
public class Blocks
{

    public static Block microscope;


    public static void init()
    {
        microscope = new BlockMicroscope();

        register();
    }

    public static void register()
    {
        GameRegistry.registerBlock(microscope, microscope.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(microscope);
    }

    public static void registerRender(Block block)
    {
        Item item = Item.getItemFromBlock(block);
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }
}
