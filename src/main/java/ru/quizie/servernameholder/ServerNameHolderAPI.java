package ru.quizie.servernameholder;

/**
 * Класс для получения имени сервера в другом плагине
 * @author alexec0de
 */
public class ServerNameHolderAPI {


    /**
     * Метод, который возвращает название сервера на русском
     * @return название сервера
     */
    public String getServerName() {
        return Config.getServerName();
    }

    /**
     * Метод, который возвращает название сервера на английском
     * @return название сервера
     */
    public String getServerNamePlugin() {
        return Config.getServerNamePlugin();
    }

}
