package test4696;

import java.io.*;

public class StIves {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            double n = Double.parseDouble(br.readLine());
            if (n == 0) break;
            sb.append(String.format("%.2f\n", howMany(n)));
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }

    static double howMany(double n) {
        double sum = 0;
        for (int i = 0; i < 5; i++) {
            sum += Math.pow(n, i);
        }
        return sum;
    }
}
