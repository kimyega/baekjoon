package test5532;

import java.io.*;

public class VacationHomework {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int vacationDays = Integer.parseInt(br.readLine());
        int korPages = Integer.parseInt(br.readLine());
        int mathPages = Integer.parseInt(br.readLine());
        int dailyKorPages = Integer.parseInt(br.readLine());
        int dailyMathPages = Integer.parseInt(br.readLine());

        int korDays = korPages % dailyKorPages == 0 ? korPages / dailyKorPages : korPages / dailyKorPages + 1;
        int mathDays = mathPages % dailyMathPages == 0 ? mathPages / dailyMathPages : mathPages / dailyMathPages + 1;
        int workDays = Math.max(korDays, mathDays);

        int result = vacationDays - workDays;
        bw.write(result + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
