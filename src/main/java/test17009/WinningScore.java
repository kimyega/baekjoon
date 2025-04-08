package test17009;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WinningScore {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<Integer> ap = new ArrayList<>();
        List<Integer> bn = new ArrayList<>();

        for (int i = 0; i < 6; i++) {
            if (i < 3) {
                ap.add(Integer.parseInt(br.readLine()));
            } else {
                bn.add(Integer.parseInt(br.readLine()));
            }
        }

        int apScore = ap.get(0) * 3 + ap.get(1) * 2 + ap.get(2);
        int bnScore = bn.get(0) * 3 + bn.get(1) * 2 + bn.get(2);
        String result = apScore == bnScore ? "T" : apScore > bnScore ? "A" : "B";
        bw.write(result);

        bw.flush();
        bw.close();
        br.close();
    }
}
