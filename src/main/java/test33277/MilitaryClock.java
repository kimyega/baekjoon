package test33277;

import java.io.*;
import java.util.StringTokenizer;

public class MilitaryClock {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int days = Integer.parseInt(st.nextToken());
        int completeDays = Integer.parseInt(st.nextToken());

        double rate = completeDays / (double) days;

        int minutes = (int) (24 * 60 * rate);
        int hours = minutes / 60;
        int minute = minutes % 60;

        bw.write(String.format("%02d:%02d", hours, minute));

        bw.flush();
        bw.close();
        br.close();
    }
}
