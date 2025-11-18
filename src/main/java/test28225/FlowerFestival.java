package test28225;

import java.io.*;
import java.util.StringTokenizer;

public class FlowerFestival {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int f = Integer.parseInt(st.nextToken());

        int fstCar = 0;
        double minTime = Double.MAX_VALUE;

        for (int i = 1; i <= n; i++) {
            st = new StringTokenizer(br.readLine());
            int xi = Integer.parseInt(st.nextToken());
            int vi = Integer.parseInt(st.nextToken());

            double time = (double) (f - xi) / vi;
            if (time < minTime) {
                minTime = time;
                fstCar = i;
            }
        }

        bw.write(fstCar + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
