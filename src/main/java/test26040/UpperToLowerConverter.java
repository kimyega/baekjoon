package test26040;

import java.io.*;
import java.util.regex.Pattern;

public class UpperToLowerConverter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        String B = br.readLine().replaceAll(" ", "");

        String result = Pattern.compile("[" + B + "]")
                        .matcher(A)
                        .replaceAll(match -> match.group().toLowerCase());

        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
