/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package runapplication;
import java.util.Scanner;

/**
 *
 * @author dudle
 */

// Main class for running the application
public class RunApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the accident type: ");
        String vehicleType = scanner.nextLine();

        System.out.print("Enter the city for the vehicle accidents: ");
        String city = scanner.nextLine();

        System.out.print("Enter the number of accidents: ");
        int accidentTotal = scanner.nextInt();

        RoadAccidentReport report = new RoadAccidentReport(vehicleType, city, accidentTotal);
        report.printAccidentReport();

        scanner.close();
    }
}
