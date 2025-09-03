package test25815;

import java.io.*;
import java.util.StringTokenizer;

public class CatsAge {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int year = Integer.parseInt(st.nextToken());
        int month = Integer.parseInt(st.nextToken());

        int humanMonth = 0, humanYear = 0;

        if (year < 1) {
            humanMonth = month * 15;
        } else if (year < 2) {
            humanYear += 15;
            humanMonth = month * 9;
        } else {
            humanYear += 16 + year * 4;
            humanMonth = month * 4;
        }

        humanYear += humanMonth / 12;
        humanMonth %= 12;

        bw.write(humanYear + " " + humanMonth);

        bw.flush();
        bw.close();
        br.close();
    }
}
