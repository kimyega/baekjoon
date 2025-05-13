package test10886;

import java.io.*;

public class CuteOrNot {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cute = 0;

        int caseNo = Integer.parseInt(br.readLine());

        for (int i = 0; i < caseNo; i++) {
            String survey = br.readLine();
            if (survey.equals("1")) {
                cute++;
            }
        }

        String isCute = cute > caseNo / 2 ? "" : " not";
        bw.write("Junhee is" + isCute + " cute!");

        bw.flush();
        bw.close();
        br.close();
    }
}
