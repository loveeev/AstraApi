package dev.loveeev.astraapi.module.impl;


import dev.loveeev.astraapi.Main;
import dev.loveeev.astraapi.module.SpigotService;
import org.bukkit.entity.Player;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author Zimoxy DEV: loveeev
 */
public class ExchangeService extends SpigotService {

    PreparedStatement ps;

    ResultSet rs;

    private static ExchangeService instance;

    public static ExchangeService getInstance() {
        return instance;
    }

    public ExchangeService(Main plugin) {
        super(plugin);
    }


    public void exchange(Player player) {
        plugin.getChatUtility().sendSuccessNotification(player, "Вы перешли на следующую страницу.");
    }
}