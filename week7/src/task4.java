import java.util.Scanner;

public class task4 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        double i,j;
        i=input.nextDouble();
        System.out.println("the mark of "+i+"is"+getGrade(i));
        j=input.nextDouble();
        System.out.println("The mark of "+j+"is"+getGrade(j));
    }
    public static char getGrade(double i){
        if(i>=90){
            return 'A';
        }
        else if(i>=80){
            return 'B';
        }
        else if(i>=70){
            return 'C';
        }
        else if(i>=60){
            return 'D';
        }
        else
            return 'E';
    }
}
