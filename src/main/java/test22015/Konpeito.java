package test22015;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Konpeito {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] nums = new int[3];
    int max = 0, res = 0;

    for (int i = 0; i < 3; i++) {
      int n = Integer.parseInt(st.nextToken());
      nums[i] = n;
    }

    Arrays.sort(nums);
    max = nums[nums.length - 1];

    for(int num : nums) {
      res += max - num;
    }

    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
