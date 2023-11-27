// Aim:
// To write a java program to illustrate the iteration of enumeration elements
enum Colors
{
    Red,
    Blue,
    Yellow,
    Green
}
public class Week_7C {
    public static void main(String[] args) {
        for (Colors X: Colors.values())
        {
            System.out.println(X);
            System.out.println(X.ordinal());
        }
    }
}
