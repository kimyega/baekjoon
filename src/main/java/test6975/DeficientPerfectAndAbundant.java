package test6975;

import java.io.*;

public class DeficientPerfectAndAbundant {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());
        String NEW_LINE = System.lineSeparator();

        for (int i = 0; i < caseNo; i++) {
            int n = Integer.parseInt(br.readLine());
            int divSum = sumDivisors(n);

            String res = divSum == n ? "a perfect" : divSum < n ? "a deficient" : "an abundant";
            bw.write(n + " is " + res + " number.");

            if (i != caseNo - 1) {
                bw.write(NEW_LINE);
                bw.write(NEW_LINE);
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    static int sumDivisors(int n) {
        int sum = 0;
        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                sum += i;

                if (i != 1 && i != n / i) {
                    sum += n / i;
                }
            }
        }
        return sum;
    }
}
