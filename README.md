#  ServerNameHolder

## 📝 Описание
**ServerNameHolder** — это плагин на Java для Minecraft-серверов, который позволяет легко управлять названием сервера! После установки он автоматически создаёт файл `serverNameHolder.yml` в корневой папке, содержащий параметр:

```yaml
serverName: "Лайт #1"
```

### Преимущества:
- Идеален для больших проектов
- Позволяет менять название сервера в один клик
- Без необходимости редактировать конфиги вручную

## 📥 Установка
1. Скачайте `ServerNameHolder.jar`
2. Переместите его в папку `plugins` вашего сервера
3. Перезапустите сервер

## 🔗 Зависимости
- [PlaceholderAPI](https://www.spigotmc.org/resources/placeholderapi.6245/) (Обязательно)

## ⚙️ Конфигурация
После первого запуска появится файл `serverNameHolder.yml`, в котором можно изменить название сервера:

```yaml
serverName: "Лайт #1"
```

Измените значение `serverName` на нужное вам и перезапустите сервер.

### Ограничения
- HEX-цвета не поддерживаются

**Как окрасить название режима:**
<br>
Для этого будем использовать градиенты в формате "Чат (<#rrggbb>)"
1. Выберите первый цвет RGB: `&#00d8ff` → `<#00d8ff>`
2. Выберите второй цвет RGB: `&#ADF3FD` → `</#ADF3FD>` (важно! `/` перед `#`)

**Пример применения:**
```yaml
<#D430FB>%servername%</#EAADFF>
```

## Плейсхолдеры
- `%servername%` — отображает название сервера из конфига

## Скриншоты
![image](https://github.com/user-attachments/assets/99b3c2ba-12b6-4b9e-9027-f9131a423cc2)
![image](https://github.com/user-attachments/assets/ac232260-c401-4eb6-97c8-428ebc0825b4)
![image](https://github.com/user-attachments/assets/085a8332-5a9b-4522-b3ff-e0185fb70dab)
![image](https://github.com/user-attachments/assets/1254254b-f3f0-4cf9-a97a-509062743923)

## 📜 Лицензия
Этот проект распространяется под лицензией MIT

## 📬 Контакты
- **Автор:** Quizie
- **Telegram:** [@quizie_dev](https://t.me/quizie_dev)

