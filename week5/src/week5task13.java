import java.util.Scanner;
public class week5task13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.print("Enter a character: ");
        String s=input.nextLine();
        char ch=s.charAt(0);
        System.out.print("The character entered is"+ch);
    }
}
