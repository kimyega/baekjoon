package test9316;

import java.io.*;

public class HelloJudge {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        for (int i = 0; i < num; i++) {
            bw.write("Hello World, Judge " + (i + 1) + "!\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
