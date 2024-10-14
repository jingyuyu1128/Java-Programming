public class week5task3 {
    public static void main(String[] args) {
        double value1 = 3.2;
        double value2 = 3.8;
        double value3 = 2.5;
        double value4 = 3.5;

        // 使用 Math.ceil
        double ceilValue1 = Math.ceil(value1);
        System.out.println("Math.ceil(" + value1 + ") = " + ceilValue1);

        // 使用 Math.floor
        double floorValue2 = Math.floor(value2);
        System.out.println("Math.floor(" + value2 + ") = " + floorValue2);

        // 使用 Math.rint
        double rintValue3 = Math.rint(value3);
        System.out.println("Math.rint(" + value3 + ") = " + rintValue3);

        double rintValue4 = Math.rint(value4);
        System.out.println("Math.rint(" + value4 + ") = " + rintValue4);

        // 使用 Math.round
        long roundValue1 = Math.round(value3);
        long roundValue2 = Math.round(value4);
        System.out.println("Math.round(" + value3 + ") = " + roundValue1);
        System.out.println("Math.round(" + value4 + ") = " + roundValue2);
    }
}

