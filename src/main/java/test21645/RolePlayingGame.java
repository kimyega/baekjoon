package test21645;

import java.io.*;
import java.util.StringTokenizer;

public class RolePlayingGame {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        int res = m < k ? n * m : n * ((k - 1) +  m / k);

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
