package test4458;

import java.io.*;
import java.util.StringJoiner;

public class UserAccount {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int caseNo = Integer.parseInt(br.readLine());

        StringJoiner sj = new StringJoiner("\n");

        while (caseNo-- > 0) {
            String s = br.readLine();

            char c = s.charAt(0);
            c = Character.toUpperCase(c);

            sj.add(c + s.substring(1));
        }

        bw.write(sj.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
