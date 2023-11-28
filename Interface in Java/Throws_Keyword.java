/*
 * throws keys always work with signature of method
 * that mean it will always be written after variable declaration
 * it should not be writeen in braces as we can see in following program
 * 
 */


/*
 * The throws keyword is used to declare an exception.
 * This gives an inforamtion to the progarm that there might be an exception 
 * so its better to be prepared woth try and catch block.
 */
 

import java.util.Scanner;

public class Throws_Keyword {
    public static double divide(int a, int b) throws ArithmeticException
    {
        double result = a/b;
        return result;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        try {
            double c = divide(a,b);
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("\n\n"+e);
        }

        sc.close();
    }
}
