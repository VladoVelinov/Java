package OOP.createobjects;

import java.util.Random;

public class Scam {
    private String[] praises = {
            "Продуктът е отличен.",
            "Това е страхотен продукт.",
            "Постоянно ползвам този продукт.",
            "Това е най-добрият продукт от тази категория."};

    private String[] successStories = {
            "Вече се чувствам добре.",
            "Успях да се променя.",
            "Той направи чудо.",
            "Не мога да повярвам, но вече се чувствам страхотно.",
            "Опитайте и вие. Аз съм много доволна."};

    private String[] firstNames = {"Диана", "Петя", "Стела", "Елена", "Катя"};
    private String[] lastNames = {"Иванова", "Петрова", "Кирова"};
    private String[] cities = {"София", "Пловдив", "Варна", "Русе", "Бургас"};

    private String praise;
    private String successStory;
    private String firstName;
    private String lastName;
    private String city;

    public void printScam() {
        generateScam();
        System.out.printf("%s %s -- %s %s, %s%n", this.praise, this.successStory, this.firstName, this.lastName, this.city);
    }

    private void generateScam() {
        Random random = new Random();

        this.praise = praises[random.nextInt(praises.length)];
        this.successStory = successStories[random.nextInt(successStories.length)];
        this.firstName = firstNames[random.nextInt(firstNames.length)];
        this.lastName = lastNames[random.nextInt(lastNames.length)];
        this.city = cities[random.nextInt(cities.length)];
    }
}