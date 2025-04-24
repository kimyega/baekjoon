package test21638;

import java.io.*;
import java.util.StringTokenizer;

public class SMSFromMCHS {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st1 = new StringTokenizer(br.readLine());
    StringTokenizer st2 = new StringTokenizer(br.readLine());

    int t1 = Integer.parseInt(st1.nextToken());
    int v1 = Integer.parseInt(st1.nextToken());
    int t2 = Integer.parseInt(st2.nextToken());
    int v2 = Integer.parseInt(st2.nextToken());

    if (t2 < 0 && v2 >= 10) {
      bw.write("A storm warning for tomorrow! Be careful and stay home if possible!");
    } else if (t1 > t2) {
      bw.write("MCHS warns! Low temperature is expected tomorrow.");
    } else if (v1 < v2) {
      bw.write("MCHS warns! Strong wind is expected tomorrow.");
    } else {
      bw.write("No message");
    }

    bw.flush();
    bw.close();
    br.close();
  }
}
