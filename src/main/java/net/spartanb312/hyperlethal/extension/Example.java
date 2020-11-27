package net.spartanb312.hyperlethal.extension;

import net.minecraft.client.gui.inventory.GuiContainer;
import net.minecraft.init.Items;
import net.minecraft.inventory.ClickType;
import net.spartanb312.hyperlethal.module.Category;
import net.spartanb312.hyperlethal.module.Module;
import net.spartanb312.hyperlethal.value.BooleanValue;

public class Example extends Module {

    BooleanValue pauseinventory;

    public Example() {
        super("Totem", Category.COMBAT);
        pauseinventory = new BooleanValue("PauseInInventory",false);
        register(pauseinventory);
    }

    @Override
    public void onTick() {

        if (mc.currentScreen != null) {
            return;
        }
        if (pauseinventory.getValue() && mc.currentScreen instanceof GuiContainer){
            return;
        }
        if (mc.player.inventory.getStackInSlot(0).getItem() == Items.TOTEM_OF_UNDYING) {
            return;
        }
        for (int i = 9; i < 35; ++i) {
            if (mc.player.inventory.getStackInSlot(i).getItem() == Items.TOTEM_OF_UNDYING) {
                mc.playerController.windowClick(mc.player.inventoryContainer.windowId, i, 0, ClickType.SWAP, mc.player);
                break;
            }
        }
    }

}
