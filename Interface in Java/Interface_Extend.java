interface A
{
    void meth1();
    void meth2();
}

interface B extends A
{
    void meth3();
}


class myClass implements B {

    public void meth1()
    {
        System.out.println("I am Method 1");
    }

    public void meth2()
    {
        System.out.println("I am Method 2");
    }

    public void meth3()
    {
        System.out.println("I am Method 3");
    }
}
class Interface_Extend {

    public static void main(String[] args) {
        myClass r = new myClass();
        r.meth1();
        r.meth2();
        r.meth3();
    }
}