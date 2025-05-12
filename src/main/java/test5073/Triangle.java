package test5073;

import java.io.*;
import java.util.StringTokenizer;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            int max = Math.max(a, Math.max(b, c));
            int sum = a + b + c;

            if (sum == 0) break;

            boolean isTriangle = sum > max * 2;
            boolean isAllEqual = a == b && b == c;
            boolean isEqual = a == b || b == c || c == a;

            String triangle = !isTriangle ? "Invalid" : isAllEqual ? "Equilateral" : isEqual ? "Isosceles" : "Scalene";

            sb.append(triangle).append('\n');
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
