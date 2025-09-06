package test26509;

import java.io.*;
import java.util.Arrays;

public class Triangle {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());

        while (n-- > 0) {
            int[] sides1 = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();

            int[] sides2 = Arrays.stream(br.readLine().split(" "))
                    .mapToInt(Integer::parseInt)
                    .sorted()
                    .toArray();

            sb.append(canCutRectangle(sides1, sides2) ? "YES" : "NO").append("\n");
        }

        bw.write(sb.toString());

        bw.flush();
        bw.close();
        br.close();

    }

    static boolean isRightTriangle(int[] sides) {
        return sides[0] * sides[0] + sides[1] * sides[1] == sides[2] * sides[2];
    }

    static boolean canCutRectangle(int[] sides1, int[] sides2) {
        if (!isRightTriangle(sides1) || !isRightTriangle(sides2)) return false;
        return sides1[2] == sides2[2] && sides1[1] == sides2[1];
    }
}
