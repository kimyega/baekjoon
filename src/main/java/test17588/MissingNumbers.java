package test17588;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MissingNumbers {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        List<Integer> numList = new ArrayList<Integer>();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            numList.add(num);
        }

        for (int i = 1; i <= numList.get(n - 1); i++) {
            if (!numList.contains(i)) sb.append(i + "\n");
        }

        bw.write(sb.length() == 0 ? "good job" : sb.toString());

        bw.flush();
        bw.close();
        br.close();
    }
}
