import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Decrypt {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String encryptedMessage = bufferedReader.readLine();
        String result = decryptMessage(encryptedMessage);
        System.out.println(result);
    }

    public static String decryptMessage(String encryptedMessage) {
        StringBuilder builder = new StringBuilder();
        char previousChar = ' ';
        int count = 0;
        List<String> words = new ArrayList<>();

        for (char c : encryptedMessage.toCharArray()) {
            if (Character.isDigit(c) && previousChar != ' ') {
                count = count * 10 + Character.getNumericValue(c);
            } else {
                if (count > 0) {
                    count--;
                    builder.append(String.join("", Collections.nCopies(count, String.valueOf(previousChar))));
                    count = 0;
                }
                builder.append(c);
                previousChar = c;
                if (c == ' ') {
                    words.add(builder.toString());
                    builder.setLength(0);
                }
            }
        }

        if (count > 0) {
            count--;
            builder.append(String.join("", Collections.nCopies(count, String.valueOf(previousChar))));
        }
        words.add(builder.toString());

        Collections.reverse(words);

        return String.join(" ", words);
    }
}
