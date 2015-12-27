package com.rasmus.bacteriamod;

import com.rasmus.bacteriamod.init.Blocks;
import com.rasmus.bacteriamod.init.Items;
import com.rasmus.bacteriamod.proxy.CommonProxy;
import com.rasmus.bacteriamod.utility.LogHelper;
import net.minecraftforge.fml.common.FMLLog;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;



//Here we can place the general todos I make. I go more in-depth in the actual files of fx. the microscope.

//TODO: Create classes that helps us make features more easily!

//TODO: Create a microscope!   -   Ras: I'm making the model, currently about 10% done though :/

//      Study = Look at in microscope and get something in return
//TODO: Make fungus be able to be studied! (I mean, it's a start :/)
//TODO: Make more living stuff (Flowers, crops, saplings etc.) be able to be studied!
//TODO: Make the research one has made usable ;)
//TODO: Make guide book!


//Test test test



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

        LogHelper.info("Pre-init done!");
    }


    @EventHandler
    public void init(FMLInitializationEvent event)
    {

        proxy.registerRenders();

        LogHelper.info("Init done!");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post-init done!");
    }
}
