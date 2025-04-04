package test5524;

import java.io.*;

public class EntryManager {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while (caseNo-- > 0) {
            sb.append(br.readLine().toLowerCase() + "\n");
        }
        bw.write(sb.toString());
        br.close();
        bw.flush();
        bw.close();
    }
}
