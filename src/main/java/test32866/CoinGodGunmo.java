package test32866;

import java.io.*;

public class CoinGodGunmo {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int x = Integer.parseInt(br.readLine());

        double lossAmount = n * x / 100.0;
        double afterLoss = n - lossAmount;
        double reqRate = lossAmount / afterLoss * 100.0;

        bw.write(reqRate + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
