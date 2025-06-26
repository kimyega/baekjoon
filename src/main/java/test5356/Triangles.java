package test5356;

import java.io.*;
import java.util.StringTokenizer;

public class Triangles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            char ch = st.nextToken().charAt(0);

            sb.append(createTriangle(n, ch));
        }

        sb.delete(sb.length() - 2, sb.length());
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    static String createTriangle(int n, char ch) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            sb.append(String.valueOf(ch).repeat(i)).append("\n");
            if (ch == 'Z') ch = 'A';
            else ch++;
        }
        sb.append("\n");
        return sb.toString();
    }
}
