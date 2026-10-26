


/**
 * Project: lab1_5Chowdhury - Motorcycle
 * Purpose Details: Represents the brakes for the motorcycle
 * Course: CMPSC 221
 * Author: Daboraj Chowdhury
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */

public class Brakes {
    private String frontType; //sets the string variable for the front wheel
    private String backType; //sets the string variable for the back wheel
    private boolean antiLockBrakes; //checks weather or not there is antilockbrakes



    public Brakes(String frontType, String backType, boolean antiLockBrakes) {
        this.frontType = frontType;
        this.backType = backType;
        this.antiLockBrakes = antiLockBrakes;
    }

    public String getFrontType() {
        return frontType;
    }

    public void setFrontType(String frontType) {
        this.frontType = frontType;
    }

    public String getBackType() {
        return backType;
    }

    public void setBackType(String backType) {
        this.backType = backType;
    }

    public boolean getAntiLockBrakes() {
        return antiLockBrakes;
    }

    public void setAntiLockBrakes(boolean antiLockBrakes) {
        this.antiLockBrakes = antiLockBrakes;
    }
}