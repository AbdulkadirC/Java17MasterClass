package MethodChallenges;

public class MethodOverloadingCalculateScore {

    public static void main(String[] args) {
        System.out.println("New score is " + calculateScore("Tim", 500));
        System.out.println("New score is " + calculateScore(10));
    }

    public static int calculateScore(String playerName, int score){
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 1000;
    }

    public static int calculateScore(int score){
        //method icinde method cagirma. Burada bir onceki method cagiriliyor return ile birlikte.
        return calculateScore("Anonymous", score);
    }

    public static int calculateScore(){
        System.out.println("No playername, no player score");
        return 0;
    }

    /**
     *  return type does not make the method unique. So parameter type and amounts make the method unique.
     *  when you need to make this void method uncomment the compiler will give error. Because compiler supposes this method and the method previous are same.
     */

//    public static void calculateScore(){
//        System.out.println("No playername, no player score");
//
//    }
}
