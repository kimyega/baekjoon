package test30999;

import java.io.*;
import java.util.StringTokenizer;

public class Democracy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int caseNo = Integer.parseInt(st.nextToken());
        int quesNo = Integer.parseInt(st.nextToken());
        int resCount = 0;


        for (int i = 0; i < caseNo; i++) {
            double pCount = 0;
            String line = br.readLine();

            for (int j = 0; j < quesNo; j++) {
                char ch = line.charAt(j);
                if (ch == 'O') {
                    pCount++;
                }
            }

            if (pCount > quesNo / 2.0) {
                resCount++;
            }
        }

        bw.write(resCount + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
