package test21312;

import java.io.*;
import java.util.*;

public class EvenOddCocktail {

  static class Cocktail {
    List<Integer> all = new ArrayList<>();
    List<Integer> odd = new ArrayList<>();

    void add(int n) {
      if (n % 2 != 0) {
        odd.add(n);
      }

      all.add(n);
    }

    int getMax() {
      Collections.sort(all, Collections.reverseOrder());
      return odd.size() == 1 ? odd.get(0) : odd.size() == 2 ? odd.get(0) * odd.get(1) : all.get(0) * all.get(1) * all.get(2);
    }
  }


  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    Cocktail cocktail = new Cocktail();

    StringTokenizer st = new StringTokenizer(br.readLine());

    while (st.hasMoreTokens()) {
      cocktail.add(Integer.parseInt(st.nextToken()));
    }

    bw.write(cocktail.getMax() + "");

    bw.flush();
    bw.close();
    br.close();
  }
}
