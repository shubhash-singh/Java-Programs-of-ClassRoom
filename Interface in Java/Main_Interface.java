interface Shape
{
    public double Area();
    public double Perimeter();

}

class Main_Interface
{
    public static void main(String[] args)
    {

    }
}

/**
 * Rectangle
 *
 */
class Circle implements Shape{
    double R;
    Circle(double R)
    {
        this.R = R;
    }
    public double Area()
    {
        return 3.1415*R*R;

    }
    public double Perimeter()
    {
        return 2*R*3.1415;
    }
}

class Rectangle{
    double l,b;
    Rectangle(double l, double b)
    {
        this.l = l;
        this.b = b;
    }

    public double Area()
    {
        return l*b;
    }

    public double Perimeter()
    {
        return l+b;
    }
}