/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package accident_tracker;

/**
 *
 * @author dudle
 */
public class City {
    //Vehicle types
    private String vehicle;
    private int carAccidents;
    private int motoBikeAccidents;

    public City(String name) {
        this.vehicle = name;
        this.carAccidents = 0;
        this.motoBikeAccidents = 0;
    }
// Get the name of the vehicle type
    public String getName() {
        return vehicle;
    }

    public void setCarAccidents(int carAccidents) {
        this.carAccidents = carAccidents;
    }

    public void setMotoBikeAccidents(int motoBikeAccidents) {
        this.motoBikeAccidents = motoBikeAccidents;
    }

    public int getCarAccidents() {
        return carAccidents;
    }

    public int getMotoBikeAccidents() {
        return motoBikeAccidents;
    }

    public int getTotalAccidents() {
        return carAccidents + motoBikeAccidents;
    }
}
