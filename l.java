/*
        1
       2 2
      3 3 3
     4 4 4 4
    5 5 5 5 5
 */
public class l {
    public static void pattern(int n) {
        for (int i = 1; i <= n; i++) {
            // spaces-(n-i)
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // number-(2*i-1)
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        pattern(5);
    }
}
