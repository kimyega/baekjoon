package test2738;

import java.io.*;
import java.util.StringTokenizer;

public class MatrixAdder {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    st = new StringTokenizer(br.readLine());
    int n = Integer.parseInt(st.nextToken());
    int m = Integer.parseInt(st.nextToken());

    int[][] matrix = new int[n][m];
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j < n; j++) {
        st = new StringTokenizer(br.readLine());

        for (int k = 0; k < m; k++) {
          matrix[j][k] += Integer.parseInt(st.nextToken());
        }
      }
    }

    StringBuilder sb = new StringBuilder();

    for (int[] row : matrix) {
      for (int value : row) {
        sb.append(value + " ");
      }
      sb.append("\n");
    }

    sb.deleteCharAt(sb.length() - 1);
    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
