package q4;

/**
 * Represents a Circle (a special case of Ellipse where a = b = radius).
 */
public class Circle extends Ellipse {
    
    public Circle(String name, double radius) {
        super(name, radius, radius);
    }

    @Override
    public void scale(double factor) {
        super.scale(factor);
    }
}