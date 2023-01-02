package LoopStatements;

public class NumberPalindrome {

    /*
    Write a method called isPalindrome with one int parameter called number.
The method needs to return a boolean.
It should return true if the number is a palindrome number otherwise it should return false.
Check the tips below for more info about palindromes.
     */

    public static void main(String[] args) {

        System.out.println(isPalindrome(-1221));
        System.out.println(isPalindrome(707));
        System.out.println(isPalindrome(101));
        System.out.println(isPalindrome(11));

    }

    public static boolean isPalindrome(int number){

        if (number < 0){
            number = number * -1;
        }

        int reverse = 0;
        int stored = number;

        while (stored > 0){
            int digit = stored % 10 ;
            reverse = (reverse * 10) + digit;
            stored = stored / 10;
        }

        if (number == reverse){
            return true;
        }

        return false;
    }
}
