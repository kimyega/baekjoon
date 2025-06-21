package test5220;

import java.util.Scanner;

public class ErrorDetection {
  /* Given a value and a checkbit, return "true" if the check bit matches
   * up with the "value", and "false" otherwise. */
  private static boolean solveErrorDetection(int value, int checkbit) {
    boolean valid = false;

    /* ------------------- INSERT CODE HERE ---------------------*/

    String binary = Integer.toBinaryString(value);
    valid = binary.replace("0", "").length() % 2 == checkbit;


    /* -------------------- END OF INSERTION --------------------*/

    return valid;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int numCases = sc.nextInt();

    for(int i = 0; i < numCases; i++)
    {

      int value = sc.nextInt();

      int checkbit = sc.nextInt();

      if (solveErrorDetection(value, checkbit)) {
        System.out.println("Valid");
      }
      else {
        System.out.println("Corrupt");
      }
    }
  }
}
