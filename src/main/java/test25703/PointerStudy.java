package test25703;

import java.io.*;

public class PointerStudy {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String start = "int ", left, right, mid = " = ", end = ";\n", st = "*";

        int n = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();
        sb.append("int a;\n");

        for (int i = 1; i <= n; i++) {
            left = st.repeat(i) + "ptr" + (i == 1 ? "" : i);
            right = "&" + (i == 1 ? "a" : i == 2 ? "ptr" : "ptr" + (i - 1));

            sb.append(start).append(left).append(mid).append(right).append(end);
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
