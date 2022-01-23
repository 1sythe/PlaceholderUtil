package synthetic.placeholderutil;

import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;
import synthetic.placeholderutil.color.*;
import synthetic.placeholderutil.utils.CounterUtil;

public final class PlaceholderUtil extends JavaPlugin {

    private static PlaceholderUtil instance;

    public static PlaceholderUtil getInstance() {
        return instance;
    }


    @Override
    public void onEnable() {
        // Plugin startup logic

        instance = this;

        CounterUtil.startDefaultTimers();

        if(Bukkit.getPluginManager().getPlugin("PlaceholderAPI") != null) {
            new ColorRgbExpansion().register();
            new ColorExpansion().register();
            new ColorRgbWaveExpansion().register();
            new ColorCustomWaveExpansion().register();
            new ColorCustomCyleExpansion().register();
        }
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
