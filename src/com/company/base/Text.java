package com.company.base;

public class Text {
    public static void main(String[] args) {

        Point p1 = new Point(0,0);
        Point p2 = new Point(4,3);
        System.out.println(p1.distance(p2));
        p1.setX(3);
        System.out.println(p1.distance(p2));
    }
}
