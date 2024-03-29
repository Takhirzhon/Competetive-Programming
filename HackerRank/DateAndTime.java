import java.io.*;
import java.util.Scanner;

class Result {


    public static String findDay(int month, int day, int year) {
        Scanner scan = new Scanner(System.in);
        month = scan.nextInt();
        day = scan.nextInt();
        year = scan.nextInt();

        String s;
        s = java.time.LocalDate.of(month, day, year).toString();
        return s;
    }

}

public class DateAndTime {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

        String res = Result.findDay(month, day, year);

        bufferedWriter.write(res);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
