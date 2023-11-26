interface Shapes {
    void draw();
}

// Child interface inheriting from Shape
interface Circles extends Shapes {
    double getRadius();
}

// A class implementing the Circle interface
class CircleImpl implements Circles {
    private double radius;

    public CircleImpl(double radius) {
        this.radius = radius;
    }

    @Override
    public void draw() {
        // Implementation of draw for a circle
        System.out.println("Drawing a circle");
    }

    @Override
    public double getRadius() {
        return radius;
    }
}