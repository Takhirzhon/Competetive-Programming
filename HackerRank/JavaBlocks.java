import java.util.Scanner;

public class JavaBlocks {

    public static Scanner scanner = new Scanner(System.in);
    public static int B = getB();
    public static int H = getH();
    public static boolean flag = res();

    private static int getB() {
        return scanner.nextInt();
    }

    private static int getH() {
        return scanner.nextInt();

    }

    private static boolean res() {
        try {
            if (B > 0 && H > 0) {
                return true;
            } else {
                throw (new Exception("Breadth and height must be positive"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        if (flag) {
            int area = B * H;
            System.out.print(area);
        }
    }//end of main

}//end of class

