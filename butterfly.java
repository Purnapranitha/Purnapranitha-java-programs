public class butterfly{
    public static void main(String[] args) {
        int n=4;
        for(int i=1;i<=n;i++)
        {
            int star=i;
            int space=2*(n-i);
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            for(int j=1;j<=space;j++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=star;j++)
            {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for(int i=n-1;i>=1;i--)
        {
        int star=i;
        int space=2*(n-i);
        for(int j=1;j<=star;j++)
        {
            System.out.print("*");
        }
        for(int j=1;j<=space;j++)
        {
            System.out.print(" ");
        }
        for(int j=1;j<=star;j++)
        {
         System.out.print("*");
        }
        System.out.println("");
    }
    }
}