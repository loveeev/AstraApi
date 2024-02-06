package dev.loveeev.astraapi.module;


import dev.loveeev.astraapi.Main;
import org.bukkit.Bukkit;
import org.bukkit.event.Listener;

/**
 * @author Zimoxy DEV: loveeev
 */
public abstract class ListenableSpigotService extends SpigotService implements Listener {

    public ListenableSpigotService(Main plugin) {
        super(plugin);
    }

    @Override
    public void enable() {
        super.enable();
        Bukkit.getPluginManager().registerEvents(this, plugin);
    }
}
