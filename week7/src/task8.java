public class task8 {
    public static void main(String[] args){
        System.out.println("The first 50 primes is: ");
        int n=50;
        int i=2;
        getPrime(i,n);
    }
    public static void getPrime(int i,int n){
        int t=0;
        while(t<n){
            if(isPrime(i)) {
                t++;
                if(t%10==0){
                    System.out.printf("%-5d\n",i);
                }
                else{
                    System.out.printf("%-5d",i);
                }
            }
            i++;
        }
    }
    public static boolean isPrime(int i){
        int n=2;
        for(n=2;n<=i/2;n++){
            if(i%n==0)
                return false;
        }
        return true;
    }
}

