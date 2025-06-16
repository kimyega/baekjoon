package test30822;

import java.io.*;

public class UOSPCCounter {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();

        int countU = 0, countO = 0, countS = 0, countP = 0, countC = 0;

        for (char ch : s.toCharArray()) {
            switch (ch) {
                case 'u': countU++; break;
                case 'o': countO++; break;
                case 's': countS++; break;
                case 'p': countP++; break;
                case 'c': countC++; break;
            }
        }

        int result = Math.min(countU, Math.min(countO, Math.min(countS, Math.min(countP, countC))));

        bw.write(result + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
