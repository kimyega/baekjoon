package test25640;

import java.io.*;

public class MBTI {
  public static void main(String[] args) throws Exception {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    String mbti = br.readLine();
    int n = Integer.parseInt(br.readLine());
    int count = 0;
    for (int i = 0; i < n; i++) {
      String othMbti = br.readLine();
      if (mbti.equals(othMbti)) count++;
    }
    bw.write(count + "\n");

    bw.flush();
    bw.close();
    br.close();
  }
}
