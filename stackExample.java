class stack{
    int top;
    int capacity;
    int arr[];
    stack(int capacity){
        this.capacity=capacity;
        top=-1;
        arr=new int[capacity];
    }
    boolean isFull(){
        return top==capacity-1;
    }
    boolean isEmpty(){
        return top==-1;
    }
    void push(int item){
        if(isFull()){
            System.out.println("stack overflow");
            return;
        }
        top++;
        arr[top]=item;
        System.out.println(item+" pushed");
    }
    int pop(){
        if(isEmpty()){
            System.out.println("stack underflow");
            return -1;
        }
        return arr[top--];
    }
    int peek(){
        if(isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }
        return arr[top];
    }
    void display(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        System.out.println("stack elements are:");
        for(int i=top;i>=0;i--){
            System.out.println(arr[i]+"");
        }
        System.out.println();
    }
}
public class stackExample {
    public static void main(String []args){
        stack s=new stack(5);
        s.push(13);
        s.push(10);
        s.display();
        System.out.println("popped elements are:"+s.pop());
        System.out.println("top element is:"+s.peek());
        s.push(12);
        s.push(9);
        s.display();
    }
}
