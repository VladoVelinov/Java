package OOP.inheritance.gandalfshmandalf;

public class Gandalf implements WizardHappiness {
    private int happiness;

    public void eats(String food) {
        switch (food) {
            case "Cram":
                this.happiness += 2;
                break;
            case "Lembas":
                this.happiness += 3;
                break;
            case "Apple":
                this.happiness += 1;
                break;
            case "Melon":
                this.happiness += 1;
                break;
            case "HoneyCake":
                this.happiness += 5;
                break;
            case "Mushrooms":
                this.happiness -= 10;
                break;
            default:
                this.happiness -= 1;
                break;
        }
    }

    public String GetMood() {

        if (this.happiness < -5)
            return "Angry";

        if (this.happiness >= -5 && this.happiness < 0)
            return "Sad";

        if (this.happiness >= 0 && this.happiness < 15)
            return "Happy";

        return "Javascript";
    }

    public int GetHappiness() {
        return this.happiness;
    }
}