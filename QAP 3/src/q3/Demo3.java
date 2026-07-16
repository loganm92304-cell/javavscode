package q3;


public class Demo3 {
    



    public static void main(String[] args) {
        // Create an array of Shape objects
        Shape[] shapes = new Shape[4];
        shapes[0] = new Ellipse("MyEllipse", 5.0, 3.0);
        shapes[1] = new Circle("MyCircle", 4.0);
        shapes[2] = new Triangle("MyTriangle", 3.0, 4.0, 5.0);
        shapes[3] = new EquilateralTriangle("MyEquilateralTriangle", 6.0);

        System.out.println("=== BEFORE SCALING ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }

        // Scale shapes by a factor of 2.0
        double factor = 2.0;
        System.out.println("\n--- Scaling shapes by factor of " + factor + " ---");


        System.out.println("\n=== AFTER SCALING ===");
        for (Shape s : shapes) {
            System.out.println(s);
        }
    }
}