package test29722;

import java.io.*;
import java.util.StringTokenizer;

public class BrSilMeteor {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());
        int day = Integer.parseInt(st.nextToken());

        int periodDays = Integer.parseInt(br.readLine());

        int totalDays = (year * 12 * 30) + ((month - 1) * 30) + (day - 1);
        totalDays += periodDays;

        year = totalDays / (12 * 30);
        int remaining = totalDays % (12 * 30);
        month = (remaining / 30) + 1;
        day = (remaining % 30) + 1;


        bw.write(String.format("%d-%02d-%02d", year, month, day));

        bw.flush();
        bw.close();
        br.close();
    }
}
