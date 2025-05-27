package test6322;

import java.io.*;
import java.util.StringTokenizer;

public class RightTriangleSides {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        for (int i = 1; ; i++) {
            st = new StringTokenizer(br.readLine());
            double a = Double.parseDouble(st.nextToken());
            double b = Double.parseDouble(st.nextToken());
            double c = Double.parseDouble(st.nextToken());

            if (a == 0 && b == 0 && c == 0) break;

            sb.append("Triangle #" + i + "\n");

            if (a == -1) {
                if (b >= c) {
                    sb.append("Impossible.");
                } else {
                    a =  Math.sqrt(c * c - b * b);
                    sb.append(String.format("a = %.3f", a));
                }
            } else if (b == -1) {
                if (a >= c) {
                    sb.append("Impossible.");
                } else {
                    b =  Math.sqrt(c * c - a * a);
                    sb.append(String.format("b = %.3f", b));
                }
            } else if (c == -1) {
                c =  Math.sqrt(a * a + b * b);
                sb.append(String.format("c = %.3f", c));
            }

            sb.append("\n\n");
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
