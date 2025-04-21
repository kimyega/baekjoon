package test31962;

import java.io.*;
import java.util.StringTokenizer;

public class GoToSchool {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int caseNo = Integer.parseInt(st.nextToken());
        int limitTime = Integer.parseInt(st.nextToken());

        int minStop = -1;
        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());

            int stopTime = Integer.parseInt(st1.nextToken());
            int moveTime = Integer.parseInt(st1.nextToken());


            if (stopTime + moveTime <= limitTime) {
                minStop = Math.max(minStop, stopTime);
            }
        }

        bw.write(minStop + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
