package test31789;

import java.io.*;
import java.util.StringTokenizer;

public class StartOfAdventure {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());

        boolean canAdventure = false;

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            if(c <= x && p > s) canAdventure = true;
        }

        bw.write(canAdventure ? "YES" : "NO");

        bw.flush();
        bw.close();
        br.close();
    }
}
