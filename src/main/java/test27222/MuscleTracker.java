package test27222;

import java.io.*;
import java.util.StringTokenizer;

public class MuscleTracker {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1, st2;
        int muscle = 0;

        int caseNo = Integer.parseInt(br.readLine());
        st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < caseNo; i++) {
            boolean trained = false;
            st2 = new StringTokenizer(br.readLine());

            trained = st1.nextToken().equals("1");

            int x = Integer.parseInt(st2.nextToken());
            int y = Integer.parseInt(st2.nextToken());

            if (trained && x < y) {
                muscle += y - x;
            }
        }

        bw.write(muscle + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
