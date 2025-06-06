package test17210;

import java.io.*;

public class DoorDoor {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    long n = Long.parseLong(br.readLine());
    int d = Integer.parseInt(br.readLine());

    StringBuilder sb = new StringBuilder();

    if (n > 5) {
      bw.write("Love is open door");
    } else {
      for (int i = 2; i <= n; i++) {
        d = d == 0 ? 1 : 0;
        sb.append(d).append("\n");
      }

      bw.write(sb.toString());
    }


    bw.flush();
    bw.close();
    br.close();
  }
}
