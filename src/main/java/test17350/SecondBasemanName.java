package test17350;

import java.io.*;

public class SecondBasemanName {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        boolean hasName = false;

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            String word = br.readLine();

            if (word.equals("anj")) hasName = true;
        }

        bw.write(hasName ? "뭐야;" : "뭐야?");

        bw.flush();
        bw.close();
        br.close();
    }
}
