public class task1 {
    public static void main(String[] args) {
        int[] arrayRefVar=new int[100];
        for (int i = 1; i < 5; i++) {
            arrayRefVar[i] = i+arrayRefVar[i-1];
            System.out.println(arrayRefVar[i]);
        }

    }
}
