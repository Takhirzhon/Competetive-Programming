import java.util.Scanner;

public class Primality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        int num = scan.nextInt();
        int i = 0;
        while (test <= i) {
            if (num < 2) {
                System.out.println("No");
            }
            for (int k = 1; k < Math.sqrt(num) ; i += 3) {
                if (num % 2 == 1) {
                    System.out.println("Yes");
                }
            }
        }
        ++i;
    }
}
