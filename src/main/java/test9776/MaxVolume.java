package test9776;

import java.io.*;
import java.util.StringTokenizer;

public class MaxVolume {

    static final double PI = Math.PI;

    static double getVolume(char type, double r, double h) {

        return switch (type) {
            case 'C' -> getCone(r, h);
            case 'L' -> getCylinder(r, h);
            case 'S' -> getSphere(r);
            default  -> 0;
        };
    }

    static double getCone (double r, double h) {
        return 1 / 3.0 * PI * r * r * h;
    }

    static double getCylinder (double r, double h) {
        return PI * r * r * h;
    }

    static double getSphere (double r) {
        return 4 / 3.0 * PI * r * r * r;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        double maxVolume = 0;

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            char type = st.nextToken().charAt(0);
            double r = Double.parseDouble(st.nextToken());
            double h = 0;

            if (type != 'S') h = Double.parseDouble(st.nextToken());

            maxVolume = Math.max(maxVolume, getVolume(type, r, h));
        }

        bw.write(String.format("%.3f", maxVolume));

        bw.flush();
        bw.close();
        br.close();
    }
}
