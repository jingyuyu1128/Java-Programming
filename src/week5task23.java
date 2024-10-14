import java.util.Scanner;
public class week5task23 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("the length :");
        double r=scanner.nextDouble();
        double area=(5.0/2.0)*r*r*Math.sin(2*Math.PI/5);

        System.out.printf("The area is:%.2f%n",area);
        scanner.close();
    }
}
