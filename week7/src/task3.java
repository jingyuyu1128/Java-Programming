public class task3 {
    public static void main(String[] args){
        System.out.print("The grade is ");
        printGrade(78.5);
        System.out.print("The grade is ");
        printGrade(59.5);

    }
    public static void printGrade(double grade){
        if(grade>=90.0){
            System.out.println("your mark is A");
        }
        else if(grade>=80.0){
            System.out.println("Your mark is B");
        }
        else if(grade>=70){
            System.out.println("Your mark is C");
        }
        else if(grade>=60){
            System.out.println("Your mark is D");
        }
        else{
            System.out.println("Your mark is E");
        }
    }
}

