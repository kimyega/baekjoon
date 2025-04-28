package test26566;

import java.io.*;
import java.util.StringTokenizer;

public class Pizza {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        double pi = Math.PI;

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            StringTokenizer st1 = new StringTokenizer(br.readLine());
            StringTokenizer st2 = new StringTokenizer(br.readLine());

            int a1 = Integer.parseInt(st1.nextToken());
            int p1 = Integer.parseInt(st1.nextToken());
            int r1 = Integer.parseInt(st2.nextToken());
            int p2 = Integer.parseInt(st2.nextToken());

            double ampd1 = (double) a1 / p1;
            double ampd2 = (r1 * r1 * pi) / p2;

            String pizza = ampd1 < ampd2 ? "Whole pizza" : "Slice of pizza";

            sb.append(pizza + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
