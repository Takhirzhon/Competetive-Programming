import java.util.Scanner;

public class SquareString {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
         int x = scan.nextInt();
         while (x <= 100 && x >= 1) {
            x--;
            String input = scan.next();
            int counter = 0;
            int letter = input.length() / 2;
            if (input.length() == 1) {
               System.out.println("NO");
            } else if (input.length() % 2 ==0) {
                for(int i = 0; i < letter; i++ ) {
                    if (input.charAt(i) == input.charAt( letter + i)) {
                        counter++;
                    }
                }

                if (counter == letter)
                    System.out.println("Yes");
                else
                    System.out.println("NO");
            }
            else System.out.println("NO");
         }
       scan.close();
    }
}
