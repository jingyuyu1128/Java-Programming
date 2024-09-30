import java.util.Scanner;

public class exemple3_8 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter am integer: ");
        int num=input.nextInt();

        if(num%2==0&&num%3==0){
            System.out.println(num+"is disvisibled by 2 and 3.");
        }
        if (num%2==0||num%3==0){
            System.out.println(num+"is divisibled by 2 or 3");
        }
        if (num%2==0^num%3==0){
            System.out.println(num+"is disvisibled by 2 or 3,but not both");
        }
    }
}
