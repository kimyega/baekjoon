package test10707;

import java.io.*;

public class WaterBillCalculator {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int x = 0, y = 0;

        int xCharge = Integer.parseInt(br.readLine());
        int yCharge = Integer.parseInt(br.readLine());
        int limit = Integer.parseInt(br.readLine());
        int extraCharge = Integer.parseInt(br.readLine());
        int waterUsage = Integer.parseInt(br.readLine());

        x = xCharge * waterUsage;
        y = waterUsage <= limit ? yCharge: yCharge + extraCharge * (waterUsage - limit);

        bw.write(Math.min(x, y) + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
