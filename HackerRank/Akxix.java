import java.util.Scanner;

import static java.lang.Math.sqrt;

public class Akxix {
    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        float x1, y1, x2, y2 ;
        x1 = a.nextFloat();
        y1 = a.nextFloat();
        x2 = a.nextFloat();
        y2 = a.nextFloat();
        float dis= (float) sqrt(Math.pow(x2-x1,2) + Math.pow(y2-y1,2));
        System.out.printf("%.4f\n",dis);
    }
}
