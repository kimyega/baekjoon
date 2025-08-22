package test11295;

import java.io.*;

public class Exercising {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        int userNo = 0;

        while (true) {
            userNo++;

            int l = Integer.parseInt(br.readLine().trim());
            if (l == 0) break;

            int n = Integer.parseInt(br.readLine().trim());

            sb.append("User " + userNo + "\n");

            for (int i = 0; i < n; i++) {
                double steps = Double.parseDouble(br.readLine());
                double distance = steps * l / 100000;
                sb.append(String.format("%.5f\n", distance));
            }
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
