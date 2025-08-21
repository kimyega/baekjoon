package test6845;

import java.io.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.StringTokenizer;

public class FederalVotingAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        LocalDate election = LocalDate.of(2007, 2, 27);

        while (n-- > 0) {
            st = new StringTokenizer(br.readLine());
            int year = Integer.parseInt(st.nextToken());
            int month = Integer.parseInt(st.nextToken());
            int day = Integer.parseInt(st.nextToken());

            LocalDate birth = LocalDate.of(year, month, day);
            int age = Period.between(birth, election).getYears();
            sb.append(age >= 18 ? "Yes" : "No").append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
