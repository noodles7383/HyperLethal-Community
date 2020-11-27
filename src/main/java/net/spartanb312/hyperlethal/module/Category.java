package net.spartanb312.hyperlethal.module;

/**
 * Created by KillRED
 */
public enum Category {
    HUD("HUDEditor"),
    COMBAT("Combat"),
    MISC("Misc"),
    MOVEMENT("Movement"),
    PLAYER("Player"),
    RENDER("Render"),
    CLIENT("Client");

    public String name;
    public int currentModule;

    Category(String name) {
        this.name = name;
    }

    public static int getTabSize(){
        int size = 0;
        for (Category category : Category.values()){
            size++;
        }
        return size;
    }


    public String getName() {
        return name;
    }
}