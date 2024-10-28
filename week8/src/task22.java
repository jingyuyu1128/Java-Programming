import java.util.Scanner;

public class task22 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter 10 numbers: ");
        double[] list=new double[10];
        for(int i=0;i<10;i++){
            list[i]=input.nextDouble();
        }
        double minnumber=min(list);
        System.out.println("The minimun number is "+minnumber);
    }
    public static double min(double[] array){
        double mm=array[0];
        for(int i=1;i<array.length;i++){
            if(array[i]<mm)
                mm=array[i];
        }
        return mm;
    }
}
