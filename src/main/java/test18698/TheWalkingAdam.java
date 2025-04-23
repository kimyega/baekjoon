package test18698;

import java.io.*;

public class TheWalkingAdam {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < caseNo; i++) {
            String line = br.readLine();
            int count = 0;

            for (int j = 0; j < line.length(); j++) {
                if (line.charAt(j) == 'D') {
                    break;
                }
                count++;
            }
            sb.append(count + "\n");
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
