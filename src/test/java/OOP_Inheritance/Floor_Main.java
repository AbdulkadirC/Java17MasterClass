package OOP_Inheritance;

public class Floor_Main {

    public static void main(String[] args) {
        Floor_Carpet carpet = new Floor_Carpet(3.5);
        Floor floor = new Floor(2.75, 4.0);
        Floor_Calculator calculator = new Floor_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
        carpet = new Floor_Carpet(1.5);
        floor = new Floor(5.4, 4.5);
        calculator = new Floor_Calculator(floor, carpet);
        System.out.println("total= " + calculator.getTotalCost());
    }

}
