package test16503;

import java.io.*;
import java.util.StringTokenizer;

public class SimpleCalculator {
  static int calc(int a, int b, char op) {
    return op == '+' ? a + b : op == '-' ? a - b : op == '*' ? a * b : a / b;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    char op1 = st.nextToken().charAt(0);
    int b = Integer.parseInt(st.nextToken());
    char op2 = st.nextToken().charAt(0);
    int c = Integer.parseInt(st.nextToken());

    int res1 = calc(calc(a, b, op1), c, op2);
    int res2 = calc(a, calc(b, c, op2), op1);

    bw.write(Math.min(res1, res2) + "\n" + Math.max(res1, res2));

    bw.flush();
    bw.close();
    br.close();
  }
}
