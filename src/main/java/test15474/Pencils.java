package test15474;

import java.io.*;
import java.util.StringTokenizer;

public class Pencils {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());
        int aPrice = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int bPrice = Integer.parseInt(st.nextToken());

        int aTp = totalPriceCalc(n, a, aPrice);
        int bTp = totalPriceCalc(n, b, bPrice);

        int res = Math.min(aTp, bTp);
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
    static int totalPriceCalc(int n, int num, int price) {
        int totalPrice = 0;

        totalPrice = price * (n / num);
        if (n % num != 0) {
            totalPrice += price;
        }
        return totalPrice;
    }
}
