

/*
 * it is possible for program to throw an exceptation explicitly using throw statement 
 * syntax:
 * 
 * throw ThrowableInstance
 */

import java.util.Scanner;

public class Throw_Keyword {
    public static void SquareRoot(int num)
    {
        if (num<0)
        {
            throw new ArithmeticException("/n number is negative can't calculate squareroot:\n");
            // throw can't handle general Exception 
            // it must be specipic exception type for throw
        }
        else
            System.out.println("Squareroot of "+num+"is"+Math.sqrt(num));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        SquareRoot(a);
        System.out.println("Rest of the code");
        sc.close();
    }
}
