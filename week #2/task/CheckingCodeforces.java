import java.util.Scanner;

public class CheckingCodeforces {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        while (test-- > 0) {
            char letter = scan.next().charAt(0);
            if("codeforces".indexOf(letter) != -1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}
