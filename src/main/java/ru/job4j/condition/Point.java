package ru.job4j.condition;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {

    private int x;

    private int y;

    private int z;

    public Point(int first, int second) {
        this.x = first;
        this.y = second;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2));
    }

    public static double distance(int x1, int y1, int x2, int y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) + pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
        }

    public static void main(String[] args) {
        double result = Point.distance(1, 1, 7, 9);
        System.out.println("result (1, 7) to (1, 9) " + result);
        Point a = new Point(1, 1);
        Point b = new Point(7, 9);
        double distance = a.distance(b);
        System.out.println("Результат ООП в 2D = " + distance);
        Point c = new Point(2, 3, 0);
        Point d = new Point(5, 7, 0);
        double distance3d = c.distance3d(d);
        System.out.println("Результат ООП в 3D = " + distance3d);
    }
}
