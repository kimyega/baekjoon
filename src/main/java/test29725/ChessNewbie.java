package test29725;

import java.io.*;

public class ChessNewbie {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int[] alpha = new int[26];
        int white = 0, black = 0;
        alpha['P' - 'A'] = 1;
        alpha['N' - 'A'] = 3;
        alpha['B' - 'A'] = 3;
        alpha['R' - 'A'] = 5;
        alpha['Q' - 'A'] = 9;

        for (int i = 0; i < 8; i++) {
            String line = br.readLine();

            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);

                if (c == '.') continue;

                if (Character.isUpperCase(c)) {
                    white += alpha[c - 'A'];
                } else {
                    black += alpha[c - 'a'];
                }
            }
        }

        int res = white - black;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
