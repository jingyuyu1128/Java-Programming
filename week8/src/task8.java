public class task8 {
    public static void main(String[] args){
        int[] mylist=new int[5];
        for(int i=0;i<mylist.length;i++){
            mylist[i]=(int)(Math.random()*10);
            System.out.print(mylist[i]+" ");
        }
        System.out.println();
        int t=mylist[0];
        for(int i=0;i<mylist.length-1;i++){
            mylist[i]=mylist[i+1];
        }
        mylist[mylist.length-1]=t;
        for(int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+" ");
        }
    }
}
