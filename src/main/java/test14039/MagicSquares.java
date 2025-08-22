package test14039;

import java.io.*;
import java.util.StringTokenizer;

public class MagicSquares {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;;
        int n = 4, sum = 0;
        int[] colSum = new int[n];
        boolean isMagic = true;

        for (int i = 0; i < n; i++) {
            int rowSum = 0;
            st = new StringTokenizer(br.readLine());

            for (int j = 0; j < n; j++) {
                int num = Integer.parseInt(st.nextToken());
                colSum[j] += num;
                rowSum += num;
            }

            if (i == 0) sum = rowSum;
            else if (rowSum != sum) isMagic = false;

            if (i == n - 1) {
                for (int cs : colSum) {
                    if (cs != sum) isMagic = false;
                }
            }
        }

        bw.write(isMagic ? "magic" : "not magic");

        bw.flush();
        bw.close();
        br.close();
    }
}
