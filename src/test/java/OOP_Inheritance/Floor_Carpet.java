package OOP_Inheritance;

public class Floor_Carpet {

    private double cost;

    public Floor_Carpet(double cost){
        this.cost = cost;
        if (cost < 0){
            this.cost = 0;
        }
    }

    public double getCost() {
        return cost;
    }
}
