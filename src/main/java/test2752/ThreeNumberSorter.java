package test2752;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class ThreeNumberSorter {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int[] arr = new int[3];
        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        for (int num : arr) {
            bw.write(num + " ");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
