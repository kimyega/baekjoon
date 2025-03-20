package test4101;

import java.util.ArrayList;
import java.util.Scanner;

public class Big {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    ArrayList<String> result = new ArrayList<>();

    while (sc.hasNextLine()) {
      String line = sc.nextLine().trim();
      String[] parts = line.split(" ");
      if (parts.length != 2) break;

      int firstNo = Integer.parseInt(parts[0]);
      int lastNo = Integer.parseInt(parts[1]);
      int tenThousand = 1000000;
      if (firstNo < 0 || firstNo > tenThousand || lastNo < 0 || lastNo > tenThousand || firstNo == 0 && lastNo == 0) {
        break;
      } else if (firstNo > lastNo) {
        result.add("Yes");
      } else result.add("No");
    }

    for (String s : result) {
      System.out.println(s);
    }
  }
}
