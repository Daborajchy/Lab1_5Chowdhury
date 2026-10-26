/**
 * Project: lab1_5Chowdhury - Motorcycle
 * Purpose Details: Represents a motorcycle transmission (gear count, drive type, clutch type).
 * Course: CMPSC 221
 * Author: Daboraj Chowdhury
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Transmission {
     private String driveType;
     private String clutchType;
     private int gears;

    //Constructor with all the fields for the transmission
    public Transmission(int gears, String driveType, String clutchType) {
        this.gears = gears;
        this.driveType = driveType;
        this.clutchType = clutchType;
    }

    //getters and setters of all fields of the transmission
    public int getGears() {
        return gears;
    }

    public void setGears(int gears) {
        this.gears = gears;
    }

    public String getDriveType() {
        return driveType;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public String getClutchType() {
        return clutchType;
    }

    public void setClutchType(String clutchType) {
        this.clutchType = clutchType;
    }
}