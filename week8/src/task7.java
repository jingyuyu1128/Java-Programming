public class task7 {
    public static void main(String[] args){
        int[] mylist=new int[5];
        for(int i=0;i<mylist.length;i++){
            mylist[i]=(int)(Math.random()*10);
            System.out.print(mylist[i]+" ");
        }
        System.out.println();
        for(int i=0;i<mylist.length;i++){
            for(int j=i+1;j<mylist.length;j++){
                if(mylist[j]<mylist[i]){
                    int t=mylist[j];
                    mylist[j]=mylist[i];
                    mylist[i]=t;
                }
            }
        }
        for(int i=0;i<mylist.length;i++){
            System.out.print(mylist[i]+" ");
        }
    }
}
