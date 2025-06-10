package test31628;

import java.io.*;

public class BundleOfEggplants {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[][] m = new String[10][10];

        for (int i = 0; i < 10; i++) m[i] = br.readLine().split(" ");

        boolean found = false;

        for (int i = 0; i < 10; i++) {
            if (isUniformRow(m, i) || isUniformCol(m, i)) {
                found = true;
                break;
            }
        }

        bw.write(found ? "1" : "0");

        bw.flush();
        bw.close();
        br.close();
    }

    static boolean isUniformRow(String[][] m, int row) {
        for (int j = 1; j < 10; j++)
            if (!m[row][j].equals(m[row][0])) return false;
        return true;
    }

    static boolean isUniformCol(String[][] m, int col) {
        for (int i = 1; i < 10; i++)
            if (!m[i][col].equals(m[0][col])) return false;
        return true;
    }
}
