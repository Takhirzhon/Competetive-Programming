import java.util.Scanner;

public class JavaLoopII {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();

        for (int i = 0; i < test; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for (int k = 0; k < n; k++) {
                a = a + (int)Math.pow(2, k) * b;
                System.out.print(a + " ");
            }
            System.out.println();
        }

    }
}