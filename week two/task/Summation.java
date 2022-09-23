import java.util.Scanner;

class Summation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        long num1;
        long num2;

        while (0 < testCase) {
            num1 = scan.nextLong();
            num2 = scan.nextLong();

            if (num1 == 1) {
                num1++;
            }
            if ((num1 - num2) <= 100000) {

                for (long j = num1; j <= num2; j++) {

                    int count = 0 ;

                    for (long k = 2; k <= j / 2 + 1; k++) {
                        if (j % k == 0) {
                            count = 1;
                            break;
                        }
                    }
                    if (count == 0) {
                        System.out.println(j);
                    }

                }
            }
            testCase--;
        }
    }
}