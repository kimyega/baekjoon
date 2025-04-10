package test28295;

import java.io.*;

public class Exercise {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        char[] dir = {'N', 'E', 'S', 'W'};
        int index = 0;

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 1) {
                index = (index + 1) % 4;
            } else if (n == 2) {
                index = (index + 2) % 4;
            } else {
                index = (index + 3) % 4;
            }
        }

        char nowDir = dir[index];
        bw.write(nowDir + "");

        bw.flush();
        bw.close();
        br.close();
    }
}
