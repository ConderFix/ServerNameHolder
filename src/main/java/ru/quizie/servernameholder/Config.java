package ru.quizie.servernameholder;

import lombok.Getter;
import org.bukkit.configuration.file.FileConfiguration;


public class Config {

    public static void load(FileConfiguration configuration) {
        serverName = configuration.getString("serverName");
        serverNamePlugin = configuration.getString("serverNamePlugin");
    }

    @Getter
    private static String serverName;

    @Getter
    private static String serverNamePlugin;
}
