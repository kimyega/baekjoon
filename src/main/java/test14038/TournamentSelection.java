package test14038;

import java.io.*;

public class TournamentSelection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;

        for (int i = 0; i < 6; i++) {
            String s = br.readLine();
            if (s.equals("W")) {
                count++;
            }
        }

        if (count == 0) {
            bw.write("-1");
        } else if (count <= 2) {
            bw.write("3");
        } else if (count <= 4) {
            bw.write("2");
        } else if (count <= 6) {
            bw.write("1");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
