package Testing;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static Testing.CharSwitchRobot.charSwitchRobot;
import static java.lang.Thread.sleep;

public class ScriptingRobot {
    public static void main(String[] args) throws IOException, AWTException, IllegalAccessException, InterruptedException, NoSuchFieldException {
        String filePath = "d:/Script.txt";
        String line;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
//        Runtime.getRuntime().exec("notepad");
//        sleep (5000);

        while ((line = reader.readLine()) != null) {
            Robot bot = new Robot();
            bot.keyPress(KeyEvent.VK_ALT);
            bot.keyPress(KeyEvent.VK_TAB);
            sleep(100);
            bot.keyRelease(KeyEvent.VK_ALT);
            bot.keyRelease(KeyEvent.VK_TAB);
            sleep(100);
            bot.keyPress(KeyEvent.VK_ENTER);
            sleep(100);
            bot.keyRelease(KeyEvent.VK_ENTER);
            sleep(100);
            charSwitchRobot(line);
            sleep(100);
            bot.keyPress(KeyEvent.VK_ENTER);
            sleep(100);
            bot.keyRelease(KeyEvent.VK_ENTER);
            sleep(100);
        }
        reader.close();
    }
}
