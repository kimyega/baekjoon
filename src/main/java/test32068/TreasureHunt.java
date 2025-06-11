package test32068;

import java.io.*;
import java.util.StringTokenizer;

public class TreasureHunt {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int index = 0;

        int caseNo = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        while (caseNo-- > 0) {
            st = new StringTokenizer(br.readLine());

            int left = Integer.parseInt(st.nextToken());
            int right = Integer.parseInt(st.nextToken());
            int startPoint = Integer.parseInt(st.nextToken());

            int leftToStart = startPoint - left;
            int rightToStart = right - startPoint;

            if (leftToStart < rightToStart){
                index = leftToStart * 2 + 1;
            }else {
                index = 2 * rightToStart;
            }

            sb.append(index).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
