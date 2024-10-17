public class bitOperatiion {
    
    public static void main(String[] args) {
      
        updateBit(5, 2,0);
    }

    public static void getBit(int n , int pos)
        {
        int bitMask =  1<<pos;
        if((bitMask & n) == 0)   // And
        {
            System.out.println("bit was 0");
        }
        else
        {
            System.out.println("bit was 1");
        }
    }

    public static void setBit(int n, int pos)
    {
        int bitMask = 1<<pos;
        int result  = bitMask|n;  //OR
        System.out.println(result);

    }
    public static void clearBit(int n, int pos)
    {
        int bitMask = 1<<pos;
        int not = ~(bitMask); // Not
        int result= n & not; // And
        System.out.println(result);
    }

    public static void updateBit(int n, int pos, int bit)
    {
        int bitMask = 1<<pos;

        if(bit == 0)
        {
            int not = ~ (bitMask); // Not
            int result= n & not; // And
            System.out.println(result);
        }
        else
        {
            int result = bitMask | n;
            System.out.println(result);
        }
       
    }
    
}
