package test26026;

import java.io.*;

public class CoffeeCupCombo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        String line = br.readLine();

        int coffeeCups = 0, attends = 0;

        for (char c : line.toCharArray()) {
            if (c == '1') {
                attends++;
                coffeeCups = 2;
            } else if (coffeeCups-- > 0) {
                attends++;
            }
        }

        bw.write(attends + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
