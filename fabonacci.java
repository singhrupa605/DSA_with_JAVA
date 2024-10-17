public class fabonacci {
    public static void main(String[] args) {

        fab(
                9);
    }

    public static void fab(int n) {
        int prev = 0;
        int next = 1;
        while (n > 0) {
            System.out.print(prev + " ");
            prev = prev + next;
            next = prev-next;
            n--;
        }

    }

}
