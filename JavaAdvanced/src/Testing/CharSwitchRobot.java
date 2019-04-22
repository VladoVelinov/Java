package Testing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.lang.reflect.Field;

class CharSwitchRobot {

    private static Robot bot;

    static {
        try {
            bot = new Robot();
        } catch (AWTException e) {
            e.printStackTrace();
        }
    }

    static void charSwitchRobot(String value) throws SecurityException, NoSuchFieldException, IllegalArgumentException, IllegalAccessException {
        boolean shiftOn = false;
        String key = null;
        int keyCode = 0;
        char[] character = new char[value.length()];
        for (int index = 0; index < value.length(); index++) {
            character[index] = value.charAt(index);
        }
        for (char c : character) {
            switch (c) {
                case ' ':
                    key = "VK_SPACE";
                    shiftOn = false;
                    break;
                case 'a':
                    key = "VK_A";
                    shiftOn = false;
                    break;
                case 'b':
                    key = "VK_B";
                    shiftOn = false;
                    break;
                case 'c':
                    key = "VK_C";
                    shiftOn = false;
                    break;
                case 'd':
                    key = "VK_D";
                    shiftOn = false;
                    break;
                case 'e':
                    key = "VK_E";
                    shiftOn = false;
                    break;
                case 'f':
                    key = "VK_F";
                    shiftOn = false;
                    break;
                case 'g':
                    key = "VK_G";
                    shiftOn = false;
                    break;
                case 'h':
                    key = "VK_H";
                    shiftOn = false;
                    break;
                case 'i':
                    key = "VK_I";
                    shiftOn = false;
                    break;
                case 'j':
                    key = "VK_J";
                    shiftOn = false;
                    break;
                case 'k':
                    key = "VK_K";
                    shiftOn = false;
                    break;
                case 'l':
                    key = "VK_L";
                    shiftOn = false;
                    break;
                case 'm':
                    key = "VK_M";
                    shiftOn = false;
                    break;
                case 'n':
                    key = "VK_N";
                    shiftOn = false;
                    break;
                case 'o':
                    key = "VK_O";
                    shiftOn = false;
                    break;
                case 'p':
                    key = "VK_P";
                    shiftOn = false;
                    break;
                case 'q':
                    key = "VK_Q";
                    shiftOn = false;
                    break;
                case 'r':
                    key = "VK_R";
                    shiftOn = false;
                    break;
                case 's':
                    key = "VK_S";
                    shiftOn = false;
                    break;
                case 't':
                    key = "VK_T";
                    shiftOn = false;
                    break;
                case 'u':
                    key = "VK_U";
                    shiftOn = false;
                    break;
                case 'v':
                    key = "VK_V";
                    shiftOn = false;
                    break;
                case 'w':
                    key = "VK_W";
                    shiftOn = false;
                    break;
                case 'x':
                    key = "VK_X";
                    shiftOn = false;
                    break;
                case 'y':
                    key = "VK_Y";
                    shiftOn = false;
                    break;
                case 'z':
                    key = "VK_Z";
                    shiftOn = false;
                    break;
                case 'A':
                    key = "VK_A";
                    shiftOn = true;
                    break;
                case 'B':
                    key = "VK_B";
                    shiftOn = true;
                    break;
                case 'C':
                    key = "VK_C";
                    shiftOn = true;
                    break;
                case 'D':
                    key = "VK_D";
                    shiftOn = true;
                    break;
                case 'E':
                    key = "VK_E";
                    shiftOn = true;
                    break;
                case 'F':
                    key = "VK_F";
                    shiftOn = true;
                    break;
                case 'G':
                    key = "VK_G";
                    shiftOn = true;
                    break;
                case 'H':
                    key = "VK_H";
                    shiftOn = true;
                    break;
                case 'I':
                    key = "VK_I";
                    shiftOn = true;
                    break;
                case 'J':
                    key = "VK_J";
                    shiftOn = true;
                    break;
                case 'K':
                    key = "VK_K";
                    shiftOn = true;
                    break;
                case 'L':
                    key = "VK_L";
                    shiftOn = true;
                    break;
                case 'M':
                    key = "VK_M";
                    shiftOn = true;
                    break;
                case 'N':
                    key = "VK_N";
                    shiftOn = true;
                    break;
                case 'O':
                    key = "VK_O";
                    shiftOn = true;
                    break;
                case 'P':
                    key = "VK_P";
                    shiftOn = true;
                    break;
                case 'Q':
                    key = "VK_Q";
                    shiftOn = true;
                    break;
                case 'R':
                    key = "VK_R";
                    shiftOn = true;
                    break;
                case 'S':
                    key = "VK_S";
                    shiftOn = true;
                    break;
                case 'T':
                    key = "VK_T";
                    shiftOn = true;
                    break;
                case 'U':
                    key = "VK_U";
                    shiftOn = true;
                    break;
                case 'V':
                    key = "VK_V";
                    shiftOn = true;
                    break;
                case 'W':
                    key = "VK_W";
                    shiftOn = true;
                    break;
                case 'X':
                    key = "VK_X";
                    shiftOn = true;
                    break;
                case 'Y':
                    key = "VK_Y";
                    shiftOn = true;
                    break;
                case 'Z':
                    key = "VK_Z";
                    shiftOn = true;
                    break;
                case '0':
                    key = "VK_0";
                    shiftOn = false;
                    break;
                case '1':
                    key = "VK_1";
                    shiftOn = false;
                    break;
                case '2':
                    key = "VK_2";
                    shiftOn = false;
                    break;
                case '3':
                    key = "VK_3";
                    shiftOn = false;
                    break;
                case '4':
                    key = "VK_4";
                    shiftOn = false;
                    break;
                case '5':
                    key = "VK_5";
                    shiftOn = false;
                    break;
                case '6':
                    key = "VK_6";
                    shiftOn = false;
                    break;
                case '7':
                    key = "VK_7";
                    shiftOn = false;
                    break;
                case '8':
                    key = "VK_8";
                    shiftOn = false;
                    break;
                case '9':
                    key = "VK_9";
                    shiftOn = false;
                    break;
                case ')':
                    key = "VK_0";
                    shiftOn = true;
                    break;
                case '!':
                    key = "VK_1";
                    shiftOn = true;
                    break;
                case '@':
                    key = "VK_2";
                    shiftOn = true;
                    break;
                case '#':
                    key = "VK_3";
                    shiftOn = true;
                    break;
                case '$':
                    key = "VK_4";
                    shiftOn = true;
                    break;
                case '%':
                    key = "VK_5";
                    shiftOn = true;
                    break;
                case '^':
                    key = "VK_6";
                    shiftOn = true;
                    break;
                case '&':
                    key = "VK_7";
                    shiftOn = true;
                    break;
                case '*':
                    key = "VK_8";
                    shiftOn = true;
                    break;
                case '(':
                    key = "VK_9";
                    shiftOn = true;
                    break;
                case '-':
                    key = "VK_OEM_MINUS";
                    shiftOn = false;
                    break;
                case '_':
                    key = "VK_OEM_MINUS";
                    shiftOn = true;
                    break;
                case '[':
                    key = "VK_OEM_4";
                    shiftOn = false;
                    break;
                case '{':
                    key = "VK_OEM_4";
                    shiftOn = true;
                    break;
                case ']':
                    key = "VK_OEM_6";
                    shiftOn = false;
                    break;
                case '}':
                    key = "VK_OEM_6";
                    shiftOn = true;
                    break;
                case '|':
                    key = "VK_OEM_102";
                    shiftOn = true;
                    break;
                case ';':
                    key = "VK_SEMICOLON";
                    shiftOn = false;
                    break;
                case ':':
                    key = "VK_SEMICOLON";
                    shiftOn = true;
                    break;
                case '"':
                    key = "VK_OEM_7";
                    shiftOn = true;
                    break;
                case ',':
                    key = "VK_COMMA";
                    shiftOn = false;
                    break;
                case '<':
                    key = "VK_COMMA";
                    shiftOn = true;
                    break;
                case '.':
                    key = "VK_PERIOD";
                    shiftOn = false;
                    break;
                case '>':
                    key = "VK_PERIOD";
                    shiftOn = true;
                    break;
                case '/':
                    key = "VK_SLASH";
                    shiftOn = false;
                    break;
                case '?':
                    key = "VK_SLASH";
                    shiftOn = true;
                    break;
                case '\'':
                    key = "VK_QUOTE";
                    shiftOn = false;
                    break;
                default:
                    System.out.println("Keyboard: Invalid Value");
                    break;
            }
            KeyEvent ke = new KeyEvent(new JTextField(), 0, 0, 0, 0, ' ');
            Class clazz = ke.getClass();
            Field field = null;
            if (key != null) {
                field = clazz.getField(key);
            }
            if (field != null) {
                keyCode = field.getInt(ke);
            }
            if (shiftOn) {
                bot.keyPress(KeyEvent.VK_SHIFT);
            }
            bot.keyPress(keyCode);
            if (shiftOn) {
                bot.keyRelease(KeyEvent.VK_SHIFT);
            }
//            sleep(5);
        }
    }
}