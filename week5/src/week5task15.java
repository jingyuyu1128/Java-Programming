import java.util.Scanner;
public class week5task15 {
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);

        String city1=scanner.nextLine();
        String city2=scanner.nextLine();

        if(city1.compareTo(city2)<0){
            System.out.println("Cities in alphabetical order: " + city1 + ", " + city2);
        }
        else{
            System.out.println("Cities in alphabetical order: " + city2 + ", " + city1);
        }
        scanner.close();
    }
}
