package test10156;

import java.io.*;
import java.util.StringTokenizer;

public class Snack {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int price = Integer.parseInt(st.nextToken());
        int quantity = Integer.parseInt(st.nextToken());
        int currentMoney = Integer.parseInt(st.nextToken());
        int amountDue = price * quantity - currentMoney;
        if (amountDue < 0) {
            amountDue = 0;
        }
        bw.write(amountDue + "\n");
        br.close();
        bw.flush();
        bw.close();
    }
}
