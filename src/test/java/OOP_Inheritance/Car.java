package OOP_Inheritance;

public class Car {

    //always private access modifier is recommended when declare a field!
    //private keyword also decribes "Encapsulation". It's not reachable from out of the class!
    //private keyword variables are only accessible within the declared class!!!
    private String make = "Tesla";
    private String model = "Model X";
    private String color = "Gray";
    private int doors = 2;
    private boolean convertible = true;

    //getter and setter methods!!!
    //getter method is to retrieve the value of a private field and returns it.
    //setter methods to set the value of a private field
    //we do not use "static" keyword here
    public String getMake(){
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getDoors() {
        return doors;
    }

    public boolean isConvertible() {
        return convertible;
    }

    //"this" is a special keyword. We use it with setter method
    //it refers the instance that was created when the object was instantiated
    //we can set some rules wat we want in the setter method!
    public void setMake(String make) {

        if (make == null) make = "Unknown";
        String lowerCaseMake = make.toLowerCase();
        switch (lowerCaseMake){
            case "holden", "porsche", "tesla" -> this.make = make;
            default -> {
                this.make = "Unsupported";
            }
        }

    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setConvertible(boolean convertible) {
        this.convertible = convertible;
    }

    public void describeCar(){
        System.out.println(doors + "-Door " + color + " " + make + " " + model + " "
        +(convertible ? "Convertible": ""));
    }
}
