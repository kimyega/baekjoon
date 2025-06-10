package test26004;

import java.io.*;

public class HIARC {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int hCnt = 0, iCnt = 0, aCnt = 0, rCnt = 0, cCnt = 0;

        int n = Integer.parseInt(br.readLine());

        String s = br.readLine();

        for (char c : s.toCharArray()) {
            if (c == 'H') hCnt++;
            else if (c == 'I') iCnt++;
            else if (c == 'A') aCnt++;
            else if (c == 'R') rCnt++;
            else if (c == 'C') cCnt++;
        }

        int res = Math.min(Math.min(Math.min(Math.min(hCnt, iCnt), aCnt), rCnt), cCnt);

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
