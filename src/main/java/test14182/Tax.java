package test14182;

import java.io.*;

public class Tax {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        while (true) {
            int income = Integer.parseInt(br.readLine());
            if (income == 0) break;
            int tax = income <= 1000000 ? 0 : income <= 5000000 ? income / 10 : income / 5;

            sb.append(income - tax).append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
