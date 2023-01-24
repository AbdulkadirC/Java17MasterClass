package OOP_Inheritance;

public class Floor_Calculator {
    
    private Floor floor;
    private Floor_Carpet carpet;

    public Floor_Calculator(Floor floor, Floor_Carpet carpet) {
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getCost();
    }

}
