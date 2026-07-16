package q2;


public class Demo2 {
    public static void main(String[] args) {
        Point p1 = new Point(1.5f, 2.5f);
        System.out.println("Point: " + p1);

        MovablePoint mp1 = new MovablePoint(3.0f, 4.0f, 0.5f, 1.5f);
        System.out.println("Before Move: " + mp1);
        mp1.move();
        System.out.println("After Move:  " + mp1);
    }
}