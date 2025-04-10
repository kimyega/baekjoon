package test4714;

import java.io.*;

public class Lunacy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();
        while (true) {
            double weight = Double.parseDouble(br.readLine());
            String str = String.format("%.2f", weight);
            if (weight < 0) break;

            double moonWeight = Math.round(weight * 0.167 * 100.0) / 100.0;
            String moonStr = String.format("%.2f", moonWeight);

            String line = "Objects weighing " + str + " on Earth will weigh " + moonStr + " on the moon.\n";
            sb.append(line);
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
