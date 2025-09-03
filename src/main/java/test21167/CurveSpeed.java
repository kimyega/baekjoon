package test21167;

import java.io.*;
import java.util.StringTokenizer;

public class CurveSpeed {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        String line = "";
        while ((line = br.readLine()) != null) {
            st = new StringTokenizer(line);
            int R = Integer.parseInt(st.nextToken());
            double S = Double.parseDouble(st.nextToken());

            int V = (int) Math.round(Math.sqrt(R * (S + 0.16) / 0.067));
            sb.append(V).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
