package net.spartanb312.hyperlethal.value;


import java.util.function.Predicate;

/**
 * Created by KillRED
 */
public class IntValue extends Value<Integer>{
    protected Integer min, max;

    public IntValue(String name, Integer defaultValue, Integer min, Integer max) {
        super(name, defaultValue);
        this.min = min;
        this.max = max;
    }

    public IntValue(String name, Integer defaultValue, Integer min, Integer max, Predicate<Integer> visibility) {
        super(name, defaultValue, visibility);
        this.min = min;
        this.max = max;
    }


    public Integer getMin(){
        return min;
    }

    public Integer getMax() {
        return max;
    }
}