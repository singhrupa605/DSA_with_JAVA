import java.util.*;
public class gcd {

    
    public static void main(String[] args) {
        
        int gcd = getGcd(18, 12);
        System.out.println(gcd);
    }
    public static int getGcd(int x, int y)
    {
        // int dividend = (x>=y)?x:y;
        //    int quotient = (x<y)?x:y;
        //    int remainder = dividend%quotient;
        //    while(remainder>0)
        //    {
               
        //         dividend = quotient;
        //         quotient = remainder;
        //         remainder = dividend%quotient;
        //    }
        //  return quotient;

         Scanner sc = new Scanner(System.in);
         int n1 = sc.nextInt();
         int n2 = sc.nextInt();
  
  
         while(n1 != n2) { 
             if(n1>n2) {
                 n1 = n1 - n2;
             } else {
                 n2 = n2 - n1;
             }
         }
        return n2;
     
    }
}
