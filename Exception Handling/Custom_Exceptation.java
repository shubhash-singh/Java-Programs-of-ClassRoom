/*
 * Java provides us facility to create our own exceptation which are basically derived class of exception class

 * Creating our own exception is known as a custom exception or user defined exception
 
 * Java custom exception are used to customize the exceptaions according to user needs
 * 
 */

class InvalidAgeException extends Exception
{
    public InvalidAgeException(String str)
    {
        super(str);
    }
}

public class Custom_Exceptation {
    static void Validiator(int age) throws InvalidAgeException
    {
        if (age<18)
        {
            throw new InvalidAgeException ("Age is not Valid");
        }
        else
        {
            System.out.println("Welcome \n Cast your vote");
        }
    }
    public static void main(String[] args) {
        try {
            Validiator(13);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}