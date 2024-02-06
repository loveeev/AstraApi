package dev.loveeev.astraapi;

import com.samjakob.spigui.SpiGUI;
import dev.loveeev.astraapi.data.DependencyManager;
import dev.loveeev.astraapi.layer.SpigotServiceLayer;
import dev.loveeev.astraapi.layer.UtilityLayer;
import dev.loveeev.astraapi.util.ChatUtility;
import lombok.Getter;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Zimoxy DEV: loveeev
 */

public final class Main extends JavaPlugin {

    @Getter
    private static Main instance;

    UtilityLayer utilityLayer;
    SpigotServiceLayer serviceLayer;

    @Override
    public void onEnable() {
        instance = this;
        // Проверить необязательные зависимости
        DependencyManager.checkSoftDependencies();

        utilityLayer = new UtilityLayer(this);
        utilityLayer.enable();
        serviceLayer = new SpigotServiceLayer(this);
        serviceLayer.enable();
    }

    @Override
    public void onDisable() {
        serviceLayer.disable();
        utilityLayer.disable();
    }

    /**
     * Шорткаты для утилит
     */

    public ChatUtility getChatUtility() {
        return utilityLayer.getChatUtility();
    }

    public SpiGUI getSpiGui() {
        return utilityLayer.getSpiGUI();
    }

}
