import java.util.Scanner;
public class Neonnumber {
    public static void main(String[] args){
        int sum=0;
        int num=9;
        int square = num*num;
        square=num*num;
        while(square!=0)
        {
            sum+=square%10;
            square=square/10;
        }
        System.out.print(sum);
        if(sum==num){
            System.out.println("it is neon number");
        }
        else{
            System.out.println("it is not a neon number ");
        }
    }
}
