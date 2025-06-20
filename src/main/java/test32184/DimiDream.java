package test32184;

import java.io.*;
import java.util.StringTokenizer;

public class DimiDream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int cnt = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());
        int start = Integer.parseInt(st.nextToken());
        int end = Integer.parseInt(st.nextToken());


        if (start % 2 == 0) cnt++;
        if (end % 2 == 1) cnt++;
        if (start % 2 == 1 && end % 2 == 0) end++;

        cnt += (end - start) / 2;

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
