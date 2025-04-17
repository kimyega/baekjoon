package test29736;

import java.io.*;
import java.util.StringTokenizer;

public class BesilsFriend {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int start = Integer.parseInt(st1.nextToken());
        int end = Integer.parseInt(st1.nextToken());
        int pNo = Integer.parseInt(st2.nextToken());
        int tgNo = Integer.parseInt(st2.nextToken());
        int count = 0;

        for (int i = start; i <= end; i++) {
            int n = Math.abs(pNo - i);

            if (n <= tgNo) {
                count++;
            }
        }

        if (count == 0) {
            bw.write("IMPOSSIBLE");
        } else {
            bw.write(count + "");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
