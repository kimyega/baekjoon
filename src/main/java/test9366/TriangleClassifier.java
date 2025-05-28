package test9366;

import java.io.*;
import java.util.StringTokenizer;

public class TriangleClassifier {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 1; i <= caseNo; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());

            boolean isNotTriangle = a + b <= c || a + c <= b || b + c <= a;
            boolean isEquilateral = (a == b) && (a == c);
            boolean isIsosceles = (a == b) || (a == c) || (b == c);

            String res = isNotTriangle ? "invalid!" : isEquilateral ? "equilateral" : isIsosceles ? "isosceles" : "scalene";

            sb.append("Case #" + i + ": " + res + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
