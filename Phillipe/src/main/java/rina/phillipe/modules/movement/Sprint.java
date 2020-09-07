package rina.phillipe.modules.movement;

import rina.phillipe.modules.Module;

public class Sprint extends Module {
    public Sprint() {
        super("Sprint", "Sprint", "Make u eat while sprint.", Category.MOVEMENT);
    }
    public void onUpdate() {
        if (mc.player.moveForward > 0 && !mc.player.isSprinting()) {
            mc.player.setSprinting(true);
        }
    }
}
