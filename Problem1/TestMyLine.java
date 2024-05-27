package Problem1;

public class TestMyLine {

    public static void main(String[] args) {
        MyLine line1 = new MyLine(1, 2, 3, 4);
        System.out.println(line1); // from rewuest MyLine[begin=(1,2),end=(3,4)]

        MyPoint p1 = new MyPoint(5, 6);
        MyPoint p2 = new MyPoint(7, 8);
        MyLine line2 = new MyLine(p1, p2);
        System.out.println(line2); // from request MyLine[begin=(5,6),end=(7,8)]

        // getters and setters
        System.out.println("Begin: " + line2.getBegin()); // (5,6)
        System.out.println("End: " + line2.getEnd()); // (7,8)

        line2.setBegin(new MyPoint(0, 0));
        line2.setEnd(new MyPoint(10, 10));
        System.out.println(line2); // from request MyLine[begin=(0,0),end=(10,10)]

        System.out.println("Begin X: " + line2.getBeginX()); // 0
        System.out.println("Begin Y: " + line2.getBeginY()); // 0
        System.out.println("End X: " + line2.getEndX()); // 10
        System.out.println("End Y: " + line2.getEndY()); // 10

        line2.setBeginX(1);
        line2.setBeginY(1);
        line2.setEndX(9);
        line2.setEndY(9);
        System.out.println(line2); // from request MyLine[begin=(1,1),end=(9,9)]

        System.out.println("Length: " + line2.getLength());
        System.out.println("Gradient: " + line2.getGradient());
    }

}
