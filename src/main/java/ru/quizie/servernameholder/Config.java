package ru.quizie.servernameholder;

import org.bukkit.configuration.file.FileConfiguration;

public class Config {

    public static void load(FileConfiguration configuration) {
        serverName = configuration.getString("serverName");
    }

    public static String serverName;
}
