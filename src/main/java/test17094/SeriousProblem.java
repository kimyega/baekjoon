package test17094;

import java.io.*;

public class SeriousProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int len = Integer.parseInt(br.readLine());

        String word = br.readLine();

        int twoCnt = word.replaceAll("e", "").length();
        int eCnt = len - twoCnt;

        bw.write(twoCnt == eCnt ? "yee" : twoCnt > eCnt ? "2" : "e");

        bw.flush();
        bw.close();
        br.close();
    }
}
