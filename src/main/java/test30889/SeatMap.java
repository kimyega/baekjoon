package test30889;

import java.io.*;

public class SeatMap {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        boolean[][] seats = new boolean[10][20];

        while (n-- > 0) {
            String s = br.readLine();
            char ch = s.charAt(0);
            int row = ch - 'A';
            int col = Integer.parseInt(s.substring(1)) - 1;

            seats[row][col] = true;
        }

        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 20; j++) {
                if (seats[i][j]) sb.append("o");
                else sb.append(".");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
