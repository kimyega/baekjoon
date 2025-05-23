package test2997;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class FourthNumber {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int diff1 = arr[1] - arr[0];
        int diff2 = arr[2] - arr[1];

        int missing = diff1 == diff2 ? arr[2] + diff1 : diff1 < diff2 ? arr[1] + diff1 : arr[0] + diff2;

        bw.write(missing + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
