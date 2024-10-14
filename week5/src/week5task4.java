public class week5task4 {
    public static void main(String[] args){
        double a=-5.3;
        double b=3.7;

        double maxValue=Math.max(a,b);
        double minValue=Math.min(a,b);

        System.out.println("max is"+maxValue);
        System.out.println("min is"+minValue);

        double absoluteValue=Math.abs(a);
        System.out.println("absolutevalue is"+absoluteValue);

        double randomValue=Math.random();
        System.out.println("randomvalue[0.0,1.0) is"+ randomValue);
    }
}
