package util;


import org.junit.Before;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;

/**
 * Created by jun26 on 2016-04-01.
 */

public class LocalizerTest {
    @Before
    public void before() throws Exception {
        Localizer.getInstance().changeLanguageFile(new FileInputStream(new File("S:\\Programming\\Undercast1.8.9\\src\\main\\test\\io\\github\\smartsteves\\undercast\\util\\DL.json")));
        assert Localizer.getInstance().getLocalizeString("Setting.Error.FileNotFound").equals("SFNF");
    }

    @Test
    public void localizeMessageTest() {
        System.out.println(Localizer.getInstance().getLocalizeString("Setting.Error.FileNotFound"));
    }

}
