
/**
 * Project: lab1_5Chowdhury - Motorcycle
 * Purpose Details: Represents a motorcycle wheel and tire (rim size, tire brand, pressure, and position)
 * Course: CMPSC 221
 * Author: Daboraj Chowdhury
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */
//
public class Wheel {
    private int rimSizeInches; //Sets the variable for the size of the rim in inches
    private int tirePressurePsi; //sets the variable for the tire pressure
    private String position; //sets the variable for the position of the tire
    private String tireBrand; //sets the variable of the name of the tire brand



    //Constructor with all the fields for the wheel
    public Wheel(String position, int tirePressurePsi, String tireBrand, int rimSizeInches) {
        this.position = position;
        this.tireBrand = tireBrand;
        this.tirePressurePsi = tirePressurePsi;
    }

    //getters and setters of all fields of the wheel
    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public int getRimSizeInches() {
        return rimSizeInches;
    }

    public void setRimSizeInches(int rimSizeInches) {
        this.rimSizeInches = rimSizeInches;
    }

    public String getTireBrand() {
        return tireBrand;
    }

    public void setTireBrand(String tireBrand) {
        this.tireBrand = tireBrand;
    }

    public int getTirePressurePsi() {
        return tirePressurePsi;
    }

    public void setTirePressurePsi(int tirePressurePsi) {
        this.tirePressurePsi = tirePressurePsi;
    }
}
