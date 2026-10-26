

/**
 * Project: lab1_5Chowdhury - Motorcycle
 * Purpose Details: Creates four (one extra) Motorcycle objects using the constructor and
 *  *                  prints all of their details to the screen using the getter methods
 * Course: CMPSC 221
 * Author: Daboraj Chowdhury
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */
public class Main {

    public static void main(String[] args) {
        Motorcycle bike1 = new Motorcycle(
                "Yamaha", "MT-09", 2024, "Icon Green",
                new Engine("Inline-3", 900, 3, 117),
                new Transmission(6, "Chain", "Assist and slipper"),
                new Wheel("Front", 20, "Bridgestone", 20),
                new Wheel("Back", 20, "Bridgestone", 20),
                new Brakes("Dual disc", "Single disc", true),
                3200, 180);

        Motorcycle bike2 = new Motorcycle(
                "Daboraj Motors", "The Excellent", 3000, "Black",
                new Engine("Volcano-Powered V12", 8888, 12, 5555),
                new Transmission(99, "Meteor Chain", "Thunder Clutch"),
                new Wheel("Front", 30, "Lava L", 666),
                new Wheel("Back", 32, "Lava L", 666),
                new Brakes("dual disc", "single disc", false),
                444444, 999);

        Motorcycle bike3 = new Motorcycle(
                "Daboraj Motors", "The Amazing", 2077, "Gold",
                new Engine("Eraser V15", 66, 6, 666),
                new Transmission(6,"chain duo", "assist clutch"),
                new Wheel("Front", 5, "Cloud L", 5),
                new Wheel("Back", 3, "Cloud L", 4),
                new Brakes("Dual Disc", "Single disc", true),
                2, 11);

        Motorcycle bike4 = new Motorcycle(
                "Daboraj Motors", "The Magnificent", 2086, "orange",
                new Engine("Eraser V80", 55, 5, 555),
                new Transmission(5,"Yellow Silk", "Orange Clutch"),
                new Wheel("Front", 55, "Cloud XL", 55),
                new Wheel("Back", 55, "Cloud XL", 5),
                new Brakes("Dual Disc", "Single disc", true),
                5, 11);

        printMotorcycle(1, bike1);
        printMotorcycle(2, bike2);
        printMotorcycle(3, bike3);
        printMotorcycle(4, bike4);
    }

    private static void printMotorcycle(int number, Motorcycle m) {
        System.out.println("========== Motorcycle " + number + " ==========");
        System.out.println("Make:            " + m.getMake());
        System.out.println("Model:           " + m.getModel());
        System.out.println("Year:            " + m.getYear());
        System.out.println("Color:           " + m.getColor());
        System.out.println("Mileage:         " + m.getMileage() + " miles");
        System.out.println("Top Speed:       " + m.getTopSpeedMph() + " mph");

        System.out.println("-- Engine --");
        System.out.println("  Type:          " + m.getEngine().getType());
        System.out.println("  Displacement:  " + m.getEngine().getDisplacement() + " cc");
        System.out.println("  Cylinders:     " + m.getEngine().getCylinders());
        System.out.println("  Horsepower:    " + m.getEngine().getHorsepower() + " hp");

        System.out.println("-- Transmission --");
        System.out.println("  Gears:         " + m.getTransmission().getGears());
        System.out.println("  Drive Type:    " + m.getTransmission().getDriveType());
        System.out.println("  Clutch Type:   " + m.getTransmission().getClutchType());

        printWheel(m.getFrontWheel());
        printWheel(m.getBackWheel());

        System.out.println("-- Brakes --");
        System.out.println("  Front:         " + m.getBrakes().getFrontType());
        System.out.println("  Back:          " + m.getBrakes().getBackType());
        System.out.println("  ABS:           " + (m.getBrakes().getAntiLockBrakes() ? "Yes" : "No"));
        System.out.println();
    }

    private static void printWheel(Wheel w) {
        System.out.println("-- " + w.getPosition() + " Wheel --");
        System.out.println("  Rim Size:      " + w.getRimSizeInches() + " in");
        System.out.println("  Tire Brand:    " + w.getTireBrand());
        System.out.println("  Tire Pressure: " + w.getTirePressurePsi() + " psi");
    }
}