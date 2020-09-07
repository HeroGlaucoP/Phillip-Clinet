package rina.phillipe.modules;

import rina.phillipe.modules.movement.Sprint;

import java.util.ArrayList;

public class ModuleManager {

    private ArrayList<Module> moduleList;
    public static ArrayList<Module> modules;

    public ModuleManager() {
        this.moduleList = new ArrayList<>();
        modules = new ArrayList<>();
        moduleList = new ArrayList<>();
        addModule(new Sprint());
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
