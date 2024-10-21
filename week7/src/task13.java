import java.util.Scanner;

public class task13 {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);

        System.out.print("Enter a hexadecimal nnumber: ");
        String hexNumber=input.nextLine();

        int decimalNumber=hexToDecimal(hexNumber);

        System.out.printf("The demical equivalent of hexadecimal is %s is: %d%n",hexNumber,decimalNumber);

    }
    public static int hexToDecimal(String hex){
        int decimalValue=0;
        int base=1;
        for(int i=hex.length()-1;i>=0;i--){
            char hexChar=hex.charAt(i);
            int hexDigit=0;
            if(hexChar>='0'&&hexChar<='9'){
                hexDigit=hexChar-'0';
            }else if(hexChar>='A'&&hexChar<='F'){
                hexDigit=hexChar-'A'+10;
            }else if(hexChar>='a'&&hexChar<='f'){
                hexDigit=hexChar-'a'+10;
            }

            decimalValue+=hexDigit*base;
            base*=16;
        }
        return decimalValue;
    }
}
