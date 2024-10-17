public class test4 {
    public static void main(String[] args) {
        int n = 4;
        int[][] result = new int[2 * n - 1][2 * n - 1];

        int start = 0;
        int end = 2 * n - 2;
        for (int num = 4; num >= 1; num--) {

            for (int j = start; j <= end; j++) {

                result[start][j]= num;


            }
            start++;
            for(int k=start;k<=end;k++)
            {
                result[k][end]=num;
            }
            end--;
            

            System.out.println();
        }
    }
}
