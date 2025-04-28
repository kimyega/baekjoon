package test30876;

import java.io.*;
import java.util.StringTokenizer;

public class TrenDelFinDelMundo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int min = Integer.MAX_VALUE;
        String s = "";

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            if (y <= min) {
                min = y;
                s = x + " " + y;
            }
        }

        bw.write(s);

        bw.flush();
        bw.close();
        br.close();
    }
}
