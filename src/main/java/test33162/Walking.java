package test33162;

import java.io.*;

public class Walking {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = Integer.parseInt(br.readLine());

        int res = x % 2 == 0 ? x / 2 : x / 2 + 3;
        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
