package test3554;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class EnigmaticDevice {

    static int[] arr;

    static void squareMod2010 (int l, int r) {
        for (int i = l - 1; i < r; i++) {
            arr[i] = arr[i] * arr[i] % 2010;
        }
    }
    static long getSum (int l, int r) {
        return Arrays.stream(arr, l - 1, r).sum();
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());
        arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int m = Integer.parseInt(br.readLine());

        while (m-- > 0) {
            st = new StringTokenizer(br.readLine());
            int k = Integer.parseInt(st.nextToken());
            int l = Integer.parseInt(st.nextToken());
            int r = Integer.parseInt(st.nextToken());

            if (k == 1) squareMod2010(l, r);
            else if (k == 2) sb.append(getSum(l, r)).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
