package net.spartanb312.hyperlethal.value;

import java.util.function.Predicate;

/**
 * Created by KillRED
 */
public class FloatValue extends Value<Float>{
    protected Float min, max;

    public FloatValue(String name, Float defaultValue, Float min, Float max) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public FloatValue(String name, Float defaultValue, Float min, Float max, Predicate<Float> visibility) {
        super(name, defaultValue, visibility);
        this.min = min;
        this.max = max;
    }

    public Float getMin() {
        return min;
    }

    public Float getMax() {

        return max;
    }
}
