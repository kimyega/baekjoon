package test18964;

import java.io.*;
import java.util.Arrays;

public class Questionnaire {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        int[] answer = Arrays.stream(br.readLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int m = 1;

        StringBuilder sb = new StringBuilder();

        while (true) {
            m++;
            for (int k = 0; k < m; k++) {
                int finalM = m, finalK = k;
                long yes = Arrays.stream(answer).filter(i -> i % finalM == finalK).count();
                long no = answer.length - yes;
                if (yes >= no) {
                    System.out.println(m + " " + k);
                    return;
                }
            }
        }

    }
}
