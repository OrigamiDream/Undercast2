package undercast.setting;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import io.github.smartsteves.undercast.util.Localizer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

/**
 * Created by jun26 on 2016-03-29.
 */
public class Setting {
    private static SettingJson settingJson;

    public static void init(File file) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        try {
            settingJson = gson.fromJson(new InputStreamReader(new FileInputStream(file)), SettingJson.class);
        } catch (FileNotFoundException e) {
            Localizer.getInstance().chat("Setting.Error.FileNotFound");
        }
    }

    public static SettingJson setting() {
        return settingJson;
    }
}
