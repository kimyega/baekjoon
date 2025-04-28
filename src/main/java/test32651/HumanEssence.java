package test32651;

import java.io.*;

public class HumanEssence {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int y = Integer.parseInt(br.readLine());

        String res = y <= 100000 && y % 2024 == 0 ? "Yes" : "No";
        bw.write(res);

        bw.flush();
        bw.close();
        br.close();
    }
}
