package ru.quizie.servernameholder;

import me.clip.placeholderapi.PlaceholderAPI;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.YamlConfiguration;
import org.bukkit.plugin.PluginManager;
import org.bukkit.plugin.java.JavaPlugin;
import ru.quizie.servernameholder.placeholders.ServerNamePlaceholder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public final class ServerNameHolder extends JavaPlugin {

    @Override
    public void onEnable() {
        final PluginManager pluginManager = Bukkit.getPluginManager();

        if (!pluginManager.isPluginEnabled("PlaceholderAPI")) {
            this.getLogger().log(new LogRecord(Level.WARNING, "Плагин PlaceholderAPI не был найден. Плагин выключается.."));
            pluginManager.disablePlugin(this);
            return;
        }

        this.initConfiguration();
        new ServerNamePlaceholder().register();

    }

    private void initConfiguration() {
        final File file = new File("./serverNameHolder.yml");
        if (!file.exists()) {
            try {
                file.createNewFile();

                final YamlConfiguration config = YamlConfiguration.loadConfiguration(file);
                config.set("serverName", "Лайт #1");
                config.save(file);

            } catch (IOException ignored) {
            }
        }
        Config.load(YamlConfiguration.loadConfiguration(file));

    }

}
