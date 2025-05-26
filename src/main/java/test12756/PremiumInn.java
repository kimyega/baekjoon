package test12756;

import java.io.*;
import java.util.StringTokenizer;

public class PremiumInn {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int attackA = Integer.parseInt(st.nextToken());
        int lifeA = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int attackB = Integer.parseInt(st.nextToken());
        int lifeB = Integer.parseInt(st.nextToken());


        while (lifeA > 0 && lifeB > 0) {
            lifeA -= attackB;
            lifeB -= attackA;
        }

        bw.write(lifeA <= 0 && lifeB <= 0 ? "DRAW" : lifeA > lifeB ? "PLAYER A" : "PLAYER B");

        bw.flush();
        bw.close();
        br.close();
    }
}
