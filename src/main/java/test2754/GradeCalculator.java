package test2754;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class GradeCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Map<String, Double> grades = new HashMap<>();
        grades.put("A+", 4.3);
        grades.put("A0", 4.0);
        grades.put("A-", 3.7);
        grades.put("B+", 3.3);
        grades.put("B0", 3.0);
        grades.put("B-", 2.7);
        grades.put("C+", 2.3);
        grades.put("C0", 2.0);
        grades.put("C-", 1.7);
        grades.put("D+", 1.3);
        grades.put("D0", 1.0);
        grades.put("D-", 0.7);
        grades.put("F", 0.0);

        String grade = br.readLine();
        bw.write(grades.get(grade) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
