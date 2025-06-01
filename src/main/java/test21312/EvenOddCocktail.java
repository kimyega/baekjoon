package test21312;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class EvenOddCocktail {

  static class Cocktail {
    List<Integer> even = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    Cocktail (int n) {
      if (n % 2 == 0) {
        this.even.add(n);
      } else {
        this.odd.add(n);
      }
    }


  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st = new StringTokenizer(br.readLine());
    int a = Integer.parseInt(st.nextToken());
    int b = Integer.parseInt(st.nextToken());
    int c = Integer.parseInt(st.nextToken());


  }
}
