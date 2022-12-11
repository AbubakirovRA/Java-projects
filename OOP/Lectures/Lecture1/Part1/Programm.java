package Lectures.Lecture1.Part1;

public class Programm {
    /**
     * Первоначальный вариант.
     * @param args
     */
    // static double distance(int x1, int y1, int x2, int y2){
    //     return Math.sqrt(Math.pow(x2 - x2, 2) + Math.pow(y2 - y1, 2));
    // }

    public static void main(String[] args) {
        Point2D a = new Point2D(-100);
        // a.setX(0); 
        // a.setY(2);
        // a.x = 0;
        // a.y = 2;
        System.out.println(a);

        Point2D b = new Point2D(3);
        b.setX(3);
        // b.x = 0;
        // b.y = 10;
        System.out.println(b);
        // System.out.println(distance(a, b));

        var dis = Point2D.distance(a, b);
        System.out.println(dis);
    }
}
