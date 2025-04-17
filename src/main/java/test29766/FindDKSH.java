package test29766;

import java.io.*;

public class FindDKSH {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String word = br.readLine();

        String res = word.replaceAll("DKSH", "");
        int cnt = (word.length() - res.length()) / 4;

        bw.write(cnt + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
