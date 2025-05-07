package test32089;

import java.io.*;

public class MemberTransition {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int max = Integer.MIN_VALUE;
            int n = Integer.parseInt(br.readLine());
            if (n == 0) break;
            int[] arr = new int[n];

            String line = br.readLine();
            String[] parts = line.split(" ");
            int[] nums = new int[parts.length];

            for (int i = 0; i < parts.length; i++) {
                nums[i] = Integer.parseInt(parts[i]);
            }

            for (int i = 0; i < n; i++) {
                if (i < 2) {
                    arr[i] = nums[i];
                } else {
                    arr[i] = nums[i] + nums[i - 1] + nums[i - 2];
                }
            }

            for (int i = 0; i < arr.length; i++) {
                max = Math.max(max, arr[i]);
            }

            sb.append(max + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
