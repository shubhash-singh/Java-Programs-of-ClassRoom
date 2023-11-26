public class Exception_Handling {
    static void subroutine()
    {
        int d = 0;
        System.out.println(10/d);
    }
    public static void main(String[] args) {
        Exception_Handling.subroutine();
    }
}

// this program will not execute because it has Division by Zero error

/*
 * Exception:    In Java, an exception is an event that disrupts the normal flow of the execution
 * 
 * It is object that represent an abnormal condition or error in thatoccurs during the execution of the program. 
 * 
 */


/*
 * There are 5 keysword for exception handling
 * 
 * 1. try
 * 2. catch
 * 3. throw
 * 4. throws
 * 5. finally
 */


 