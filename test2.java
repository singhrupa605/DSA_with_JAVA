public class test2 {
    public static void main(String[] args) {
        
        int n =5;
        for(int i = 1;i<=n*2;i++)
        {
            if(i<=n)
            {
                for(int j=1;j<=i;j++)
                { 
                    System.out.print("*");
                }
                for(int k = 2*(n-i);k>=1;k--)

                {
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++)
                { 
                    System.out.print("*");
                }
                System.out.println(" ");
            }
        
          else
          {
            
            for(int j = 1;j<=2*n-i;j++)
            {
                System.out.print("*");
            }
            for(int k =1;k<=2*(i-n);k++)

                {
                    System.out.print(" ");
                }
            for(int j=1;j<=2*n-i;j++)
                { 
                    System.out.print("*");
                }
            System.out.println(" ");
          }
           
        }
    }
}
