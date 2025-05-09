package test32905;

import java.io.*;
import java.util.StringTokenizer;

public class RACI {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        boolean notMatched = false;
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int caseNo = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        while (caseNo-- > 0) {
            boolean isA = false;

            String line = br.readLine().replaceAll(" ", "");

            for (char c : line.toCharArray()) {

                if (c == 'A' && isA) {
                    isA = false;
                    break;
                }

                if (c == 'A') isA = true;
            }

            if (!isA) {
                notMatched = true;
            }
        }

        bw.write(notMatched ? "No" : "Yes");

        bw.flush();
        bw.close();
        br.close();
    }
}
