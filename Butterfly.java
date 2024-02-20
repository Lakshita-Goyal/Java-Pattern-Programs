public class Butterfly {
    public static void main(String[] args)
   {
    int n=5;

    for(int i=1;i<=2*n-1;i++)
    {
        if(i<=n)
        {
            for(int j=i;j>=1;j--)
                System.out.print("*");
            for(int j=2*(n-i);j>=1;j--)
                System.out.print(" ");
            for(int j=i;j>=1;j--)
                System.out.print("*");
        }
        else
        {
            for(int j=2*n-i;j>=1;j--)
                System.out.print("*");
            for(int j=2*(i-n);j>=1;j--)
                System.out.print(" ");
            for(int j=2*n-i;j>=1;j--)
                System.out.print("*");
        }
        
        System.out.println();
    }
   }
}
