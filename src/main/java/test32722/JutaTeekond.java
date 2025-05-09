package test32722;

import java.io.*;

public class JutaTeekond {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] input = new int[3];
        for (int i = 0; i < 3; i++) {
            input[i] = Integer.parseInt(br.readLine());
        }

        int[][] paths = {
                {1, 6, 2}, {1, 6, 5}, {1, 8, 2}, {1, 8, 5},
                {3, 6, 2}, {3, 6, 5}, {3, 8, 2}, {3, 8, 5}
        };

        boolean match = false;
        for (int[] path : paths) {
            if (input[0] == path[0] && input[1] == path[1] && input[2] == path[2]) {
                match = true;
                break;
            }
        }

        bw.write(match ? "JAH" : "EI");

        bw.flush();
        bw.close();
        br.close();
    }
}
