package test9783;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class EasyEncryption {

    static StringBuilder makeKey(String word) {
        StringBuilder key = new StringBuilder();

        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                int digit = c + 1 - (Character.isLowerCase(c) ? 'a' : 'A' - 26);
                key.append(String.format("%02d", digit));
            } else if (Character.isDigit(c)) key.append("#" + c);
            else key.append(c);
        }
        return key;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = br.readLine();

        StringTokenizer st = new StringTokenizer(line);

        StringJoiner sj = new StringJoiner(" ");

        while (st.hasMoreTokens()) {
            String word = st.nextToken();
            sj.add(makeKey(word));
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
