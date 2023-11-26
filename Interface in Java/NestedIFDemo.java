class A 
{
    public interface NestedIF {
        boolean isNotNegative(int X);
}   
}

class B implements A.NestedIF
{
    public boolean isNotNegative(int X)
    {
        return X<0?false:true;
    }
}

public class NestedIFDemo
{
    public static void main(String[] args)
    {
        A.NestedIF nif = new B();
        if (nif.isNotNegative(10))
        {
            System.out.println("10 is not negative");
        }
        if (nif.isNotNegative(12))
        {
            System.out.println("-12 is negative");
        }
    }
}
