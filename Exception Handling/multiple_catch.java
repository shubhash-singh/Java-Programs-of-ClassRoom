import java.util.Scanner;

public class multiple_catch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        
        try {
            int a = sc.nextInt();
            int[] number = {1,2,3,};
            int result = number[a];
            System.out.println(result);
            float result2 = 10/a;
            System.out.println(result2);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: "+e.getMessage());
        }
        catch (ArithmeticException e)
        {
            System.out.println("Error:"+e.getMessage());
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        finally
        {
            System.out.println("I am from Finally block");
        }
        sc.close();
    }    
}