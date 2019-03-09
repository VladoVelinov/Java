package OOP.abstraction;


import OOP.abstraction.Ferrari.Car;
import OOP.abstraction.Ferrari.Lada;
import OOP.abstraction.birthdaycelebrations.Pet;
import OOP.abstraction.bordercontrol.Robot;
import OOP.abstraction.collections.*;
import OOP.abstraction.foodshortage.Buyer;
import OOP.abstraction.foodshortage.Rebel;
import OOP.abstraction.interfaceperson.Citizen;
import OOP.abstraction.interfaceperson.Person;
import OOP.abstraction.militaryelite.*;
import OOP.abstraction.multipleimplementation.Birthable;
import OOP.abstraction.multipleimplementation.Identifiable;
import OOP.abstraction.telephony.SmartPhone;

import java.lang.reflect.Method;
import java.util.*;


public class abstraction {
    public static void main(String[] args) {
        collectionsMain();
    }

    public static void collectionsMain(){
        AddCollection<Integer> ac;
        AddRemoveCollection<Integer> arc;
        MyList<Integer> ml;

        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] tokens = input.split(" ");

        ac = new AddCollectionArray(tokens.length);
        arc = new AddRemoveCollectionArray(tokens.length);
        ml = new MyListArray(tokens.length);

        for (String str : tokens){
            System.out.print(ac.add(Integer.parseInt(str)) + " ");
        }
        System.out.println();
        for (String str : tokens){
            System.out.print(arc.add(Integer.parseInt(str)) + " ");
        }
        System.out.println();
        for (String str : tokens){
            System.out.print(ml.add(Integer.parseInt(str)) + " ");
        }
        System.out.println();

        input = sc.nextLine();
        int timesToRemove = Integer.parseInt(input);

        for (int i = 0; i < timesToRemove; i++) {
            System.out.print(arc.remove() + " ");
        }
        System.out.println();
        for (int i = 0; i < timesToRemove; i++) {
            System.out.print(ml.remove() + " ");
        }
        System.out.println();
    }

    public static void militaryEliteMain(){
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<Private> privates = new ArrayList<>();

        while (!input.equalsIgnoreCase("end")){
            String[] tokens = input.split(" ");
            switch (tokens[0].toLowerCase()){
                case "private" :
                    Private privat = new Private(tokens);
                    privates.add(privat);
                    System.out.println(privat.toString());
                    break;
                case "leutenantgeneral" :
                    LeutenantGeneral leutenantGeneral = new LeutenantGeneral(tokens, privates);
                    System.out.println(leutenantGeneral.toString());
                    break;
                case "engineer" :
                    try {
                        Engineer engineer = new Engineer(tokens);
                        System.out.println(engineer.toString());
                    } catch (IllegalArgumentException iae){
                        //do nothing
                    }
                    break;
                case "commando" :
                    try {
                        Commando commando = new Commando(tokens);
                        System.out.println(commando.toString());
                    }catch (IllegalArgumentException iae){
                        //do nothing
                    }
                    break;
                case "spy" :
                    Spy spy = new Spy(tokens);
                    System.out.println(spy.toString());
                    break;
                default:
                    break;
            }

            input = sc.nextLine();
        }
    }

    public static void foodShortageMain() {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        int n = Integer.parseInt(input);
        Buyer[] buyers = new Buyer[n];
        String[] tokens;

        for (int i = 0; i < n; i++) {
            input = sc.nextLine();
            tokens = input.split(" ");
            CreateBuyer(buyers, tokens, i);
        }
        // implement buy
        // while input it's not end
        int totalAmount = 0;
        //read from console
        input = sc.nextLine();
        while (!input.equalsIgnoreCase("end")) {
            // call buy
            for (int j = 0; j < buyers.length; j++) {
                if (input.equalsIgnoreCase(buyers[j].getName())) {
                    totalAmount += buyers[j].buyFood();
                }
            }
            input = sc.nextLine();
        }
        System.out.println(totalAmount);


    }

    public static void birthdaycelebrations() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<Birthable> birthables = new ArrayList<>();

        while (!input.equalsIgnoreCase("end")) {
            String[] tokens = input.split(" ");
            Birthable birthable;
            switch (tokens[0].toLowerCase()) {
                case "citizen":
                    birthable = new Citizen(tokens[1],
                            Integer.parseInt(tokens[2]),
                            tokens[3], tokens[4]);
                    birthables.add(birthable);
                    break;
                case "pet":
                    birthable = new Pet(tokens[1], tokens[2]);
                    birthables.add(birthable);
                    break;
                default:
                    break;
            }

            input = sc.nextLine();
        }

        String year = sc.nextLine();

        for (Birthable birthable : birthables) {
            String birthDate = birthable.getBirthDate();

            if (birthDate.endsWith(year)) {
                System.out.println(birthDate);
            }
        }
    }

    public static void borderControlMain() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        ArrayList<Identifiable> checked = new ArrayList<>();

        while (!input.equalsIgnoreCase("end")) {
            String[] tokens = input.split(" ");
            if (tokens.length == 2) {
                //robot
                Identifiable robot = new Robot(tokens[0], tokens[1]);
                checked.add(robot);
            }

            if (tokens.length == 3) {
                //citizen
                Identifiable citizen = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                checked.add(citizen);

            }

            input = sc.nextLine();
        }

        String invalidEnd = sc.nextLine();

        for (Identifiable check : checked) {
            String checkId = check.getId();

            if (checkId.endsWith(invalidEnd)) {
                System.out.println(checkId);
            }
        }
    }

    public static void telephonyMain() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String[] numbers = input.split(" ");
        input = sc.nextLine();
        String[] urls = input.split(" ");

        SmartPhone sm = new SmartPhone();

        for (String number : numbers) {
            sm.call(number);
        }

        for (String url : urls) {
            sm.browse(url);
        }
    }

    public static void ferrariMain() {
        Car car = new Lada("Dinko");
        System.out.println(car.toString());
    }

    public static void multipleImplementationMain() {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Birthable.class)
                && Arrays.asList(citizenInterfaces).contains(Identifiable.class)) {
            Method[] methods = Birthable.class.getDeclaredMethods();
            methods = Identifiable.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            String id = scanner.nextLine();
            String birthdate = scanner.nextLine();
            Identifiable identifiable = new Citizen(name, age, id, birthdate);
            Birthable birthable = new Citizen(name, age, id, birthdate);
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());
            System.out.println(methods.length);
            System.out.println(methods[0].getReturnType().getSimpleName());

        }
    }

    public static void interfacePersonMain() {
        Class[] citizenInterfaces = Citizen.class.getInterfaces();
        if (Arrays.asList(citizenInterfaces).contains(Person.class)) {
            Method[] fields = Person.class.getDeclaredMethods();
            Scanner scanner = new Scanner(System.in);
            String name = scanner.nextLine();
            int age = Integer.parseInt(scanner.nextLine());
            Person person = new Citizen(name, age);
            System.out.println(fields.length);
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }
    }

    private static boolean isNameTaken(String name, Buyer[] buyers) {
        for (Buyer buyer : buyers) {
            if (buyer != null) {
                if (buyer.getName().equalsIgnoreCase(name))
                    return true;
            }
        }
        return false;
    }

    private static void CreateBuyer(Buyer[] buyers, String[] tokens, int i) {

        if (isNameTaken(tokens[0], buyers))
            System.out.printf("Name %s is taken!%n", tokens[0]);
        else {
            Buyer buyer = null;
            switch (tokens.length) {
                case 3:
                    buyer = new Rebel(tokens[0], Integer.parseInt(tokens[1]), tokens[2]);
                    break;
                case 4:
                    buyer = new Citizen(tokens[0], Integer.parseInt(tokens[1]), tokens[2], tokens[3]);
                    break;
                default:
                    break;
            }
            buyers[i] = buyer;
        }
    }
}