package test30802;

import java.io.*;
import java.util.StringTokenizer;

public class WelcomeKit {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int tshirt = 0;

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());

        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int tset = Integer.parseInt(st2.nextToken());
        int pset = Integer.parseInt(st2.nextToken());

        while (st1.hasMoreTokens()) {
            int size = Integer.parseInt(st1.nextToken());

            tshirt += size % tset == 0 ? size / tset : size / tset + 1;
        }

        int pen = n / pset;
        int modPen = n % pset;

        bw.write(tshirt + "\n" + pen + " " + modPen);

        bw.flush();
        bw.close();
        br.close();
    }
}
