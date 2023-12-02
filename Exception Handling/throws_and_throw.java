public class throws_and_throw {
    static void method1() throws ArithmeticException
    {
        System.out.println("Inside the method");
        throw new ArithmeticException("Throwing arthmetic Exception");
    }
    public static void main(String[] args) {
        try {
            method1();
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}
