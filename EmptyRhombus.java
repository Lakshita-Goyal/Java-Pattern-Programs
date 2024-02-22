public class EmptyRhombus
 {
    public static void main(String[] args)
    {
        int n=5;
        for(int i=1;i<=2*n-1;i++)
        {
            if(i==1||i==2*n-1)
              for(int j=1;j<=2*n-1;j++)
                System.out.print("*");
            else if(i<=n)
            {
                for(int j=i;j<=n;j++)
              System.out.print("*");
              for(int j=2*(i-1)-1;j>=1;j--)
              System.out.print(" ");
              for(int j=i;j<=n;j++)
              System.out.print("*");
            }
            else
            {
                for(int j=n-1;j<i;j++)
                System.out.print("*");
            
            for(int j=1;j<=2*((2*n-i)-1)-1;j++)
            {
                System.out.print(" ");
            } 
            for(int j=n-1;j<i;j++)
            {
                System.out.print("*");
            }
            }
            System.out.println();
        }
    }

}
