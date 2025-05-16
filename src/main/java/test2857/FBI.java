package test2857;

import java.io.*;
import java.util.StringJoiner;

public class FBI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean isFBI = false;

        StringJoiner sj = new StringJoiner(" ");

        for (int i = 1; i <= 5; i++) {
            String str = br.readLine();

            if (str.contains("FBI")) {
                isFBI = true;
                sj.add(i + "");
            }
        }

        bw.write(isFBI ? sj.toString() : "HE GOT AWAY!");

        bw.flush();
        bw.close();
        br.close();
    }
}
