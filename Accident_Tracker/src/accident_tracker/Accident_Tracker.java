/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package accident_tracker;

/**
 *
 * @author dudle
 */

public class Accident_Tracker {
    public static void main(String[] args) {
        AccidentTracker tracker = new AccidentTracker();
        tracker.inputData();
        tracker.displayReport();
        tracker.closeScanner();
    }
}
