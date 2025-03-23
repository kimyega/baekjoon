package test20492;

import java.util.Scanner;

public class Tax {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int prizeMoney = sc.nextInt();
    if (prizeMoney < 1000 || prizeMoney > 10000000 || prizeMoney % 1000 != 0) return;

    int taxed = prizeMoney * 78 / 100;
    int moreTaxed = prizeMoney * 80 / 100 + taxed * 20 / 100;
    System.out.println(taxed + " " + moreTaxed);
  }
}
