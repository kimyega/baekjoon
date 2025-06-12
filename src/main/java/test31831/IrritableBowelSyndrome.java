package test31831;

import java.io.*;
import java.util.StringTokenizer;

public class IrritableBowelSyndrome {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        int cnt = 0, stress = 0;

        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());

            stress += a;
            if (stress < 0) stress = 0;
            if (stress >= m) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
