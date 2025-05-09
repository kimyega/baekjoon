package test27240;

import java.io.*;
import java.util.StringTokenizer;

public class ElectricTrainFare {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int t = Integer.parseInt(st.nextToken());

        boolean isOutside = s <= a && t <= a || s >= b && t >= b;
        boolean isCity = s > a && s < b && t > a && t < b;
        String fareType = isOutside ? "Outside" : isCity ? "City" : "Full";

        bw.write(fareType);

        bw.flush();
        bw.close();
        br.close();
    }
}
