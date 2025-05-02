package test32684;

import java.io.*;
import java.util.StringTokenizer;

public class JanggiGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        double cho = 0, han = 1.5, count = 2;

        StringTokenizer st;

        while (count-- > 0) {
            st = new StringTokenizer(br.readLine());

            int cha = Integer.parseInt(st.nextToken());
            int po = Integer.parseInt(st.nextToken());
            int ma = Integer.parseInt(st.nextToken());
            int sang = Integer.parseInt(st.nextToken());
            int sa = Integer.parseInt(st.nextToken());
            int jol = Integer.parseInt(st.nextToken());

            int score = cha * 13 + po * 7 + ma * 5 + sang * 3 + sa * 3 + jol * 2;

            if (count == 1) {
                cho += score;
            } else {
                han += score;
            }
        }

        String res = cho < han ? "ekwoo" : "cocjr0208";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
