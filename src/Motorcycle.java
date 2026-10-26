/**
 * Project: lab1_5Chowdhury - Motorcycle
 * Purpose Details: Represents a motorcycle built from scratch, including all the properties and additions as well
 * Course: CMPSC 221
 * Author: Daboraj Chowdhury
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */
public class Motorcycle {
    private int year; //the year of the motorcycle
    private Wheel backWheel; // the back wheel
    private String make; // who made the motorcycle
    private int mileage; // total mileage that it has been ridden
    private Brakes brakes; // the front and back brakes of the motorcycle
    private String color; // color of motorcycle
    private Transmission transmission; // the motorcycle transmission
    private int topSpeedMph; //what is the max speed it can go
    private String model; // the model of the motorcycle
    private Wheel frontWheel; // the front wheel of the motorcycle
    private Engine engine; // the engine of the motorcycle

    //filled constructor with all the fields for the complete motorcycle
    public Motorcycle(String make, String model, int year, String color, Engine engine,
                      Transmission transmission, Wheel frontWheel, Wheel backWheel, Brakes brakes,
                      int mileage, int topSpeedMph) {
        this.engine = engine;
        this.color = color;
        this.mileage = mileage;
        this.make = make;
        this.backWheel = backWheel;
        this.topSpeedMph = topSpeedMph;
        this.year = year;
        this.brakes = brakes;
        this.model = model;
        this.frontWheel = frontWheel;
        this.transmission = transmission;
    }
   //getters and setters of all the fields of the motorcycle
    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Wheel getBackWheel() {
        return backWheel;
    }

    public void setBackWheel(Wheel backWheel) {
        this.backWheel = backWheel;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public int getTopSpeedMph() {
        return topSpeedMph;
    }

    public void setTopSpeedMph(int topSpeedMph) {
        this.topSpeedMph = topSpeedMph;
    }

    public Brakes getBrakes() {
        return brakes;
    }

    public void setBrakes(Brakes brakes) {
        this.brakes = brakes;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Wheel getFrontWheel() {
        return frontWheel;
    }

    public void setFrontWheel(Wheel frontWheel) {
        this.frontWheel = frontWheel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }
}