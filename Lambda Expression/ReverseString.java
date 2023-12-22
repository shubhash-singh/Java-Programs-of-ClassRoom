import java.util.Scanner;

interface ReverseStr{
    String reversed(String str);
}

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input_str = sc.next();
        ReverseStr ob = (str) ->
        {
            StringBuilder result = new StringBuilder(str).reverse();
            return result.toString();
        };
        System.out.println("Reverse of String is: "+ob.reversed(input_str));
        sc.close();
    }
}
