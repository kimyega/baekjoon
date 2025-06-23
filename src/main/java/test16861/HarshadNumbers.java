package test16861;

import java.io.*;

public class HarshadNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        int res = n;

        while (res > 0){
            String nStr = String.valueOf(res);
            int sum = 0;

            for (char c : nStr.toCharArray()) {
                sum += c - '0';
            }

            if (res % sum == 0) break;
            res++;
        }

        bw.write(res + "");
        bw.flush();
        bw.close();
        br.close();
    }
}
