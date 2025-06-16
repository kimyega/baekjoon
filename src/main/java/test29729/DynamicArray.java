package test29729;

import java.io.*;
import java.util.StringTokenizer;

public class DynamicArray {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int size = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        int count = 0, caseNo = n + m;

        while (caseNo-- > 0) {
            String s = br.readLine();

            if (s.equals("1")) {
                if (count == size) {
                    size *= 2;
                }
                count++;
            } else {
                count--;
            }
        }

        bw.write(size + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
