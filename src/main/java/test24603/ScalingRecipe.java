package test24603;

import java.io.*;
import java.util.StringTokenizer;

public class ScalingRecipe {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            sb.append(a * y / x).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
