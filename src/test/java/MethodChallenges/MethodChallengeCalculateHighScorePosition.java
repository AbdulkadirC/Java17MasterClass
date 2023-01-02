package MethodChallenges;

public class MethodChallengeCalculateHighScorePosition {

    public static void main(String[] args) {

        int highScorePosition = calculateHighScorePosition(1500);
        displayHighScorePosition("John", highScorePosition);

        highScorePosition = calculateHighScorePosition(1000);
        displayHighScorePosition("Mike", highScorePosition);

        highScorePosition = calculateHighScorePosition(500);
        displayHighScorePosition("Elf", highScorePosition);

        highScorePosition = calculateHighScorePosition(100);
        displayHighScorePosition("Sam", highScorePosition);

        highScorePosition = calculateHighScorePosition(25);
        displayHighScorePosition("Cristian", highScorePosition);

    }


    public static void displayHighScorePosition(String playerName, int highScorePosition){


        System.out.println(playerName + " managed to get into position " + highScorePosition +" on the high score list");
    }

    public static int calculateHighScorePosition(int score){

        int position = 4;
        if (score >= 1000){
            position =  1;
        }else if(score >= 500 && score < 1000){
            position =  2;
        }else if(score >= 100 && score < 500){
            position =  3;
        }else {
            position =  4;
        }
            return position;
    // no need to add here "return" again because the else block combines all the rest options!!!
        //if we remove else block then we must add "return" end of the method block
    }

}
