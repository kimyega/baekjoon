package test24348;

import java.io.*;
import java.util.StringTokenizer;

public class NЗРАЗ {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());

    long[] nums = new long[3];

    char[] ops = {'*', '+', '-'};

    for (int i = 0; i < 3; i++) {
      nums[i] = Long.parseLong(st.nextToken());
    }

    long max = Long.MIN_VALUE;

    for (int i = 0; i < 3; i++) {
      for (int j = 0; j < 3; j++) {
        if (j == i) continue;
        for (int k = 0; k < 3; k++) {
          if (k == i || k == j) continue;

          for (int x = 0; x < 3; x++) {
            for (int y = 0; y < 3; y++) {
              if (y == x) continue;

              long val = eval(nums[i], nums[j], nums[k], ops[x], ops[y]);

              max = Math.max(max, val);
            }
          }
        }
      }
    }

    bw.write(max + "");

    bw.flush();
    br.close();
    bw.close();

  }

  static long calc(long a, long b, char op) {
    if (op == '+') return a + b;
    if (op == '-') return a - b;
    return a * b;
  }

  static long eval(long a, long b, long c, char o1, char o2) {
    if (o1 == '*') return calc(a * b, c, o2);
    if (o2 == '*') return calc(a, b * c, o1);
    return calc(calc(a, b, o1), c, o2);
  }
}
