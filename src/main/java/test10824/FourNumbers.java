package test10824;

import java.io.*;
import java.util.StringTokenizer;

public class FourNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();
        String b = st.nextToken();
        String c = st.nextToken();
        String d = st.nextToken();

        long sum = Long.parseLong(a + b) + Long.parseLong(c + d);
        bw.write(sum + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
