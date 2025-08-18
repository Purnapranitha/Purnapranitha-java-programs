public class Quicksort {
    static int partition(int[] arr,int low,int high){
        int pivot=arr[high];
        int i=low-1;
        for(int j=low;j<high;j++){
            if(arr[j]<pivot){
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        int temp=arr[i+1];
        arr[i+1]=arr[high];
        arr[high]=temp;
        return i+1;
    }
    static void Quicksort(int []arr,int low,int high){
        if(low<high){
            int pi=partition(arr,low,high);
            Quicksort(arr,low,pi-1);
            Quicksort(arr,pi+1,high);
        }
    }
    public static void main(String []args){
        int []arr={10,50,45,60,5,80,66,100};
        System.out.println("Before quicksort the elements are:");
        for(int i:arr)
            System.out.println(i+"");
        Quicksort(arr,0,arr.length-1);
        System.out.println("Elements are the quicksort are: ");
        System.out.println();
        for(int i:arr)
            System.out.println(i+"");
    }
}
