package rina.phillipe.settings;

import java.util.ArrayList;

import rina.phillipe.modules.Module;

/**
 * made by HeroCode
 * @author HeroCode
 * skided by hero
 */
public class SettingsManager {

    private ArrayList<Setting> settings;

    public SettingsManager() {
        this.settings = new ArrayList<>();
    }

    public void rSettings(Setting in) {
        this.settings.add(in);
    }

    public ArrayList<Setting> getSettings() {
        return this.settings;
    }

    public ArrayList<Setting> getSettingsByMod(Module mod) {
        ArrayList<Setting> out = new ArrayList<>();
        for (Setting s : getSettings()) {
            if (s.getParentMod().equals(mod)) {
                out.add(s);
            }
        }
        return out;
    }

    public Setting getSettingByDisplayName(String name) {
        for (Setting set : getSettings()) {
            if (set.getDisplayName().equalsIgnoreCase(name)) {
                return set;
            }
        }
        System.err.println("[Phillip] Error Setting NOT found: '" + name +"'!");
        return null;
    }

    public Setting getSettingsByID(String id) {
        for (Setting s : getSettings()) {
            if (s.getId().equalsIgnoreCase(id)) {
                return s;
            }
        }
        System.err.println("[Phillip] Error Setting NOT found: '" + id + "'!");
        return null;
    }
}
