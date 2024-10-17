/**
 * test
 */
public class test1 {

    public static void main(String[] args) {


        int n = 5;
        for (int i = 1;i<=n*2;i++) {
            {
                if(i<=n)
                {
                for(int j = 1;j<=n-i+1;j++)
                {
                    System.out.print("*");
                }
                for(int k=1;k<i*2;k++)
                {
                        System.out.print("$");
                }
                for(int j = 1;j<=n-i+1;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else
            {
                for(int j = 1;j<=i-n;j++)
                {
                    System.out.print("*");
                }
                for(int k=2*(2*5-i+1)-1;k>=1;k--)
                {
                        System.out.print("$");
                }
                for(int j = 1;j<=i-n;j++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }

               
        }
           
        }

    }
}