package io.github.smartsteves.undercast.util;

import com.google.gson.JsonElement;
import com.google.gson.JsonParser;
import net.minecraft.client.Minecraft;
import net.minecraft.util.ChatComponentText;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.Logger;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Created by jun26 on 2016-03-30.
 */
public class Localizer {
    private static Localizer INSTANCE;

    static {
        INSTANCE = new Localizer();
    }

    private JsonElement lang;
    private Logger logger;

    private Localizer() {
        //TODO: Fix getResourceAsStream() error
        JsonParser parser = new JsonParser();
        //lang = parser.parse(new InputStreamReader(getClass().getResourceAsStream("DefaultLocalizer.json")));
    }

    public static Localizer getInstance() {
        return INSTANCE;
    }

    public void log(Level level, String message, String... args) {
        logger.log(level, getLocalizeString(message, args));
    }

    public void logUnLocalizeMessage(Level level, String message) {
        logger.log(level, message);
    }

    public void chat(String message, String... args) {
        chatUnlocalizeMessage(getLocalizeString(message, args));
    }

    public void chatUnlocalizeMessage(String message) {
        Minecraft.getMinecraft().thePlayer.addChatComponentMessage(new ChatComponentText(message));
    }

    public String getLocalizeString(String message, String... args) {
        StringTokenizer tokenizer = new StringTokenizer(".");
        JsonElement temp = lang;
        while (tokenizer.hasMoreTokens()) {
            temp = temp.getAsJsonObject().get(tokenizer.nextToken());
            if (temp == null)
                return "Cannot Find String \"" + message + "\"";
        }
        String msg = temp.getAsString();
        for (int i = 0; i < args.length; i++) {
            msg.replaceAll("{" + i + "}", args[i]);
        }
        return msg;
    }

    public void changeLanguageFile(InputStream inputStream) {
        JsonParser parser = new JsonParser();
        lang = parser.parse(new InputStreamReader(inputStream));
    }
}
