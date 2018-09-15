package OOP.inheritance.gandalfshmandalf;

public class Rodagast implements WizardHappiness {
    private int happiness;

    @Override
    public void eats(String food) {
        switch (food) {
            case "Cram":
                this.happiness += 2;
                break;
            case "Lembas":
                this.happiness += 3;
                break;
            case "Apple":
                this.happiness -= 10;
                break;
            case "Melon":
                this.happiness += 1;
                break;
            case "HoneyCake":
                this.happiness += 5;
                break;
            case "Mushrooms":
                this.happiness += 10;
                break;
            default:
                this.happiness -= 1;
                break;
        }
    }

    @Override
    public String GetMood() {
        if (this.happiness < -5)
            return "Angry";

        if (this.happiness >= -5 && this.happiness < 0)
            return "Sad";

        if (this.happiness >= 0 && this.happiness < 15)
            return "Happy";

        return "Rabbit";
    }
}