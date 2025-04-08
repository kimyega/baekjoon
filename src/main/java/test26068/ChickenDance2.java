package test26068;

import java.io.*;

public class ChickenDance2 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < caseNo; i++) {
            int n = Integer.parseInt(br.readLine().substring(2));
            if (n <= 90) {
                count++;
            }
        }

        bw.write(count + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
