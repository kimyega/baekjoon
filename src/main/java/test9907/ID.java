package test9907;

import java.io.*;

public class ID {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String nStr = br.readLine();

        int[] weights = {2, 7, 6, 5, 4, 3, 2};
        int sum = 0;

        for (int i = 0; i < 7; i++) {
            int digit = nStr.charAt(i) - '0';
            sum += digit * weights[i];
        }

        int remainder = sum % 11;

        char[] map = {'J', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'Z'};

        bw.write(map[remainder] + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
