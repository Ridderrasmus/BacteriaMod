package com.rasmus.bacteriamod;

import com.rasmus.bacteriamod.init.Items;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

/**
 * Created by Rasmus on 01-08-2015.
 */
public class BacteriaTab extends CreativeTabs
{

    public BacteriaTab(String label)
    {
        super(label);
        //this.setBackgroundImageName("BackgroundImageHere.png");
    }

    @Override
    public Item getTabIconItem() {
        return Items.test_item;
    }
}
