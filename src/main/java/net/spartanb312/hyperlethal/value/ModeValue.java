package net.spartanb312.hyperlethal.value;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by KillRED
 */
public class ModeValue extends Value<Mode> {
	
	private List<Mode> modes;
	private String modeName;
	private int index;

    public List<Mode> getModes() {
		return modes;
	}

	public ModeValue(String modeName, Mode... modes) {
        super(modeName, null);
        this.modeName = modeName;
		this.modes = Arrays.asList(modes);
		index = this.modes.indexOf(getToggledMode());
    }

	public ModeValue(String modeName, Predicate<Mode> visible, Mode... modes) {
		super(modeName, null, visible);
		this.modeName = modeName;
		this.modes = Arrays.asList(modes);
		index = this.modes.indexOf(getToggledMode());
	}


    public Mode getMode(String name) {
    	Mode m = null;
    	for(Mode mode : modes) {
    		if(mode.getName().equals(name)) {
    			m = mode;
    		}
    	}
    	return m;
    }

    public Mode getToggledMode(){
		Mode m = null;
		for(Mode mode : modes) {
			if(mode.isToggled()) {
				m = mode;
			}
		}
		return m;
	}

	public void setModeWithName(String s){
		for(Mode mode : modes) {
			mode.setToggled(mode.getName().equals(s));
		}
	}

	public void forwardLoop() {
		if (index < modes.size() - 1) {
			index++;
		} else {
			index = 0;
		}
		for (Mode mode : modes) {
			mode.setToggled(mode == modes.get(index));
		}
	}


	public void reverseLoop() {
		if (index > 0) {
			index--;
		} else {
			index = modes.size() - 1;
		}
		for (Mode mode : modes) {
			mode.setToggled(mode == modes.get(index));
		}
	}

	public String getModeName() {
		return modeName;
	}
}
