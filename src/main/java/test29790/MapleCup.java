package test29790;

import java.io.*;
import java.util.StringTokenizer;

public class MapleCup {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int u = Integer.parseInt(st.nextToken());
        int l = Integer.parseInt(st.nextToken());

        if (n >= 1000 && (u >= 8000 || l >= 260)) {
            bw.write("Very Good");
        } else if (n >= 1000) {
            bw.write("Good");
        } else {
            bw.write("Bad");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
