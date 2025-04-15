package test16693;

import java.io.*;
import java.util.StringTokenizer;

public class PizzaDeal {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int a1 = Integer.parseInt(st1.nextToken());
        int p1 = Integer.parseInt(st1.nextToken());
        int r2 = Integer.parseInt(st2.nextToken());
        int p2 = Integer.parseInt(st2.nextToken());

        double pi = Math.PI;
        double pizz1 = (double) a1 / p1;
        double pizz2 = (double) r2 * r2 * pi / p2;
        String res = pizz1 > pizz2 ? "Slice of pizza" : "Whole pizza";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
