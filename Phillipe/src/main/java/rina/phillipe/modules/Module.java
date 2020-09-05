package rina.phillipe.modules;

import rina.phillipe.PhillipeClient;

public class Module {

    private boolean state;
    private String name;
    private String tag;
    private String description;
    private Category category;
    private int keybind;

    public Module(String name, String tag, String description, Category category) {
        this.name = name;
        this.tag = tag;
        this.description = description;
        this.category = category;
        this.keybind = -1;
        this.state = false;
    }

    public void onUpdate() {}
    public void onDisable() {}
    public void onEnable() {}

    public void disable() {
        this.state = false;
        onDisable();
        PhillipeClient.ZERO_ALPINE_EVENT_MANAGER.unsubscribe(this);
    }
    public void enable() {
        this.state = true;
        onEnable();
        PhillipeClient.ZERO_ALPINE_EVENT_MANAGER.subscribe(this);
    }
    public void setState(boolean state) {
        if (state != getState()) {
            if (state) {
                enable();
            } else {
                disable();
            }
        }
    }
    public void toggle() {
        setState(!getState());
    }

    public void setKeybind(int bind) {
        this.keybind = bind;
    }

    public enum Category {
        Combat, Movement, Render, Player, World, Misc;
    }

    public String getName() {
        return this.name;
    }
    public String getTag() {
        return this.tag;
    }
    public String getDescription() {
        return this.description;
    }
    public Category getCategory() {
        return this.category;
    }
    public int getKeybind() {
        return this.keybind;
    }
    public boolean getState() {
        return this.state;
    }
}
