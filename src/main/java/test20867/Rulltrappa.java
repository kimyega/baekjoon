package test20867;

import java.io.*;
import java.util.StringTokenizer;

public class Rulltrappa {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(st.nextToken());
        int s = Integer.parseInt(st.nextToken());
        int g = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        double a = Double.parseDouble(st.nextToken());
        double b = Double.parseDouble(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int l = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());

        double leftWaitTime = l / a;
        double rightWaitTime = r / b;
        double walkTime = leftWaitTime + (double) m / g;
        double stayTime = rightWaitTime + (double) m / s;

        bw.write(walkTime < stayTime ? "friskus" : "latmask");

        bw.flush();
        bw.close();
        br.close();
    }
}
