interface DoubleNumericArrayFunc
{
    double func(double[] n) throws EmptyArrayException;
}

class EmptyArrayException extends Exception
{
    EmptyArrayException()
    {
        super("Array Empty");
    }
}
public class LambdaWithException {
    public static void main(String[] args) throws EmptyArrayException{
        double[] values = {1.0,2.0,3.0,4.0};
        DoubleNumericArrayFunc avg = (n) -> 
        {
            double sum = 0;
            if(n.length == 0)
                throw new EmptyArrayException();
            else
            {
                for(int i=0;i<n.length;i++)
                    sum += n[i];
            }

            return sum;
        };
        System.out.println("Sum of elements of Array is: "+avg.func(values));
    }
}
