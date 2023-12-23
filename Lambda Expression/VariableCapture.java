interface Myfunc
{
    int func(int n);
}

public class VariableCapture
{
    public static void main(String[] args) {
        int num = 10;
        Myfunc MF = (n) -> 
        {
            int v = num +n;
            // num++;
            // num =10;
            //  Abl=ove 2 lines are not allowed because we cannot modify the local variable of a function
            return v;
        };
        System.out.println("Value of n is : "+ MF.func(num));
    }
}