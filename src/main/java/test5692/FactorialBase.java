package test5692;

import java.io.*;

public class FactorialBase {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;

            int cnt = 0, sum = 0;
            while (n > 0){
                int pec = 1;

                cnt++;
                for (int i = 1; i <= cnt; i++) pec *= i;

                sum += n % 10 * pec;
                n /= 10;
            }

            sb.append(sum).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
