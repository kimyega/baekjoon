package test25858;

import java.io.*;
import java.util.StringTokenizer;

public class DivideTheCash {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int caseNo = Integer.parseInt(st.nextToken());
    int prize = Integer.parseInt(st.nextToken());

    int sum = 0, prizePerSum = 0;
    int[] problems = new int[caseNo];

    for (int i = 0; i < caseNo; i++) {
      int n = Integer.parseInt(br.readLine());
      problems[i] = n;
      sum += n;
    }

    prizePerSum = prize / sum;

    for (int problem : problems) {
      bw.write(problem * prizePerSum + "\n");
    }


    bw.flush();
    bw.close();
    br.close();
  }
}
