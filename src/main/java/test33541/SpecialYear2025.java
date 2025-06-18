package test33541;

import java.io.*;

public class SpecialYear2025 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int res = -1;

        int x = Integer.parseInt(br.readLine());

        for (int i = 1000; i < 10000; i++) {
            int specialYear = specialYear(i);
            if (specialYear == i && specialYear > x) {
                res = i;
                break;
            }
        }

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static int specialYear(int year) {
        int sum = 0;
        for (int i = 0; i < 2; i++) {
            sum += year % 100;
            year /= 100;
        }
        return sum * sum;
    }
}
