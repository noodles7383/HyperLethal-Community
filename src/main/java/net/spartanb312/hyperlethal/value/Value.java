package net.spartanb312.hyperlethal.value;

import java.util.function.Predicate;

/**
 * Created by KillRED
 */
public class Value<T> {

    public T value;
    private T defaultValue;
    Predicate<T> visibility;
    private String name;


    public Value(String name, T defaultValue, Predicate<T> visibility) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
        this.visibility = visibility;
    }


    public Value(String name, T defaultValue) {
        this.name = name;
        this.defaultValue = defaultValue;
        this.value = defaultValue;
        this.visibility = v -> true;
    }

    public String getName() {
        return name;
    }

    public T getDefaultValue() {
        return defaultValue;
    }

    public boolean isVisible() {
        return this.visibility.test(getValue());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

}
