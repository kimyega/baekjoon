package test24723;

import java.io.*;

public class GreenTower {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int result = (int) Math.pow(2, num);
        bw.write(result + "");
        br.close();
        bw.flush();
        bw.close();
    }
}
