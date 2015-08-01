package com.rasmus.bacteriamod.init;

import com.rasmus.bacteriamod.Reference;
import com.rasmus.bacteriamod.item.ItemTestItem;
import net.minecraft.client.Minecraft;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Rasmus on 01-08-2015.
 */
public class Items {

    public static Item test_item;

    public static void init()
    {
        test_item = new ItemTestItem();

        register();
    }

    public static void register()
    {
        GameRegistry.registerItem(test_item, test_item.getUnlocalizedName().substring(5));
    }

    public static void registerRenders()
    {
        registerRender(test_item);
    }

    public static void registerRender(Item item)
    {
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(Reference.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }

}
