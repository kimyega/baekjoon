package test4388;

import java.io.*;
import java.util.StringTokenizer;

public class CarryAdder {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while (true) {
            st = new StringTokenizer(br.readLine());
            String aStr = st.nextToken();
            String bStr = st.nextToken();

            if (aStr.equals("0") && bStr.equals("0")) break;

            int len = Math.max(aStr.length(), bStr.length());
            aStr = String.format("%" + len + "s", aStr).replace(' ', '0');
            bStr = String.format("%" + len + "s", bStr).replace(' ', '0');

            int carry = 0;
            int carryCount = 0;

            for (int i = len - 1; i >= 0; i--) {
                int digitA = aStr.charAt(i) - '0';
                int digitB = bStr.charAt(i) - '0';
                int sum = digitA + digitB + carry;

                if (sum >= 10) {
                    carry = 1;
                    carryCount++;
                } else {
                    carry = 0;
                }
            }

            sb.append(carryCount).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
