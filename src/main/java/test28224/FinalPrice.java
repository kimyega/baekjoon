package test28224;

import java.io.*;

public class FinalPrice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int days = Integer.parseInt(br.readLine());
        int price = Integer.parseInt(br.readLine());
        int total = price;

        for (int i = 1; i <= days - 1; i++) {
            int good = Integer.parseInt(br.readLine());
            total += good;
        }

        bw.write(total + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
