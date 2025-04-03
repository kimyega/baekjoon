package test15439;

import java.io.*;

public class VeraFashion {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int result = n * (n - 1);
        bw.write(result + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
