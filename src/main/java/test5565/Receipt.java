package test5565;

import java.io.*;

public class Receipt {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int totalPrice = Integer.parseInt(br.readLine());
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            sum += Integer.parseInt(br.readLine());
        }
        int resultPrice = totalPrice - sum;
        bw.write(resultPrice + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
