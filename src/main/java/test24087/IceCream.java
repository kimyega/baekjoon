package test24087;

import java.io.*;

public class IceCream {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int minIcHgt = Integer.parseInt(br.readLine());
        int icHgt = Integer.parseInt(br.readLine());
        int addHgt = Integer.parseInt(br.readLine());

        int minusHgt = minIcHgt < icHgt ? 0 : minIcHgt - icHgt;
        int minCharges = minusHgt % addHgt == 0 ? 250 + 100 * minusHgt / addHgt : 250 + 100 * (minusHgt / addHgt + 1);

        bw.write(minCharges + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
