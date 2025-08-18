public class Mergesort {
    static void merge(int[] arr,int low,int mid,int high){
        int n1=mid-low+1;
        int n2=high-mid;
        int[] l=new int[n1];
        int[] r=new int[n2];
        for(int i=0;i<n1;i++)
            l[i]=arr[low+i];
        for(int j=0;j<n2;j++)
            r[j]=arr[mid+1+j];
        int i=0;
        int j=0;
        int k=low;
        while(i<n1 && j<n2){
            if(l[i]<=r[j]){
                arr[k]=l[i];
                i++;
            }
            else{
                arr[k]=r[j];
                j++;
            }
            k++;
        }
        while(i<n1){
            arr[k]=l[i];
            i++;
            k++;
        }
        while(j<n2){
            arr[k]=r[j];
            j++;
            k++;
        }
    }
    static void mergeSort(int[] arr,int low,int high){
        if(low<high){
            int mid=(low+high)/2;
            mergeSort(arr,low,mid);
            mergeSort(arr, mid + 1, high);
            merge(arr,low,mid,high);
        }
    }
    public static void main(String[] args){
        int[] arr={8,5,1,4,9,6};
        System.out.print("Before Sorting:");
        for(int num:arr)
            System.out.print(num+" ");
        mergeSort(arr,0,arr.length-1);
        System.out.print("\nAfter Sorting:");
        for(int num:arr)
            System.out.print(num+" ");
    }
}
