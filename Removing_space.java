//Removing all spaces from a string without using any replace or regex

import java.util.Scanner;
import java.util.StringTokenizer;

class Removing_space
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_string = sc.nextLine();
        StringTokenizer Tokenizer = new StringTokenizer(input_string);
        while (Tokenizer.hasMoreTokens())
        {
            System.out.print(Tokenizer.nextToken());
        }
            
        sc.close();
    }
}