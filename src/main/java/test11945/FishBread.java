package test11945;

import java.io.*;
import java.util.StringTokenizer;

public class FishBread {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int caseNo = Integer.parseInt(st.nextToken());
        int lineLength = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();
        while (caseNo-- > 0) {
            String line = br.readLine();
            for (int i = lineLength - 1; i >= 0; i--) {
                sb.append(line.charAt(i));
            }
            sb.append('\n');
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
