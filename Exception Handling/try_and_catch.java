// 

public class try_and_catch {
    public static void main(String[] args) {
        int d;
        try
        {
            d=0;
            int a=10/d;
            System.out.println("This will not be executed"+a);
        }
        catch (Exception e)
        {
            System.out.println("\n\nError: "+e);
        }
    }
}
