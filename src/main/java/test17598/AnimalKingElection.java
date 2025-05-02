package test17598;

import java.io.*;

public class AnimalKingElection {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = 9, tCount = 0, lCount = 0;

        while (n-- > 0) {
            String s = br.readLine();

            if (s.equals("Tiger")) {
                tCount++;
            } else {
                lCount++;
            }
        }

        String king = tCount < lCount ? "Lion" : "Tiger";
        bw.write(king);

        bw.flush();
        bw.close();
        br.close();
    }
}
