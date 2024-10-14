public class task14 {
    public static void main(String[] args) {
        double initialTuition = 10000.0;
        double targetTuition = initialTuition * 2;
        double rate = 0.07;
        int years = 0;


        while (initialTuition < targetTuition) {
            initialTuition += initialTuition * rate;
            years++;
        }


        System.out.println("It will take " + years + " years for the tuition to double.");
    }
}
