package test30642;

import java.io.*;

public class IgroosToilet {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String mascot = br.readLine();
        int k = Integer.parseInt(br.readLine());

        int res = 0;

        if (mascot.equals("annyong")) {
            if (k % 2 == 0) res = k - 1;
            else res = k;
        } else {
            if (k % 2 == 0) res = k;
            else if (k == 1) res = k + 1;
            else res = k - 1;
        }

        bw.write(res + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
