package com.rasmus.bacteriamod.item;

import com.rasmus.bacteriamod.BacteriaMod;
import com.rasmus.bacteriamod.BacteriaTab;
import net.minecraft.item.Item;

/**
 * Created by Rasmus on 01-08-2015.
 */
public class ItemTestItem extends Item
{

    public static final String name = "test_item";

    public ItemTestItem()
    {
        setUnlocalizedName("test_item");
        setCreativeTab(BacteriaMod.tabBacteria);
    }

    public String getName()
    {
        return name;
    }

}
