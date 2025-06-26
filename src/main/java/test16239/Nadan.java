package test16239;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Nadan {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int k = Integer.parseInt(br.readLine());
        int n = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            list.add(i);
        }

        int sum = n * (n + 1) / 2;
        int left = k - sum;
        int remain = left % n;

        for (int i = 0; i < n; i++) {
            list.set(i, list.get(i) + left / n);
        }

        list.set(n - 1, list.get(n - 1) + remain);

        for (int l : list) {
            bw.write(l + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
