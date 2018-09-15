package OOP.polymorphism;

import OOP.polymorphism.vehicles.Bus;
import OOP.polymorphism.vehicles.Car;
import OOP.polymorphism.vehicles.Truck;
import OOP.polymorphism.vehicles.Vehicle;
import OOP.polymorphism.wildfarm.animal.*;
import OOP.polymorphism.wildfarm.food.Food;
import OOP.polymorphism.wildfarm.food.Meat;
import OOP.polymorphism.wildfarm.food.Vegetable;

import java.util.ArrayList;
import java.util.Scanner;

public class polymorphism {
    static final String CAR = "car";
    static final String TRUCK = "truck";

    static final String DRIVE_COMMAND = "drive";
    static final String DRIVE_EMPTY_COMMAND = "driveempty";
    static final String REFUEL_COMMAND = "refuel";

    public static void main(String[] args) {
//      Tiger tiger = new Tiger("tiger", "name", 100, "Asia");
//
//      tiger.makeSound();
        mainWildFarm();
    }

    private static void mainWildFarm() {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int inputCount = 0;
        ArrayList<Mammal> mammals = new ArrayList<>();

        Mammal mammal = null;
        while(!input.equalsIgnoreCase("end")){

            if(inputCount % 2 == 0){
                String[] tokens = input.split(" ");

                switch (tokens[0].toLowerCase()){
                    case "mouse" :
                        mammal = new Mouse(tokens[0],
                                tokens[1],
                                Double.parseDouble(tokens[2]),
                                tokens[3]);
                        break;
                    case "zebra":
                        mammal = new Zebra(tokens[0],
                                tokens[1],
                                Double.parseDouble(tokens[2]),
                                tokens[3]);
                        break;
                    case "tiger":
                        mammal = new Tiger(tokens[0],
                                tokens[1],
                                Double.parseDouble(tokens[2]),
                                tokens[3]);
                        break;
                    case "cat":
                        mammal = new Cat(tokens[0],
                                tokens[1],
                                Double.parseDouble(tokens[2]),
                                tokens[3],
                                tokens[4]);
                        break;
                    default:
                        break;
                }

                mammals.add(mammal);
            }else {
                String[] tokens = input.split(" ");
                Food food = null;

                switch (tokens[0].toLowerCase()){
                    case "meat" :
                        food = new Meat(Integer.parseInt(tokens[1]));
                        break;
                    case "vegetable" :
                        food = new Vegetable(Integer.parseInt(tokens[1]));
                        break;
                    default:
                        break;
                }

                mammal.eat(food);
            }

            input = sc.nextLine();
            inputCount++;
        }

 /*       for (Mammal animal : mammals) {
            System.out.println(animal.toString());
        }*/

        System.out.println(mammals.toString());

    }

    public static void mainVehicles() {
        String input;
        int numberOfCommands;
        String[] tokens;

        Car car = null;
        Truck truck = null;
        Bus bus = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            input = sc.nextLine();
            tokens = input.split(" ");
            String vehicleType = tokens[0].toLowerCase();
            double fuelQuantity = Double.parseDouble(tokens[1]);
            double fuelConsume = Double.parseDouble(tokens[2]);
            double tankCapacity = Double.parseDouble(tokens[3]);

            switch (vehicleType){
                case "car" :
                    car = new Car(fuelQuantity, fuelConsume, tankCapacity);
                    break;
                case "truck" :
                    truck = new Truck(fuelQuantity, fuelConsume, tankCapacity);
                    break;
                case"bus":
                    bus = new Bus(fuelQuantity, fuelConsume, tankCapacity);
                    break;
                default:
                    System.out.println("Invalid type");
                    break;
            }
        }

        numberOfCommands = Integer.parseInt(sc.nextLine());

        //take numberOfCommands
        for (int i = 0; i < numberOfCommands; i++) {
            tokens = sc.nextLine().split(" ");

            if (tokens[1].equalsIgnoreCase(CAR)) {
                handleCommand(tokens, car);
            }

            if (tokens[1].equalsIgnoreCase(TRUCK)) {
                handleCommand(tokens, truck);
            }
        }

        System.out.println(car.toString());
        System.out.println(truck.toString());
    }

    private static void handleCommand(String[] tokens, Vehicle vehicle) {
        if (tokens[0].equalsIgnoreCase(DRIVE_COMMAND)) {
            handleDriveCommand(tokens[2], vehicle);
        }

        if (tokens[0].equalsIgnoreCase(DRIVE_EMPTY_COMMAND)) {
            handleDriveEmptyCommand(tokens[2], vehicle);
        }

        if (tokens[0].equalsIgnoreCase(REFUEL_COMMAND)) {
            handleRefuelCommand(tokens[2], vehicle);
        }
    }

    private static void handleDriveEmptyCommand(String token, Vehicle vehicle) {
        Bus bus = (Bus)vehicle;
        bus.setEmpty(true);

        handleDriveCommand(token, vehicle);
    }

    private static void handleRefuelCommand(String token, Vehicle vehicle) {
        double fuel = Double.parseDouble(token);
        String res = vehicle.refuel(fuel);
        System.out.println(res);
    }

    private static void handleDriveCommand(String token, Vehicle vehicle) {
        double distance = Double.parseDouble(token);
        String res = vehicle.drive(distance);
        System.out.println(res);
    }

}