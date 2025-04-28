package test26736;

import java.io.*;

public class WynikMeczu {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cntA = 0, cntB = 0;
        String line = br.readLine();

        for (int i = 0; i < line.length(); i++) {
            if (line.charAt(i) == 'A') {
                cntA++;
            } else if (line.charAt(i) == 'B') {
                cntB++;
            }
        }

        bw.write(cntA + " : " + cntB);

        bw.flush();
        bw.close();
        br.close();
    }
}
