public class testex4 {
    public static void main(String[] args){
        ex4 myCircle=new ex4(5.0);
        System.out.println("The area of the circle of radius"+
                myCircle.getRadius()+" is "+myCircle.getArea());

        myCircle.setRadius(myCircle.getRadius()*1.1);
        System.out.println("The area of the circle of radius "+
                myCircle.getRadius()+" is "+myCircle.getArea());

        System.out.println("The number of objects created is "+
                ex4.getNumberOfObjects());
    }
}
