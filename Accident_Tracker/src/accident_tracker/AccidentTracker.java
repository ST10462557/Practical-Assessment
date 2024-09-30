/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accident_tracker;
import java.util.Scanner;

/**
 *
 * @author dudle
 */
public class AccidentTracker {
    private City[] cities;
    private Scanner scanner;

    // Naming of all 3 citites
    public AccidentTracker() {
        cities = new City[3];
        cities[0] = new City("Cape Town");
        cities[1] = new City("Johannesburg");
        cities[2] = new City("Port Elizabeth");
        scanner = new Scanner(System.in);
    }
// Printing out the prompt as well as the city
    public void inputData() {
        for (City city : cities) {
            System.out.print("Enter the number of car accidents for " + city.getName() + ": ");
            city.setCarAccidents(scanner.nextInt());
            System.out.print("Enter the number of moto bike accidents for " + city.getName() + ": ");
            city.setMotoBikeAccidents(scanner.nextInt());
        }
    }
// Displaying to the consol
    public void displayReport() {
        System.out.println("------------------");
        System.out.println("ROAD ACCIDENT REPORT");
        System.out.println("------------------");
        System.out.println("\t\t\tCAR\t\tMOTO BIKE");

        for (City city : cities) {
            System.out.printf("%-20s%d\t\t%d%n", city.getName(), city.getCarAccidents(), city.getMotoBikeAccidents());
        }

        System.out.println("------------------");
        System.out.println("ROAD ACCIDENT TOTALS FOR EACH CITY");
        System.out.println("-----------------------");
        for (City city : cities) {
            System.out.printf("%-20s%d%n", city.getName(), city.getTotalAccidents());
        }
        System.out.println("------------------");
    }

    public void closeScanner() {
        scanner.close();
    }
}