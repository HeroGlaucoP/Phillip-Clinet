package rina.phillipe.mixin;

// Minecraft.
import net.minecraftforge.fml.relauncher.IFMLLoadingPlugin;

// Javax.
import javax.annotation.Nullable;

// Mixin utils.
import org.spongepowered.asm.mixin.MixinEnvironment;
import org.spongepowered.asm.launch.MixinBootstrap;
import org.spongepowered.asm.mixin.Mixins;

// Java.
import java.util.Map;

/**
 *
 * @author Rinakk
 *
 * Created by Rina in 02/09/2020.
 *
 **/
public class MixinLoader implements IFMLLoadingPlugin {
	public MixinLoader() {
		MixinBootstrap.init();

		Mixins.addConfiguration("mixins.phillipe.json");

		// MixinEnvironment.getDefaultEnvironment().setObfuscationContext("searge");
	}

	@Override
	public String[] getASMTransformerClass() {
		return new String[0];
	}

	@Override
	public String getModContainerClass() {
		return null;
	}

	@Nullable
	@Override
	public String getSetupClass() {
		return null;
	}

	@Override
	public void injectData(Map<String, Object> data) {}

	@Override
	public String getAccessTransformerClass() {
		return null;
	}
}