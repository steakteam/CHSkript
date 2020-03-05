package kr.entree.chskript;

import com.laytonsmith.PureUtilities.SimpleVersion;
import com.laytonsmith.PureUtilities.Version;
import com.laytonsmith.core.extensions.AbstractExtension;
import com.laytonsmith.core.extensions.MSExtension;
import org.bukkit.Bukkit;

import java.util.logging.Level;

/**
 * Created by JunHyung Lim on 2020-03-05
 */
@MSExtension("CHSkript")
public class CHSkript extends AbstractExtension {
    @Override
    public Version getVersion() {
        return new SimpleVersion(CHSkriptGradle.VERSION);
    }

    @Override
    public void onStartup() {
        Bukkit.getLogger().log(Level.INFO, "CHSkript {0} loaded.", CHSkriptGradle.VERSION);
    }

    @Override
    public void onShutdown() {
        Bukkit.getLogger().log(Level.INFO, "CHSkript {0} unloaded.", CHSkriptGradle.VERSION);
    }
}
