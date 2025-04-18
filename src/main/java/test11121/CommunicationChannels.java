package test11121;

import java.io.*;
import java.util.StringTokenizer;

public class CommunicationChannels {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseNo; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if (a.equals(b)) {
                sb.append("OK\n");
            } else {
                sb.append("ERROR\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
