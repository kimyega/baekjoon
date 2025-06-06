package test17450;

import java.io.*;
import java.util.StringTokenizer;

public class SnackBuyer {
  static double calcCostEfficiency (int price, int weight) {
    price = price * 10 >= 5000 ? price * 10 - 500 : price * 10;
    weight = weight * 10;
    return weight / (double) price;
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    StringTokenizer st;

    char[] snack = {'S', 'N', 'U'};
    double maxCostEff = 0;
    char res = '0';

    for (int i = 0; i < snack.length; i++) {
      double costEff;
      st = new StringTokenizer(br.readLine());

      int price = Integer.parseInt(st.nextToken());
      int weight = Integer.parseInt(st.nextToken());

      costEff = calcCostEfficiency(price, weight);

      if (costEff > maxCostEff) {
        maxCostEff = costEff;
        res = snack[i];
      }
    }

    bw.write(res + "");

    bw.flush();
    bw.close();
    br.close();
  }

}
