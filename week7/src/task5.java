import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        String message=input.nextLine();
        int n=input.nextInt();
        nPrintln(message,n);
    }
    public static void nPrintln(String message,int n)
    {
        for(int i=0;i<n;i++)
            System.out.println(message);
    }
}
