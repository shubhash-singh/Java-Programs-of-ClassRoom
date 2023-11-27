interface MyInterface
{
    void show(String S);
}

public class Lambda_interfaceDemo {
    public static void main(String[] args) {
        MyInterface M = (S) -> System.out.println("Hello "+S);
        M.show("Shubhash");
    }
}
