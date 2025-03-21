package ru.quizie.servernameholder.placeholders;

import me.clip.placeholderapi.expansion.PlaceholderExpansion;
import org.bukkit.OfflinePlayer;
import org.jetbrains.annotations.NotNull;
import ru.quizie.servernameholder.Config;

public class ServerNamePlaceholder extends PlaceholderExpansion {
    @Override
    public String getIdentifier() {
        return "servername";
    }

    @Override
    public String getAuthor() {
        return "Quizie";
    }

    @Override
    public String getVersion() {
        return "1.0.0";
    }

    @Override
    public String onRequest(OfflinePlayer player, @NotNull String string) {
        if (string.equalsIgnoreCase("plugin")) {
            return Config.getServerNamePlugin();
        }
        return Config.getServerName();
    }

}
