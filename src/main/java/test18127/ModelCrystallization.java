package test18127;

import java.io.*;
import java.util.StringTokenizer;

public class ModelCrystallization {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());

        long result = ((b + 1) * (2 + (long) b * (a - 2))) / 2;

        bw.write(result + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
