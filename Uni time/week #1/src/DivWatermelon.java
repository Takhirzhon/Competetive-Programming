import java.util.Scanner;

public class DivWatermelon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int watermelon = scan.nextInt();
        if (watermelon > 2) {
            if (watermelon % 2 == 0 && watermelon >= 1 & watermelon <= 100)
                System.out.println("YES");
            else
                System.out.println("NO");
        } else
            System.out.println("NO");
    }
}
