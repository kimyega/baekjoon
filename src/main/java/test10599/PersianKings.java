package test10599;

import java.io.*;
import java.util.StringTokenizer;

public class PersianKings {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        while (true) {
            st = new StringTokenizer(br.readLine());
            int birthSt = Integer.parseInt(st.nextToken());
            int birthEd = Integer.parseInt(st.nextToken());
            int deathSt = Integer.parseInt(st.nextToken());
            int deathEd = Integer.parseInt(st.nextToken());

            if (birthSt == 0 && birthEd == 0 && deathSt == 0 && deathEd == 0) break;

            int min = Math.abs(deathSt - birthEd);
            int max = Math.abs(deathEd - birthSt);

            sb.append(min + " " + max + "\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
