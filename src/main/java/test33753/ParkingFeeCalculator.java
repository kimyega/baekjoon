package test33753;

import java.io.*;
import java.util.StringTokenizer;

public class ParkingFeeCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());

        int t = Integer.parseInt(br.readLine());

        int overtime = t - 30;
        int parkingFee = a + (t > 30 ? overtime % b != 0 ? (overtime / b + 1) * c : overtime / b * c : 0);

        bw.write(parkingFee + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
