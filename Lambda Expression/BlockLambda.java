interface NumericFunc
{
    int func(int n);
}

public class BlockLambda {

    public static void main(String[] args) {
        NumericFunc factorial = (n) ->{
            int result = 1;
            for (int i=1;i<=n;i++)
                result = i*result;
            return result;
        };
        System.out.println("The factorial of 3 = "+factorial.func(3));
        System.out.println("The factorial of 5 = "+ factorial.func(5));
    }
}