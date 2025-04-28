package test9782;

import java.io.*;
import java.util.StringTokenizer;

public class Median {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = 0;
        String line = "";

        StringBuilder sb = new StringBuilder();

        while (!(line = br.readLine()).equals("0")) {
            count++;

            StringTokenizer st = new StringTokenizer(line);
            int n = Integer.parseInt(st.nextToken());

            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(st.nextToken());
            }

            double median = n % 2 != 0 ? arr[n / 2] : (arr[n / 2 - 1] + arr[n / 2]) / 2.0;

            sb.append("Case " + count + ": " + String.format("%.1f", median) + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
