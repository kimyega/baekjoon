package test30033;

import java.io.*;
import java.util.StringTokenizer;

public class RustStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());

        int count = 0;
        for (int i = 0; i < caseNo; i++) {
            int tgp = Integer.parseInt(st1.nextToken());
            int wkp = Integer.parseInt(st2.nextToken());

            if (tgp <= wkp) {
                count++;
            }
        }

        bw.write(count + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
