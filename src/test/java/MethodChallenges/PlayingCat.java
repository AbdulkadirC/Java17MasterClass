package MethodChallenges;

public class PlayingCat {

    public static void main(String[] args) {

        System.out.println(isCatPlaying(true, 10));
        System.out.println(isCatPlaying(false, 36));
        System.out.println(isCatPlaying(false, 35));

    }

    public static boolean isCatPlaying(boolean summer, int temperature){

        if(temperature >= 25 && temperature <= 35){
            return true;
        }else if(temperature >= 25 && temperature <= 45 && summer == true){
            return true;
        }else {
            return false;
        }

    }

    //alternative solution with ternary operators
    /*
    public class PlayingCat {
    public static boolean isCatPlaying(boolean summer, int temperature) {
        int upperLimit = summer ? 45 : 35;
        return temperature >= 25 && temperature <= upperLimit;
    }
}

    //another alternative solution with ternary operators

    public static boolean isCatPlaying(boolean summer, int temp){
    if (summer && temp >=25 && temp <=45) return true;
    return !summer && temp >= 25 && temp <= 35;
}
     */

}
