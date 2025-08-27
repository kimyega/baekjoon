package test20374;

import java.io.*;
import java.math.BigDecimal;

public class BigMoney {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line;
        BigDecimal total = BigDecimal.ZERO;


        while ((line = br.readLine()) != null) {
            BigDecimal spentMoney = new BigDecimal(line);
            total = total.add(spentMoney);
        }

        bw.write(total.setScale(2, BigDecimal.ROUND_UNNECESSARY).toPlainString());

        bw.flush();
        bw.close();
        br.close();
    }
}
