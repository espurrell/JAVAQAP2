package Problem2;

import Problem1.MyPoint;

public class TestMyRectangle {

    public static void main(String[] args) {
        MyRectangle rect1 = new MyRectangle(1, 4, 5, 1);
        System.out.println(rect1); // MyRectangle[topLeft=(1,4), bottomRight=(5,1), width=4, height=3]

        MyPoint p1 = new MyPoint(0, 3);
        MyPoint p2 = new MyPoint(3, 0);
        MyRectangle rect2 = new MyRectangle(p1, p2);
        System.out.println(rect2); // MyRectangle[topLeft=(0,3), bottomRight=(3,0), width=3, height=3]

        // Test getters and setters
        System.out.println("Top Left: " + rect2.getTopLeft()); // (0,3)
        System.out.println("Bottom Right: " + rect2.getBottomRight()); // (3,0)
        System.out.println("Top Right: " + rect2.getTopRight()); // (3,3)
        System.out.println("Bottom Left: " + rect2.getBottomLeft()); // (0,0)

        rect2.setTopLeft(new MyPoint(-1, 4));
        rect2.setBottomRight(new MyPoint(2, -1));
        System.out.println(rect2); // MyRectangle[topLeft=(-1,4), bottomRight=(2,-1), width=3, height=5]

        System.out.println("Width: " + rect2.getWidth()); // 3
        System.out.println("Height: " + rect2.getHeight()); // 5
        System.out.println("Area: " + rect2.getArea()); // 15
        System.out.println("Perimeter: " + rect2.getPerimeter()); // 16
    }

}
