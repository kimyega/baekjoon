package test11874;

import java.io.*;

public class ZAMKA {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;

        int l = Integer.parseInt(br.readLine());
        int d = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());

        for (int i = l; i <= d; i++) {
            if (getDigitSum(i) == x) {
                min = Math.min(min, i);
                max = Math.max(max, i);
            }
        }

        bw.write(min + "\n" + max);

        bw.flush();
        bw.close();
        br.close();
    }

    static int getDigitSum (int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
