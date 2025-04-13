package test8723;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Patyki {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int[] arr = new int[3];

    for (int i = 0; i < 3; i++) {
      arr[i] = Integer.parseInt(st.nextToken());
    }
    Arrays.sort(arr);

    boolean isRightTriangle = arr[0] * arr[0] + arr[1] * arr[1] == arr[2] * arr[2];
    boolean isEquilateralTriangle = arr[0] == arr[1] && arr[1] == arr[2];

    int res = 0;
    if (isRightTriangle && isEquilateralTriangle) {
      res = 3;
    } else if (isEquilateralTriangle) {
      res = 2;
    } else if (isRightTriangle) {
      res = 1;
    }

    bw.write(res + "");
    bw.flush();
    bw.close();
    br.close();
  }
}
