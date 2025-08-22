package test21614;

import java.io.*;

public class SecretInstructions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String line = "";
        String direction = "";
        StringBuilder sb = new StringBuilder();

        while (true) {
            line = br.readLine();
            if (line.equals("99999")) break;

            int preSum = (line.charAt(0) - '0') + (line.charAt(1) - '0');
            int move = Integer.parseInt(line.substring(2));

            direction = preSum == 0 ? direction : preSum % 2 == 0 ? "right" : "left";

            sb.append(direction).append(" ").append(move).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
