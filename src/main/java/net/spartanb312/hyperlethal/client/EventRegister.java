package net.spartanb312.hyperlethal.client;

import net.minecraftforge.common.MinecraftForge;
import net.spartanb312.hyperlethal.module.Module;

public class EventRegister {

    public static void registerModule(Module module){
        MinecraftForge.EVENT_BUS.register(module);
    }
    public static void registerModule(Object eventProcessor){
        MinecraftForge.EVENT_BUS.register(eventProcessor);
    }
    public static void unregisterModule(Module module){
        MinecraftForge.EVENT_BUS.unregister(module);
    }
}
