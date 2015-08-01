package com.rasmus.bacteriamod.proxy;

import com.rasmus.bacteriamod.init.Blocks;
import com.rasmus.bacteriamod.init.Items;

/**
 * Created by Rasmus on 01-08-2015.
 */
public class ClientProxy extends CommonProxy
{

    public void registerRenders()
    {
        Items.registerRenders();
        Blocks.registerRenders();
    }
}
