package test15080;

import java.io.*;
import java.util.StringTokenizer;

public class EverySecondCounts {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine(), " :");
        StringTokenizer st2 = new StringTokenizer(br.readLine(), " :");

        int stHour = Integer.parseInt(st1.nextToken());
        int stMinute = Integer.parseInt(st1.nextToken());
        int stSecond = Integer.parseInt(st1.nextToken());
        int edHour = Integer.parseInt(st2.nextToken());
        int edMinute = Integer.parseInt(st2.nextToken());
        int edSecond = Integer.parseInt(st2.nextToken());

        int startTotalSeconds = stHour * 3600 + stMinute * 60 + stSecond;
        int endTotalSeconds = edHour * 3600 + edMinute * 60 + edSecond;

        int duration;
        if (endTotalSeconds >= startTotalSeconds) {
            duration = endTotalSeconds - startTotalSeconds;
        } else {
            duration = (24 * 3600 - startTotalSeconds) + endTotalSeconds;
        }

        bw.write(duration + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
