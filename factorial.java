import java.util.*;

public class factorial {

    public static void main(String[] args) {

        // int val = calculateFactorial(5);
        // System.out.println(val);
        // infiniteLoop();
        // detectNums();
        int pow = power(3, 3);
        System.out.println(pow);
    }

    public static int calculateFactorial(int num) {
        // System.out.print(num + " ");
        // if(num==0)
        // {
        // return 1;
        // }
        // else
        // {
        // return num*calculateFactorial(num-1);
        // }

        int fact = 1;
        while (num != 0) {
            fact = fact * num;
            num--;
        }
        return fact;
    }

    public static void infiniteLoop() {
        int num = 1;
        do {

            System.out.print(num + " ");
            num++;
        } while (num >= 1);
    }

    public static void detectNums() {
        int negative = 0;
        int positive = 0;
        int zeroes = 0;
        Scanner sc = new Scanner(System.in);
        int input;
        while (sc.hasNextInt()) {
            input = sc.nextInt();
            if (input < 0)

            {
                negative++;
            } else if (input > 0) {
                positive++;

            } else {
                zeroes++;
            }
        }
        System.out.println("Negative: " + negative + " Positive: " + positive + " Zeroes: "+ zeroes);
    }

    public static int power(int x, int n)
    {
        if(n==0)
        {
            return 1;
        }
        return x*power(x, n-1);
    }

}
