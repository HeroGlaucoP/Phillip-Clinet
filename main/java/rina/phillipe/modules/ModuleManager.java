package rina.phillipe.modules;

import java.util.ArrayList;
import rina.phillipe.modules.Module;

public class ModuleManager {

    private ArrayList<Module> moduleList;

    public ModuleManager() {
        this.moduleList = new ArrayList<>();
    }

    public void addModule(Module module) {
        this.moduleList.add(module);
    }

    public void onUpdateList() {
        for (Module modules : getModuleList()) {
            if (modules.getState()) {
                modules.onUpdate();
            }
        }
    }

    public ArrayList<Module> getModuleList() {
        return moduleList;
    }
}
