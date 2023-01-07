import java.util.Scanner;

public class JavaEOF {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = 1;
        while (scan.hasNext()) {
            String text = scan.nextLine();
            System.out.println(i + " " + text);
            i++;
        }
    }
}
