package test20976;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class TheSecondLargestInteger {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);
        int mid = arr[1];

        bw.write(mid + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
