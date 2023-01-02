package ReadingUserInput;

public class LargestPrime {

    /*
    Write a method named getLargestPrime with one parameter of type int named number.
If the number is negative or does not have any prime numbers, the method should return -1 to indicate an invalid value.
The method should calculate the largest prime factor of a given number and return it.
     */

    public static void main(String[] args) {

        System.out.println(getLargestPrime (21));
        System.out.println(getLargestPrime (217));
        System.out.println(getLargestPrime (0));
        System.out.println(getLargestPrime (45));
        System.out.println(getLargestPrime (-1));

    }

    public static int getLargestPrime (int number){

        if (number < 2){
            return -1;
        }

        for (int i = 2; i < number; i++){
            if (number % i == 0){
                return getLargestPrime(number / i);
//                number /= i;      //this is also correct solution.
//                i--;
            }
        }
        return number;
    }
}
