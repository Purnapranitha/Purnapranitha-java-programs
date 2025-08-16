import java.util.Scanner;
public class staticarray {
    static int linearsearch(int arr[],int key){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    static int binarysearch(int arr[],int key) {
        int low = 0, high = arr.length - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == key) {
                System.out.println("found at middle");
                return mid;
            } else if (arr[mid] < key) {
                low = mid + 1;
            } else
                high = mid - 1;
        }
        return -1;
    }
    static int bubblesort(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (arr[j] >arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return n;
    }
    static void display(int arr[]){
        for(int  x:arr){
            System.out.println(x+"");
        }
        System.out.println();
    }
    public static void main(String []args){
        Scanner sc=new Scanner(System.in);
        int arr[]={50,20,40,10,60,30};
        System.out.println("original array is:");
        display(arr);
        bubblesort(arr);
        System.out.println("array is sorted using bubblesort:");
        display(arr);
        System.out.println("\n enter a value to search using linear search:");
        int key1=sc.nextInt();
        int index1=linearsearch(arr,key1);
        if(index1!=-1)
            System.out.println(key1+" element found at index of "+index1);
        else System.out.println(key1+"not found");
        System.out.println("\n enter a value to search using binary search");
        int key2=sc.nextInt();
        int index2=binarysearch(arr,key2);
        if(index2!=-1)
            System.out.println(key2+" element found at index of  "+index2);
        else System.out.println(key2+"not found");
    }
}