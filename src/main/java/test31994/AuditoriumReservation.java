package test31994;

import java.io.*;
import java.util.StringTokenizer;

public class AuditoriumReservation {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    int count  = 7, max = Integer.MIN_VALUE;
    String user = "";

    while (count-- > 0) {
      StringTokenizer st = new StringTokenizer(br.readLine());
      String name = st.nextToken();
      int n = Integer.parseInt(st.nextToken());

      user = max < n ? name : user;
      max = Math.max(n, max);
    }

    bw.write(user);

    bw.flush();
    bw.close();
    br.close();
  }
}
