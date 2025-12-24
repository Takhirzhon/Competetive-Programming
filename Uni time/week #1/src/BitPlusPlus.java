import java.util.Scanner;

public class BitPlusPlus {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOfOper = scan.nextInt();

        int counterX = 0;
        for (int i = 0; i < numOfOper; i++) {
            String input = scan.next();
            switch (input) {
                case "++X":
                case "X++":
                    counterX++;
                    break;
                case "X--":
                case "--X":
                    counterX--;
                    break;
            }
        }
        System.out.println(counterX);
    }
}
