package test2975;

import java.io.*;
import java.util.StringTokenizer;

public class Transactions {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        String line = "";
        StringBuilder sb = new StringBuilder();

        while (!(line = br.readLine()).equals("0 W 0")) {
            st = new StringTokenizer(line);
            int balance = Integer.parseInt(st.nextToken());
            String type = st.nextToken();
            int amount = Integer.parseInt(st.nextToken());

            if (type.equals("W") && balance - amount < -200) {
                sb.append("Not allowed");
            } else if (type.equals("W")) {
                sb.append(balance - amount);
            } else if (type.equals("D")) {
                sb.append(balance + amount);
            }

            sb.append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
