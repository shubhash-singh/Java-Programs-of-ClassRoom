import java.util.Scanner;

public class Nested_try_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try 
        {
            int a = sc.nextInt();
            int b = 42/a;
            System.out.println(b);

            try {
                if( a== 1)
                    a = a/(a-a);
                if (a>1)
                {
                    int c[] = {1};
                    c[42] = 100;
                }
            } catch (Exception e) {

                
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        sc.close();
    }
}


/*
 * 
 * This is an example of java nested if program
 */