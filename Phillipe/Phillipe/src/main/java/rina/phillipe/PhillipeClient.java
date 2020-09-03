package rina.phillipe;

// Minecraft.
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;

/**
 *
 * @author Rinakk
 *
 * Created by Rina in 02/09/2020.
 *
 **/
@Mod(modid = "phillipe", name = PhillipeClient.NAME, version = PhillipeClient.VERSION)
public class PhillipeClient {
	public static final String NAME    = "Phillipe";
	public static final String VERSION = "0.1";

	@Mod.EventHandler
	public void initClient(FMLInitializationEvent event) {}
}