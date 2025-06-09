package test31472;

import java.io.*;

public class PaperCutter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int w = Integer.parseInt(br.readLine());

        int res = (int) Math.sqrt((double) w / 2) * 8;

        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
