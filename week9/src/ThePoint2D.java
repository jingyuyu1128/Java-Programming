import java.util.Scanner;
import javafx.geometry.Point2D;
public class ThePoint2D {
    public static void main(String[] args){
        Scanner input=new Scanner();

        System.out.print("Enter point's x-,y-coordinates: ");
        double x1=input.nextDouble();
        double y1=input.nextDouble();
        System.out.print("Enter point2's x-,y-coordinates: ");
        double x2=input.nextDouble();
        double y2=input.nextDouble();

        Point2D p1=new point2D(x1,y1);
        point2D p2=new point2D(x2,y2);
        System.out.println("p1 is "+p1.toString());
        System.out.println("p2 is "+p2.toString());
        System.out.println("The distance between p1 and p2 is "+p1.distance(p2));
        System.out.println("The midpoint between p1 and p is "+p1.midpoint(p2).toString());
    }

}
