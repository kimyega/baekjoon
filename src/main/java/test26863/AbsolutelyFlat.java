package test26863;

import java.io.*;

public class AbsolutelyFlat {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] legs = new int[4];
        for (int i = 0; i < 4; i++) {
            legs[i] = Integer.parseInt(br.readLine());
        }
        int b = Integer.parseInt(br.readLine());

        if (allEqual(legs)) {
            System.out.println(1);
            return;
        }

        for (int i = 0; i < 4; i++) {
            int original = legs[i];
            legs[i] += b;
            if (allEqual(legs)) {
                System.out.println(1);
                return;
            }
            legs[i] = original;
        }

        bw.write(0 + "");

        bw.flush();
        bw.close();
        br.close();
    }

    static boolean allEqual(int[] arr) {
        return arr[0] == arr[1] && arr[1] == arr[2] && arr[2] == arr[3];
    }
}
