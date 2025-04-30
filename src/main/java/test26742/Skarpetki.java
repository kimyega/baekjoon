package test26742;

import java.io.*;

public class Skarpetki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String line = br.readLine();
        int len = line.length();

        int bCount = len - line.replaceAll("C", "").length();
        int cCount = len - bCount;

        int res = bCount / 2 + cCount / 2;
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
