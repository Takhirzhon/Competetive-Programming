import java.util.Scanner;

public class MultiSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        String[] arr = input.split(" ");

        System.out.println(sumArray(arr));
    }

    public static String sumArray(String[] arr) {
        StringBuilder sb = new StringBuilder();
        int sum = 0;

        for (String s : arr) {
            try {
                sum += Integer.parseInt(s.trim());
            } catch (NumberFormatException e) {
                sb.append(s.trim());
            }
        }

        if (sb.length() == 0) {
            return String.valueOf(sum);
        } else {
            return sb.toString();
        }
    }
}
