package net.spartanb312.hyperlethal.module;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraftforge.client.event.InputUpdateEvent;
import net.minecraftforge.client.event.RenderGameOverlayEvent;
import net.spartanb312.hyperlethal.client.EventRegister;
import net.spartanb312.hyperlethal.client.events.RenderEvent;
import net.spartanb312.hyperlethal.utils.Wrapper;
import net.spartanb312.hyperlethal.value.Value;

import java.util.ArrayList;

/**
 * Created by KillRED
 */
public class Module {
    public String name;
    public boolean toggled;
    public int keycode = 0;
    public Category category;

    private final ArrayList<Value> values = new ArrayList<>();

    public static final Minecraft mc = Wrapper.mc;
    public static final FontRenderer fontRenderer = mc.fontRenderer;


    public Module(String name, Category category){
        this.name = name;
        this.category = category;
    }
	public Module(String name, Category category,int keycode){
        this.name = name;
        this.keycode = keycode;
        this.category = category;
    }

    public void register(Value... values) {
        for (Value value : values) {
            this.getValues().add(value);
        }
    }

    public ArrayList<Value> getValues() {
        return values;
    }


    public String getName(){
        return name;
    }

    public void enable() {
        toggled = true;
        EventRegister.registerModule(this);
        onEnable();
    }

    public void disable() {
        toggled = false;
        EventRegister.unregisterModule(this);
        onDisable();
    }

    public boolean isEnabled(){
        return toggled;
    }
    public boolean isDisabled(){
        return !toggled;
    }

    public void onEnable(){}
    public void onDisable(){}

    public void onAlwaysTick(){}
    public void onAlwaysFast(){}
    public void onKey(InputUpdateEvent event){}

    public void onTick(){}
    public void onWorldRender(RenderEvent event) {}
    public void onRender2D(RenderGameOverlayEvent event){}

    public Category getCategory() {
        return category;
    }

    public int getBind(){
        return keycode;
    }

    public void setBind(int keycode){
        this.keycode = keycode;
    }

    public void toggle(){
        toggled = !toggled;
        if (toggled){
            enable();
        } else {
            disable();
        }
    }

    public String getInfo(String string){
        return null;
    }

    public void setEnable(boolean toggled){
        this.toggled = toggled;
    }

    public String getHudInfo() {
        return "";
    }
}
