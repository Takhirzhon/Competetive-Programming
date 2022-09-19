import java.util.Scanner;

public class Primality {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int test = scan.nextInt();
        while (test-- > 0) {
            boolean chk = true;
            int num = scan.nextInt();
            if (num == 1) {
                System.out.println("no");
                continue;
            }
            if (num == 2) {
                System.out.println("yes");
                continue;
            }
            for (int k = 2; k < num/2 + 1; k++) {
                if (num % k == 0) {
                    System.out.println("no");
                    chk = false;
                    break;
                }
            }
            if (chk) {
                System.out.println("yes");
            }
        }
    }
}
