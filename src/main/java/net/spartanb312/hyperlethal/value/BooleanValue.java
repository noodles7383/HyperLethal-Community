package net.spartanb312.hyperlethal.value;

import java.util.function.Predicate;

/**
 * Created by KillRED
 */
public class BooleanValue extends Value<Boolean> {

    public BooleanValue(String name, Boolean defaultValue) {
        super(name, defaultValue);
    }

    public BooleanValue(String name, Boolean defaultValue, Predicate<Boolean> visibility) {
        super(name, defaultValue, visibility);
    }

}
