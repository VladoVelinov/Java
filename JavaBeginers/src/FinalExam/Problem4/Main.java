package FinalExam.Problem4;

import java.util.Scanner;

public class Main {
    static final String CAR = "car";
    static final String TRUCK = "truck";

    static final String DRIVE_COMMAND = "drive";
    static final String REFUEL_COMMAND = "refuel";

    public static void main(String[] args) {
        mainVehicles();
    }

    public static void mainVehicles() {
        String input;
        int numberOfCommands;
        String[] tokens;

        Car car = null;
        Truck truck = null;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 2; i++) {
            input = sc.nextLine();
            tokens = input.split(" ");
            String vehicleType = tokens[0].toLowerCase();
            double fuelQuantity = Double.parseDouble(tokens[1]);
            double fuelConsume = Double.parseDouble(tokens[2]);

            switch (vehicleType) {
                case "car":
                    car = new Car(fuelQuantity, fuelConsume);
                    break;
                case "truck":
                    truck = new Truck(fuelQuantity, fuelConsume);
                    break;
                default:
                    System.out.println("Invalid type!");
                    break;
            }
        }

        numberOfCommands = Integer.parseInt(sc.nextLine());

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

        if (tokens[0].equalsIgnoreCase(REFUEL_COMMAND)) {
            handleRefuelCommand(tokens[2], vehicle);
        }
    }

    private static void handleRefuelCommand(String token, Vehicle vehicle) {
        double fuel = Double.parseDouble(token);
        vehicle.refuel(fuel);
    }

    private static void handleDriveCommand(String token, Vehicle vehicle) {
        double distance = Double.parseDouble(token);
        String res = vehicle.drive(distance);
        System.out.println(res);
    }
}