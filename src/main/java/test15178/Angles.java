package test15178;

import java.io.*;
import java.util.StringTokenizer;

public class Angles {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int sum = 0;
            String line = br.readLine();
            st = new StringTokenizer(line);

            while (st.hasMoreTokens()) {
                sum += Integer.parseInt(st.nextToken());
            }

            sb.append(line).append(sum == 180 ? " Seems OK" : " Check").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
