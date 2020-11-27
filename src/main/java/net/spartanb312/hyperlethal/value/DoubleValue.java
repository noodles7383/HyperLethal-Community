package net.spartanb312.hyperlethal.value;

import java.util.function.Predicate;

/**
 * Created by KillRED
 */
public class DoubleValue extends Value<Double> {

    protected Double min, max;
    //protected boolean visible;


    public DoubleValue(String name, Double defaultValue, Double min, Double max) {

        super(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public DoubleValue(String name, Double defaultValue, Double min, Double max, Predicate<Double> visibility) {
        super(name, defaultValue, visibility);
        this.min = min;
        this.max = max;
    }

    public Double getMin() {
        return min;
    }

    public Double getMax() {
        return max;
    }
}
