package q3;

/**
 * Represents an Ellipse. 
 */
public class Ellipse extends Shape {
    protected double a; // Major axis
    protected double b; // Minor axis

    public Ellipse(String name, double axis1, double axis2) {
        super(name);
        // Ensure 'a' is the largest value and 'b' is the smallest
        if (axis1 >= axis2) {
            this.a = axis1;
            this.b = axis2;
        } else {
            this.a = axis2;
            this.b = axis1;
        }
    }

    @Override
    public double getArea() {
        return Math.PI * a * b;
    }

    @Override
    public double getPerimeter() {
        // Ramanujan first approximation for accurate perimeter
        return Math.PI * (3 * (a + b) - Math.sqrt((3 * a + b) * (a + 3 * b)));
    }


}