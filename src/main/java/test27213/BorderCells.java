package test27213;

import java.io.*;

public class BorderCells {
    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
       int m = Integer.parseInt(br.readLine());
       int n = Integer.parseInt(br.readLine());

        int colored = m < 3 || n < 3 ? m * n: (m + n) * 2 - 4;
        bw.write(colored +"");

        bw.flush();
        bw.close();
        br.close();
    }
}
