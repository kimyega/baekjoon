package test4493;

import java.io.*;
import java.util.StringJoiner;
import java.util.StringTokenizer;

public class GawiBawiBo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            int p1Score = 0, p2Score = 0;
            int n = Integer.parseInt(br.readLine());

            while (n-- > 0) {
                st = new StringTokenizer(br.readLine());

                char p1 = st.nextToken().charAt(0);
                char p2 = st.nextToken().charAt(0);

                boolean isTile = p1 == p2;
                boolean isP1Win = p1 == 'R' && p2 == 'S' || p1 == 'S' && p2 == 'P' || p1 == 'P' && p2 == 'R';

                if (isP1Win) {
                    p1Score++;
                } else if (!isTile) {
                    p2Score++;
                }
            }

            String res = p1Score == p2Score ? "TIE" : p1Score > p2Score ? "Player 1" : "Player 2";
            sj.add(res);
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
