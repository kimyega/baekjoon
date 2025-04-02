package test25304;

import java.io.*;
import java.util.StringTokenizer;

public class Receipt {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int receiptPrice = Integer.parseInt(br.readLine());
        int itemCount = Integer.parseInt(br.readLine());

        int totalPrice = 0;
        for (int i = 0; i < itemCount; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int price  = Integer.parseInt(st.nextToken());
            int quantity = Integer.parseInt(st.nextToken());
            totalPrice += price * quantity;
        }
        if (receiptPrice != totalPrice) {
            bw.write("No\n");
        } else {
            bw.write("Yes\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
