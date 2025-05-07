package test28808;

import java.io.*;
import java.util.StringTokenizer;

public class ResultTable {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int caseNo = Integer.parseInt(st.nextToken());
        int len = Integer.parseInt(st.nextToken());
        int count = 0;

        while (caseNo-- > 0) {
            String line = br.readLine();

            for (int i = 0; i < len; i++) {
                char c = line.charAt(i);

                if (c == '+') {
                    count++;
                    break;
                }
            }
        }


        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
