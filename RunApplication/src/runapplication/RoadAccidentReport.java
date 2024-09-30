/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package runapplication;

/**
 *
 * @author dudle
 */

// Displaying of the road accident report
public class RoadAccidentReport extends RoadAccidents {
    public RoadAccidentReport(String vehicleType, String city, int accidentTotal) {
        super(vehicleType, city, accidentTotal);
    }

    public void printAccidentReport() {
        System.out.println("ACCIDENT REPORT");
        System.out.println("--------------");
        System.out.println("VEHICLE TYPE: " + getAccidentVehicleType());
        System.out.println("CITY: " + getCity());
        System.out.println("ACCIDENT TOTAL: " + getAccidentTotal());
    }
}