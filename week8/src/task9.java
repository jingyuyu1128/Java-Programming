import java.util.Scanner;

public class task9 {
    public static void main(String[] args){
        String[] months={"January","Feb","Mar","Apr","May"
        ,"June","July","August","Sep","Oct","Nov","Dec"};
        System.out.println("Enter a month number(1 to 12): " );
        Scanner input=new Scanner(System.in);
        int monthNumber=input.nextInt();
        System.out.println("The month is:"+months[monthNumber-1]);
        input.close();
    }
}
