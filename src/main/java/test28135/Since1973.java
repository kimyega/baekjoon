package test28135;

import java.io.*;

public class Since1973 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(countNum(n) + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int countNum (int n) {
        int cnt = 0;
        for (int i = 1; ; i++) {
            if (i == n) {
                cnt++;
                break;
            }

            cnt++;
            if (String.valueOf(i).contains("50")) cnt++;
        }
        return cnt;
    }
}
