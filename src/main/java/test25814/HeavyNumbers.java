package test25814;

import java.io.*;
import java.util.StringTokenizer;

public class HeavyNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String aStr = st.nextToken();
        String bStr = st.nextToken();

        int aLen = aStr.length();
        int bLen = bStr.length();

        int aSum = 0, bSum = 0;

        for (int i = 0; i < aLen; i++) {
            aSum += aStr.charAt(i) - '0';
        }

        for (int i = 0; i < bLen; i++) {
            bSum += bStr.charAt(i) - '0';
        }

        int aWeight = aLen * aSum;
        int bWeight = bLen * bSum;

        bw.write(aWeight == bWeight ? "0" : aWeight > bWeight ? "1" : "2");

        bw.flush();
        bw.close();
        br.close();
    }
}
