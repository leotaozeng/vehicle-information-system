import interfaces.Vehicle;
import interfaces.CarVehicle;
import interfaces.MotorVehicle;
import interfaces.TruckVehicle;

import models.Car;
import models.Motorcycle;
import models.Truck;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    Scanner input = new Scanner(System.in);  // Create a Scanner object
    ArrayList<Vehicle> vehicles = new ArrayList<>();

    public static void main(String[] args) {
        Main system = new Main();
        system.run();
    }

    public void run() {
        try {
            int choice;
            do {
                // Allow the user to create objects of different vehicle types
                System.out.println("\nWelcome to the Vehicle Information System!\nSelect a vehicle type to create:");
                System.out.println("1. Car");
                System.out.println("2. Motorcycle");
                System.out.println("3. Truck");
                System.out.println("4. Display Vehicle Details");
                System.out.println("5. Exit");
                System.out.print("Enter your choice: "); // The print() method does not move the cursor to a new line.

                // Get the user's choice
                choice = getIntInput(input);

                if (choice >= 1 && choice <= 3) {
                    Vehicle vehicle = createVehicle(choice);
                    if (vehicle != null) {
                        vehicles.add(vehicle);
                        System.out.println("Vehicle created successfully!");
                    }
                } else if (choice == 4) {
                    displayVehicleDetails();
                } else if (choice == 5) {
                    System.out.println("Exiting...");
                    break;
                } else {
                    // Handle invalid input and display appropriate error messages
                    System.out.println("Invalid choice. Please try again.");
                }
            } while (true);
        } finally {
            System.out.println("Goodbye!");
            // Close the input in a finally block to ensure it's always closed
            input.close();
        }
    }

    public Vehicle createVehicle(int choice) {
        System.out.print("Enter vehicle make: ");
        String vehicleMake = input.nextLine(); // Read a String value from the user

        System.out.print("Enter vehicle model: ");
        String vehicleModel = input.nextLine();

        System.out.print("Enter vehicle year of manufacture: ");
        int vehicleYear = getIntInput(input);

        // Switch statements to perform actions based on the user's choice
        switch (choice) {
            case 1:
                // Create Car object
                Car car = new Car(vehicleMake, vehicleModel, vehicleYear);

                System.out.print("Enter number of doors: ");
                car.setNumberOfDoors(getIntInput(input));

                System.out.print("Enter fuel type: ");
                car.setFuelType(input.nextLine());

                return car;
            case 2:
                // Create Motorcycle object
                Motorcycle motorcycle = new Motorcycle(vehicleMake, vehicleModel, vehicleYear);

                System.out.print("Enter number of wheels: ");
                motorcycle.setNumberOfWheels(getIntInput(input));

                System.out.print("Enter motorcycle type: ");
                motorcycle.setMotorcycleType(input.nextLine());

                return motorcycle;
            case 3:
                // Create Truck object
                Truck truck = new Truck(vehicleMake, vehicleModel, vehicleYear);

                System.out.print("Enter cargo capacity: ");
                truck.setCargoCapacity(input.nextDouble());
                input.nextLine(); // Consume newline

                System.out.print("Enter transmission type: ");
                truck.setTransmissionType(input.nextLine());

                return truck;
            default:
                return null;
        }
    }

    public void displayVehicleDetails() {
        if (vehicles.isEmpty()) {
            System.out.println("No vehicles found!");
        } else {
            System.out.println("Vehicle Details:");
            for (int i = 0; i < vehicles.size(); i++) {
                Vehicle vehicle = vehicles.get(i);

                System.out.println("\nVehicle " + (i + 1) + ":");
                System.out.println("Make: " + vehicle.getMake());
                System.out.println("Model: " + vehicle.getModel());
                System.out.println("Year: " + vehicle.getYearOfManufacture());

                switch (vehicle) {
                    case CarVehicle car -> {
                        System.out.println("Number of Doors: " + car.getNumberOfDoors());
                        System.out.println("Fuel Type: " + car.getFuelType());
                    }
                    case MotorVehicle motor -> {
                        System.out.println("Number of Wheels: " + motor.getNumberOfWheels());
                        System.out.println("Motorcycle Type: " + motor.getMotorcycleType());
                    }
                    case TruckVehicle truck -> {
                        System.out.println("Cargo Capacity: " + truck.getCargoCapacity() + " tons");
                        System.out.println("Transmission Type: " + truck.getTransmissionType());
                    }
                    default -> {
                    }
                }
            }
        }
    }

    public int getIntInput(Scanner input) {
        while (true) {
            try {
                return Integer.parseInt(input.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a valid number: ");
            }
        }
    }
}