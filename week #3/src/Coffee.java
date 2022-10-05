import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int[] array = new int[200007];
        int[] arrayQuery = new int[200007];
        int recipe = scan.nextInt();
        int admissible = scan.nextInt();
        int question = scan.nextInt();

        for (int i = 0; i < recipe; i++) {
            int t1 = scan.nextInt();
            int t2 = scan.nextInt();
            array[t1]++;
            array[t2 + 1]--;
        }
        for (int i = 1; i < 200007; i++) {
            array[i] += array[i - 1];
            if (array[i] >= admissible) {
                arrayQuery[i] += arrayQuery[i - 1] + 1;
            } else {
                arrayQuery[i] += arrayQuery[i - 1];
            }
        }
        for (int i = 0; i < question; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println(arrayQuery[b] - arrayQuery[a - 1]);
        }
    }
}
