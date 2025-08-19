class queue{
    int front,rear,capacity;
    int arr[];
    queue(int capacity){
        this.capacity=capacity;
        arr=new int [capacity];
        front=0;
        rear=-1;
    }
    boolean isFull(){
        return rear==capacity-1;
    }
    boolean isEmpty(){
        return front>rear;
    }
    void enqueue(int item){
        if(isFull()){
            System.out.println("queue overflow");
        return;
        }
        arr[++rear]=item;
        System.out.println(item+" enqueue to queue");
    }
    int dequeue(){
        if(isEmpty()){
            System.out.println("Queue underflow");
            return -1;
        }
        return arr[front++];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return arr[front];
    }
    void display(){
        if(isEmpty()){
            System.out.println("queue is empty now");
            return;
        }
        System.out.println(" queue elements are:");
        for(int i=front;i<=rear;i++){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}
public class queueExample {
public static void main(String []args){
    queue Q=new queue(5);
    Q.enqueue(10);
    Q.enqueue(13);
    Q.enqueue(9);
    Q.enqueue(93);
    Q.display();
    System.out.println("front element is:"+Q.peek());
    System.out.println("dequeue:"+Q.dequeue());
    Q.display();
}
}
