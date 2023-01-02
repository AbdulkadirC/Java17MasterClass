package LoopStatements;

import java.util.Scanner;

public class DiagonalStar {

    /*
    Write a method named printSquareStar with one parameter of type int named number.
If number is < 5, the method should print "Invalid Value".
The method should print diagonals to generate a rectangular pattern composed of stars (*). This should be accomplished by using loops (see examples below).
     */

    public static void main(String[] args) {
        printSquareStar(8);
    }

    public static void printSquareStar(int number){

        if (number < 5) {
            System.out.println("Invalid Value");
        }

        for (int i = 1; i <= (number - 1) / 2; i ++){
            System.out.print(" ");
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }System.out.println();
        }



    }
}
