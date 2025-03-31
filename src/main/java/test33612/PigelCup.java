package test33612;

import java.time.LocalDate;
import java.util.Scanner;

public class PigelCup {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nth = sc.nextInt();
        if (nth < 1 || nth > 5) return;

        LocalDate firstDate = LocalDate.of(2024, 1, 1);
        LocalDate nthDate = firstDate.plusMonths(nth * 7 );
        int year = nthDate.getYear();
        int month = nthDate.getMonthValue();
        System.out.println(year + " " + month);
    }
}
