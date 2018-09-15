package OOP.abstraction.telephony;

public class SmartPhone implements Callable, Browsable {
    @Override
    public void browse(String url) {
        if (containsDigits(url)) {
            System.out.println("Invalid URL!");
        } else {
            System.out.printf("Browsing: %s!%n", url);
        }
    }

    @Override
    public void call(String number) {
        if (containsCharacter(number)) {
            System.out.println("Invalid number!");
        } else {
            System.out.printf("Calling... %s%n", number);
        }
    }

    private boolean containsDigits(String url) {
        for (int i = 0; i < url.length(); i++) {
            if (Character.isDigit(url.charAt(i)))
                return true;
        }

        return false;
    }

    private boolean containsCharacter(String number) {
        for (int i = 0; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i)))
                return true;
        }

        return false;
    }
}