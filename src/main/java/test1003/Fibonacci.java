package test1003;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Fibonacci {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int caseNo = sc.nextInt();

    int maxN = 40;  // n의 최대값
    int[] zeroCount = new int[maxN + 1];
    int[] oneCount = new int[maxN + 1];

    // ✅ 피보나치 호출 횟수를 반복문으로 미리 계산
    zeroCount[0] = 1;
    oneCount[0] = 0;
    zeroCount[1] = 0;
    oneCount[1] = 1;

    for (int i = 2; i <= maxN; i++) {
      zeroCount[i] = zeroCount[i - 1] + zeroCount[i - 2];
      oneCount[i] = oneCount[i - 1] + oneCount[i - 2];
    }
    List<Integer[]> list = new ArrayList<>();
    for (int i = 0; i < caseNo; i++) {
      Integer[] counts = new Integer[2];
      int n = sc.nextInt();
      counts[0] = zeroCount[n];
      counts[1] = oneCount[n];
      list.add(counts);
    }
    for (Integer[] counts : list) {
      System.out.println(counts[0] + " " + counts[1]);
    }
  }
}
