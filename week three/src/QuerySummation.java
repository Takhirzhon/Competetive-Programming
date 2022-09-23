import java.util.Scanner;

public class QuerySummation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();
        int[] array = new int[number];

        for (int i = 0; i < number; i++) {
            array[i] = scan.nextInt(); //reads elements from the user
        }

        int[] prefix = new int[number];
        prefix[0] = array[0];
        for (int i = 1; i < number; i++) {
            prefix[i] = prefix[i - 1] + array [i];
        }

        int query = scan.nextInt();
        for (int i = 0;  i < query; i++) {
            int left = scan.nextInt();
            int right = scan.nextInt();
            if ( left == 0) {
                System.out.println(prefix[right]);
            } else {
                System.out.println(prefix[right] - prefix[left - 1]);
            }
        }
    }
}