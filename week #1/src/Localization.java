import java.util.Scanner;

public class Localization {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        String output = null;


        if (num >= 1 && num <= 4) {
            output = "few";
        }
        if (num >= 5 && num <= 9) {
            output = "several";
        }
        if (num >= 10 && num <= 19) {
            output = "pack";
        }
        if (num >= 20 && num <= 49) {
            output = "lots";
        }
        if (num >= 50 && num <= 99) {
            output = "horde";
        }
        if (num >= 100 && num <= 249) {
            output = "throng";
        }
        if (num >= 250 && num <= 499) {
            output = "swarm";
        }
        if (num >= 500 && num <= 999) {
            output = "zounds";
        }
        if (num >= 1000 && num <= 2000) {
            output = "legion";
        }
        System.out.println(output);
    }
}