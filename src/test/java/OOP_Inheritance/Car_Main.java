package OOP_Inheritance;

public class Car_Main {

    public static void main(String[] args) {
        OOP_Inheritance.Car car = new OOP_Inheritance.Car();
        car.setMake("Maserati");
        car.setModel("Carrera");
        car.setDoors(2);
        car.setConvertible(false);
        car.setColor("Black");
        System.out.println("Color: " + car.getColor());
        System.out.println("Model: " + car.getModel());
        car.describeCar();

        OOP_Inheritance.Car targa = new OOP_Inheritance.Car();
        targa.setMake("Porsche");
        targa.setModel("Targa");
        targa.setDoors(4);
        targa.setConvertible(true);
        targa.setColor("Blue");
        targa.describeCar();
    }


}
