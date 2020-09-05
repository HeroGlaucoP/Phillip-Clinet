package rina.phillipe;

// Minecraft.
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

import me.zero.alpine.EventManager;
import me.zero.alpine.EventBus;
import rina.phillipe.event.EventClientManager;
import rina.phillipe.modules.ModuleManager;

/**
 *
 * @author Rinakk
 *
 * Created by Rina in 02/09/2020.
 *
 **/
@Mod(modid = "phillipe", name = PhillipeClient.NAME, version = PhillipeClient.VERSION)
public class PhillipeClient {
	public static final String NAME    = "1pop";
	public static final String VERSION = "0.2";

	public static final EventBus ZERO_ALPINE_EVENT_MANAGER = new EventManager();

	@Mod.Instance
	private static PhillipeClient INSTANCE;

	private ModuleManager modulemanager;

	private EventClientManager eventManager;

	@Mod.EventHandler
	public void initClient(FMLInitializationEvent event) {
		modulemanager = new ModuleManager();
		eventManager = new EventClientManager();

		MinecraftForge.EVENT_BUS.register(eventManager);
	}

	public ModuleManager getModuleManager() {
		return INSTANCE.modulemanager;
	}
	public EventClientManager getEventClientManager() {
		return INSTANCE.eventManager;
	}
}
