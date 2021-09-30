package day3;
import java.util.*;
public class TestPoint2D {
    public static void main(String[]args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter two co-ordinates point P1 ");
        Point2D p1=new Point2D(input.nextInt(),input.nextInt());
        System.out.println("Point P1 "+p1.getDetails());
        System.out.println("Enter two co-ordinates point P2 ");
        Point2D p2=new Point2D(input.nextInt(), input.nextInt());
        System.out.println("Point P2 "+p2.getDetails());
        System.out.println(p1.equalsTo(p2)?"Same":"Different");
        System.out.println("Enter offset value from point P1: ");
        Point2D p3=p1.createNewPoint(input.nextInt(), input.nextInt());
        System.out.println("Point P3 "+p3.getDetails());
        System.out.print("Distance between point P1 and P2 is ");
        System.out.println(p1.calculateDistance(p2));
        input.close();
    }
    
}