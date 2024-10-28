import java.util.Scanner;

public class task23 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int[] list1=new int[10];
        System.out.println("Enter 10 integers: ");
        for(int i=0;i<10;i++){
            list1[i]=input.nextInt();
        }
        int[] list2=reverse(list1);
        System.out.println("The reverse numbers is: ");
        for(int value:list2){
            System.out.print(value+" ");
        }
    }
    public static int[] reverse(int[] list){
        int[] result=new int[10];
        for(int i=0, j=9;i<10;i++,j--){
            result[i]=list[j];
        }
        return result;
    }
}
