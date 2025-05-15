package test10102;

import java.io.*;

public class VoteCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String vote = br.readLine();

        int aCnt = vote.replace("B", "").length();
        int bCnt = n - aCnt;

        bw.write(aCnt == bCnt ? "Tie" : aCnt < bCnt ? "B" : "A");

        bw.flush();
        bw.close();
        br.close();
    }
}
