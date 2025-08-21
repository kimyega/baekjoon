package test8721;

import java.io.*;
import java.util.StringTokenizer;

public class Wykreslanka {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int reqNo = 1, result = 0;

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            if (num == reqNo) reqNo++;
            else result++;
        }

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
