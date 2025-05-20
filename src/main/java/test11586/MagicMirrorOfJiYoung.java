package test11586;

import java.io.*;

public class MagicMirrorOfJiYoung {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[][] jiyoung = new char[n][n];

        for (int i = 0; i < n; i++) {
            jiyoung[i] = br.readLine().toCharArray();
        }

        int status = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();


        char[][] mirror = new char[n][n];

        if (status == 1) {
            mirror = jiyoung;
        } else if (status == 2) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mirror[i][j] = jiyoung[i][n - 1 - j];
                }
            }
        } else if (status == 3) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    mirror[i][j] = jiyoung[n - 1 - i][j];
                }
            }
        }

        for (char[] row : mirror) {
            for (char ch : row) {
                sb.append(ch);
            }
            sb.append('\n');
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
