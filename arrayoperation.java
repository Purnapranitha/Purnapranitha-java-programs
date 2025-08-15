import java.util.Scanner;
 class arrayoperations{
    private int[] arr;
    private int size;
    private int capacity;

    public arrayoperations(int capacity) {
        this.capacity = capacity;
        this.arr = new int[capacity];
        this.size = 0;
    }

    public void insert(int value) {
        if (size == capacity) {
            System.out.println("there is no space for inserting the elements");
        }
        arr[size++] = value;
        System.out.println("inserted value is" + value);
    }

    public void delete(int value) {
        int pos = linearsearch(value);
        if (pos==-1) {
            System.out.println("Element not found in these array");
        }
        for (int i = pos; i < size - 1; i++) {
            arr[i] = arr[i + 1];
        }
        size--;
        System.out.println("Deleted value is" + value);
    }
    public void access(int index){
        if(index<0||index>=size){
            System.out.println("invalid index");
        }
        else
        {
            System.out.println("Elements at index"+index+"is"+arr[index]);
        }
    }
    public int linearsearch(int key){
        for(int i=0;i<size;i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
    public void bubblesort(){
        for(int i=0;i<size-1;i++){
            for(int j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("Array is sorted using bubblesort");
    }
    void display(){
        if(size==0){
            System.out.println("Array is empty");
        }
        System.out.println("Array elements are:");
        for(int i=0;i<size;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}
public class arrayoperation{
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        arrayoperations arr = new arrayoperations(10);
        arr.insert(10);
        arr.insert(2);
        arr.insert(9);
        arr.insert(1);
        arr.display();
        arr.access(2);
        arr.delete(9);
        arr.display();
        int searchKey = 2;
        int pos = arr.linearsearch(searchKey);
        if (pos != -1) {
            System.out.println(searchKey + " found at index " + pos);
        } else {
            System.out.println(searchKey + " not found");
            arr.bubblesort();
            arr.display();
        }
    }
}