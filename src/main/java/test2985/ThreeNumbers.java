package test2985;

import java.io.*;
import java.util.StringTokenizer;

public class ThreeNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        char ch1 = '0';
        char ch2 = '0';


        if (a + b == c) {
            ch1 = '+';
            ch2 = '=';
        } else if (a - b == c) {
            ch1 = '-';
            ch2 = '=';
        } else if (a * b == c) {
            ch1 = '*';
            ch2 = '=';
        } else if (a / b == c) {
            ch1 = '/';
            ch2 = '=';
        } else if (a == b + c) {
            ch1 = '=';
            ch2 = '+';
        } else if (a == b - c) {
            ch1 = '=';
            ch2 = '-';
        } else if (a == b * c) {
            ch1 = '=';
            ch2 = '*';
        } else if (a == b / c) {
            ch1 = '=';
            ch2 = '/';
        }

        sb.append(a).append(ch1).append(b).append(ch2).append(c);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
