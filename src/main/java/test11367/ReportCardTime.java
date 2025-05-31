package test11367;

import java.io.*;
import java.util.List;
import java.util.StringTokenizer;

public class ReportCardTime {

  static class GradeRange {
    int start, end;
    String grade;

    GradeRange(int start, int end, String grade) {
      this.start = start;
      this.end = end;
      this.grade = grade;
    }

    boolean matches (int value) {
      return start <= value && value <= end;
    }
  }

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    StringTokenizer st;
    StringBuilder sb = new StringBuilder();

    List<GradeRange> grades = List.of(
            new GradeRange(97, 100, "A+"),
            new GradeRange(90, 96, "A"),
            new GradeRange(87, 89, "B+"),
            new GradeRange(80, 86, "B"),
            new GradeRange(77, 79, "C+"),
            new GradeRange(70, 76, "C"),
            new GradeRange(67, 69, "D+"),
            new GradeRange(60, 66, "D"),
            new GradeRange(0, 59, "F")
    );

    int caseNo = Integer.parseInt(br.readLine());

    while (caseNo-- > 0) {
      String grade = "";
      st = new StringTokenizer(br.readLine());

      String name = st.nextToken();
      int score = Integer.parseInt(st.nextToken());

      for (GradeRange gr : grades) {
        if (gr.matches(score)) {
          grade = gr.grade;
          break;
        }
      }

      sb.append(name + " " + grade + "\n");
    }

    bw.write(sb.toString());

    bw.flush();
    bw.close();
    br.close();
  }
}
