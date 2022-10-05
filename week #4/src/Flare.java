import java.util.Scanner;

public class Flare {
    final static double FINAL_GRAV = 9.8;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double v = scan.nextDouble();

        double result = 2 * v / FINAL_GRAV;

        System.out.printf("%.6f", result);
    }
}
