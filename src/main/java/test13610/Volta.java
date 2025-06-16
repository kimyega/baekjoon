package test13610;

import java.io.*;
import java.util.StringTokenizer;

public class Volta {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double x = Double.parseDouble(st.nextToken());
        double y = Double.parseDouble(st.nextToken());

        double time = 1 / (1 / x - 1 / y);
        int res = (int) (Math.ceil(1  / x * time));

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
