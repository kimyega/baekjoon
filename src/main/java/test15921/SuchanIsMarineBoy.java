package test15921;

import java.io.*;
import java.util.StringTokenizer;

public class SuchanIsMarineBoy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double sum = 0, expSum = 0;

        while (true) {

            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                bw.write("divide by zero");
                break;
            }

            StringTokenizer st = new StringTokenizer(br.readLine());
            while (st.hasMoreTokens()) {
                double num = Double.parseDouble(st.nextToken());
                sum += num;
                expSum += num / n;
            }

            double avg = sum / n;
            double p = avg / expSum;

            bw.write(String.format("%.2f", p));
            break;
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
