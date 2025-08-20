package test18063;

import java.io.*;
import java.util.StringTokenizer;

public class JazzEnthusiast {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st1.nextToken());
        int c = Integer.parseInt(st1.nextToken());

        StringTokenizer st2;
        int totalSeconds = 0;

        String line;
        while ((line = br.readLine()) != null) {
            st2 = new StringTokenizer(line, ":");
            int mm = Integer.parseInt(st2.nextToken());
            int ss = Integer.parseInt(st2.nextToken());

            totalSeconds += ss + mm * 60;
        }

        totalSeconds -= (n - 1) * c;

        int seconds = totalSeconds % 60;
        int minuates = (totalSeconds / 60) % 60;
        int hours = totalSeconds / 3600;

        bw.write(String.format("%02d:%02d:%02d", hours, minuates, seconds));

        bw.flush();
        bw.close();
        br.close();
    }
}
