package test29546;

import java.io.*;
import java.util.StringTokenizer;

public class PhotoSelector {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        int photoNo = Integer.parseInt(br.readLine());
        String[] photos = new String[photoNo];

        for (int i = 0; i < photoNo; i++) {
            photos[i] = br.readLine();
        }

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());

            for (int i = start; i <= end; i++) {
                sb.append(photos[i - 1] + "\n");
            }
        }

        sb.deleteCharAt(sb.length() - 1);
        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
