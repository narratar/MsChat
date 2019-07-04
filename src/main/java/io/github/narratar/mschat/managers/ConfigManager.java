package io.github.narratar.mschat.managers;

import io.github.narratar.mschat.MsChat;
import org.bukkit.configuration.file.FileConfiguration;

public class ConfigManager {

    private static int emptyMessagesOnClear;

    private static String noPermission;
    private static String wrongArgument;
    private static String spacerUp;
    private static String spacerDown;
    private static String chatClear;
    private static String chatOn;
    private static String chatOff;
    private static String chatIsDisabled;
    private static String chatIsEnabled;
    private static String helpPlugin;
    private static String helpOn;
    private static String helpOff;
    private static String helpClear;
    private static String helpInfo;
    private static String helpHelp;
    private static String helpAlias;

    public static void load() {
        MsChat.getInstance().saveDefaultConfig();
        FileConfiguration config = MsChat.getInstance().getConfig();

        emptyMessagesOnClear = config.getInt("emptyMessagesOnClear");

        noPermission = config.getString("messages.noPermission");
        wrongArgument = config.getString("messages.wrongArgument");
        spacerUp = config.getString("messages.spacerUp");
        spacerDown = config.getString("messages.spacerDown");
        chatClear = config.getString("messages.chatClear");
        chatOn = config.getString("messages.chatOn");
        chatOff = config.getString("messages.chatOff");
        chatIsDisabled = config.getString("messages.chatIsDisabled");
        chatIsEnabled = config.getString("messages.chatIsEnabled");
        helpPlugin = config.getString("help.plugin");
        helpOn = config.getString("help.onCmd");
        helpOff = config.getString("help.offCmd");
        helpClear = config.getString("help.clearCmd");
        helpInfo = config.getString("help.infoCmd");
        helpHelp = config.getString("help.helpCmd");
        helpAlias = config.getString("help.alias");
    }

    public static int getEmptyMessagesOnClear() {
        return emptyMessagesOnClear;
    }

    public static String getNoPermission() {
        return noPermission;
    }

    public static String getWrongArgument() {
        return wrongArgument;
    }

    public static String getSpacerUp() {
        return spacerUp;
    }

    public static String getSpacerDown() {
        return spacerDown;
    }

    public static String getChatClear() {
        return chatClear;
    }

    public static String getChatOn() {
        return chatOn;
    }

    public static String getChatOff() {
        return chatOff;
    }

    public static String getChatIsDisabled() {
        return chatIsDisabled;
    }

    public static String getChatIsEnabled() {
        return chatIsEnabled;
    }

    public static String getHelpPlugin() {
        return helpPlugin;
    }

    public static String getHelpOn() {
        return helpOn;
    }

    public static String getHelpOff() {
        return helpOff;
    }

    public static String getHelpClear() {
        return helpClear;
    }

    public static String getHelpInfo() {
        return helpInfo;
    }

    public static String getHelpHelp() {
        return helpHelp;
    }

    public static String getHelpAlias() {
        return helpAlias;
    }
}
