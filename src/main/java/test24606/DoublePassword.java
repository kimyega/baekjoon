package test24606;

import java.io.*;

public class DoublePassword {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String pw1 = br.readLine();
        String pw2 = br.readLine();

        int count = 0;

        for (int i = 0; i < 10000; i++) {
            String attempt = String.format("%04d", i);

            boolean valid = true;

            for (int j = 0; j < 4; j++) {
                char c = attempt.charAt(j);
                if (c != pw1.charAt(j) && c != pw2.charAt(j)) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                count++;
            }
        }

        System.out.println(count);
    }
}
