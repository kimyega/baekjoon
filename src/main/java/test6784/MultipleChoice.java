package test6784;

import java.io.*;

public class MultipleChoice {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        char[] student = new char[n];
        int cnt = 0;

        for (int i = 0; i < n; i++) {
            student[i] = br.readLine().charAt(0);
        }

        for (int i = 0; i < n; i++) {
            char answer = br.readLine().charAt(0);
            if (answer == student[i]) cnt++;
        }

        bw.write(cnt + "\n");

        bw.flush();
        bw.close();
        br.close();
    }
}
