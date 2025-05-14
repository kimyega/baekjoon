package test10833;

import java.io.*;
import java.util.StringTokenizer;

public class Apple {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int left = 0;

        int caseNo = Integer.parseInt(br.readLine());

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int students = Integer.parseInt(st.nextToken());
            int apples = Integer.parseInt(st.nextToken());

            left += apples % students;
        }


        bw.write(left + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
