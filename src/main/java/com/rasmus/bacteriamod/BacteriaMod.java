package com.rasmus.bacteriamod;

import com.rasmus.bacteriamod.init.Blocks;
import com.rasmus.bacteriamod.init.Items;
import com.rasmus.bacteriamod.proxy.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MODID,name = Reference.MOD_NAME, version = Reference.VERSION)
public class BacteriaMod
{

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
    public static CommonProxy proxy;

    public static final BacteriaTab tabBacteria = new BacteriaTab("tabBacteria");


    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        Blocks.init();
        Items.init();
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        proxy.registerRenders();
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }
}
