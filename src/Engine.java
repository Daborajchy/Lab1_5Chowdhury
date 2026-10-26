

/**
 * Project: lab1_5Chowdhury - Motorcycle
 * Purpose Details: Represents a motorcycle engine and gets them (type, displacement, cylinders, horsepower).
 * Course: CMPSC 221
 * Author: Daboraj Chowdhury
 * Date Developed: 10/23/2026
 * Last Date Changed: 10/25/2026
 * Revision: 1.0
 */
public class Engine {

      private String type; // setting the variable for the type of engine
      private int displacement; // setting the variable for the size of the engine
      private int horsepower; // setting the variable for the number of cylinders of the engine
      private int cylinders; //  setting the variable of how much horsepower the motorcycle has


    // setting the constructor with all the required fields for the engine
      public Engine(String type, int displacement, int horsepower, int cylinders) {
          this.type = type;
          this.displacement = displacement;
          this.horsepower = horsepower;
          this.cylinders = cylinders;

      }
    //getters and setters for each specific type of field
     public String getType() { return type; } // gets the type
     public void setType(String type) {this.type = type;} // sets the type

     public int getDisplacement() { return displacement; } // gets the displacement
     public void setDisplacement(int displacement) { this.displacement = displacement;} // sets the displacement

     public int getHorsepower() { return horsepower; } // gets the horsepower
     public void setHorsepower(int horsepower) { this.horsepower = horsepower;} // sets the horsepower

     public int getCylinders() { return cylinders; } // gets a cylinder
     public void setCylinders(int cylinders) { this.cylinders = cylinders;} // sets the cylinders
}

