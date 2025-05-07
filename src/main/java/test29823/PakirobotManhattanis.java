package test29823;

import java.io.*;

public class PakirobotManhattanis {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int x = 0, y = 0;

        int n = Integer.parseInt(br.readLine());
        String line = br.readLine();

        for (char ch : line.toCharArray()) {

            switch (ch) {
                case 'E':   x++; break;
                case 'W':   x--; break;
                case 'N':   y++; break;
                case 'S':   y--; break;
                default: break;
            }
        }

        int res = Math.abs(x) + Math.abs(y);
        bw.write(res + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
