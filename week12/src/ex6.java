public class ex6 {
    public static void main(String[] args){
        ex4 [] circleArray;
        circleArray=createCircleArray();

        printCircleArray(circleArray);

    }

    public static ex4[] createCircleArray(){
        ex4[] circleArray = new ex4[5];
        for(int i=0;i<circleArray.length;i++){
            circleArray[i] = new ex4(Math.random()*10);
        }
        return circleArray;
    }

    public static void printCircleArray(ex4[] circleArray){
        System.out.printf("%-30s%-15s\n","Radius","Area");
        for(int i=0;i<circleArray.length;i++){
            System.out.printf("%-30f%-15s\n",circleArray[i].getRadius(),circleArray[i].getArea());
        }
    }


}
