import java.util.Scanner;

public class task12 {
    public static void main(String[] args){
        System.out.println("Enter the number of item: ");
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        double[] numbers=new double[n];
        System.out.println("Enter the numbers: ");
        double sum=0;
        for(int i=0;i<numbers.length;i++){
            numbers[i]=input.nextDouble();
            sum+=numbers[i];
        }
        double ave=sum/n;
        int count=0;
        for(int i=0;i<n;i++){
            if(numbers[i]>ave)
                count++;
        }
        System.out.println("Average is "+ave);
        System.out.println("Number of elements above the average is "+count);
    }
}
