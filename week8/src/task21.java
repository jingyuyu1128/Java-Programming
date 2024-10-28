public class task21 {
    public static void main(String[] args){
        int[] list={2,4,6,74,45,21,12,3,49,56,43,76};
        int j=binarySearch(list,2);
        int k=binarySearch(list,99);
        System.out.println("key index: "+j);
        System.out.println("key index: "+k);
    }
    public static int binarySearch(int[] list,int key){
        int low=0;
        int high=list.length-1;
        while(high>=low){
            int mid=(low+high)/2;
            if(key<list[mid]){
                high=mid-1;
            }
            else if(key==list[mid]){
                return mid;
            }
            else
                low=mid+1;
        }
        return -low-1;
    }
}
