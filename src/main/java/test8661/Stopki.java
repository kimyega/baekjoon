package test8661;

import java.io.*;
import java.util.StringTokenizer;

public class Stopki {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        int a = Integer.parseInt(st.nextToken());

        int kd = 0, ad = x;

        boolean kozikTurn = true;

        while (kd < ad) {
            if (kozikTurn) kd += k;
            else ad -= a;
            kozikTurn = !kozikTurn;
        }


        bw.write(kozikTurn ? "0" : "1");
        bw.flush();
        bw.close();
        br.close();
    }
}
