package test31655;

import java.io.*;
import java.util.StringTokenizer;

public class InternationalDates {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine(), "/");

    int aa = Integer.parseInt(st.nextToken());
    int bb = Integer.parseInt(st.nextToken());
    int cc = Integer.parseInt(st.nextToken());

    String result = aa > 12 && bb <= 12 ? "EU" : aa <= 12 && bb > 12 ? "US" : "either";

    bw.write(result);

    bw.flush();

    bw.close();
    br.close();
  }
}
