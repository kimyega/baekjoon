package test6749;

import java.io.*;

public class NextInLine {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int youngest = Integer.parseInt(br.readLine());
        int middle = Integer.parseInt(br.readLine());
        int oldest = middle * 2 - youngest;
        bw.write(oldest + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
